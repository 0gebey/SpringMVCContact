package net.ogeday.etsTurTask.contacsDAO;

import java.util.List;

import net.ogeday.etsTurTask.model.Contacts;

public interface ContactsDAO {

	public int save(Contacts contact);

	public int delete(Integer id);

	public int update(Contacts contact);

	public Contacts get(Integer id);

	public List<Contacts> list();

}
