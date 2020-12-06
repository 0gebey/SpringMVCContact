package net.ogeday.etsTurTask.model;

public class Contacts {

	private Integer id;
	private String name;
	private String surname;
	private String blood;
	private String phone;
	private String adress;

	public Contacts(Integer id, String name, String surname, String blood, String phone, String adress) {

		this(name, surname, blood, phone, adress);
		this.id = id;

	}
	
	public Contacts() {
		
	}
	public Contacts(String name, String surname, String blood, String phone, String adress) {
		super();
		this.name = name;
		this.surname = surname;
		this.blood = blood;
		this.phone = phone;
		this.adress = adress;
	}

	@Override
	public String toString() {
		return "Contacts [id=" + id + ", name=" + name + ", surname=" + surname + ", blood=" + blood + ", phone="
				+ phone + ", adress=" + adress + "]";
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBlood() {
		return blood;
	}

	public void setBlood(String blood) {
		this.blood = blood;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

}
