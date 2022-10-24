package Entities;


import java.util.Date;

public class Player implements Entity{
	
	private int id;
	private String name;
	private String surname;
	private String nationallyId;
	private Date localDate;

	public Player() {
		
	}
	
	
	public Player(int id, String name, String surname, String nationallyId,Date localDate) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.nationallyId = nationallyId;
		this.localDate = localDate;
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSurname() {
		return surname;
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}


	public String getNationallyId() {
		return nationallyId;
	}


	public void setNationallyId(String nationallyId) {
		this.nationallyId = nationallyId;
	}


	public Date getLocalDate() {
		return localDate;
	}


	public void setLocalDate(Date localDate) {
		this.localDate = localDate;
	}
	

}
