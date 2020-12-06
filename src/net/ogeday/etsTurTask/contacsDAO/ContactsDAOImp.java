package net.ogeday.etsTurTask.contacsDAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import net.ogeday.etsTurTask.model.Contacts;

public class ContactsDAOImp implements ContactsDAO {

	private JdbcTemplate jdbcTemplate;

	public ContactsDAOImp(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public int save(Contacts c) {
		String sql = "INSERT INTO Contact (name , surname, blood, phone, adress) VALUES (?, ?, ?, ?, ?)";
		return jdbcTemplate.update(sql, c.getName(), c.getSurname(), c.getBlood(), c.getPhone(), c.getAdress());
	}

	@Override
	public int delete(Integer id) {
		String sql = "DELETE FROM Contact WHERE contact_id=" + id;
		return jdbcTemplate.update(sql);
	}

	@Override
	public int update(Contacts c) {
		String sql = "UPDATE Contact SET name=?, surname=?, blood=?, phone=?, adress=? WHERE contact_id=?";
		return jdbcTemplate.update(sql, c.getName(), c.getSurname(), c.getBlood(), c.getPhone(), c.getAdress(),
				c.getId());

	}

	@Override
	public Contacts get(Integer id) {
		String sql = "SELECT * FROM Contact WHERE contact_id=" + id;
		ResultSetExtractor<Contacts> extractor = new ResultSetExtractor<Contacts>() {

			@Override
			public Contacts extractData(ResultSet rs) throws SQLException, DataAccessException {
				if (rs.next()) {
					String name = rs.getString("name");
					String surname = rs.getString("surname");
					String blood = rs.getString("blood");
					String phone = rs.getString("phone");
					String adress = rs.getString("adress");
					return new Contacts(id, name, surname, blood, phone, adress);
				}
				return null;
			}

		};
		return jdbcTemplate.query(sql, extractor);
	}

	@Override
	public List<Contacts> list() {
		String sql = "SELECT * FROM Contact ORDER BY contact_id";

		RowMapper<Contacts> rowMapper = new RowMapper<Contacts>() {

			@Override
			public Contacts mapRow(ResultSet rs, int rowNum) throws SQLException {
				Integer id = rs.getInt("contact_id");
				String name = rs.getString("name");
				String surname = rs.getString("surname");
				String blood = rs.getString("blood");
				String phone = rs.getString("phone");
				String adress = rs.getString("adress");
				return new Contacts(id, name, surname, blood, phone, adress);
			}

		};
		return jdbcTemplate.query(sql, rowMapper);

	}

}
