package net.ogeday.etsTurTask.contacsDAO;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import net.ogeday.etsTurTask.model.Contacts;

class ContactsDAOTest {

	private DriverManagerDataSource dataSource;
	private ContactsDAO dao;

	@BeforeEach
	void setupDB() {
		dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/etsturtask");
		dataSource.setUsername("root");
		dataSource.setPassword("root");

		dao = new ContactsDAOImp(dataSource);
	}

	@Test
	void testSave() {

		Contacts contact = new Contacts("Onur", "Aslan", "A+", "5087432215", "Muratpasa Antalya");
		int result = dao.save(contact);
		assertTrue(result > 0);
	}

	@Test
	void testDelete() {
		Integer id = 3;
		int result = dao.delete(id);

		assertTrue(result > 0);
	}

	@Test
	void testUpdate() {
		Contacts contact = new Contacts(2, "Onur", "Çelik", "A+", "5087432216", "Muratpasa Antalya");
		int result = dao.update(contact);
		assertTrue(result > 0);
	}

	@Test
	void testGet() {
		Integer id = 1;
		Contacts contact = dao.get(id);
		if (contact != null) {
			System.out.println(contact);
		}
		assertNotNull(contact);
	}

	@Test
	void testList() {
		List<Contacts> listContacts = dao.list();
		System.out.println(listContacts);

		assertTrue(listContacts.isEmpty());
	}

}
