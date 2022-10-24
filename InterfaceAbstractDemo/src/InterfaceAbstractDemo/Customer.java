package InterfaceAbstractDemo;

import java.util.Date;

public class Customer {

	public int id ;
	public String firstName;
	public String lastName;
	public Date DateOfBirth;
	public String NationallyId;
	
	public Customer() {
		
	}
	
	public Customer(int id, String firstName, String lastName, Date dateOfBirth, String nationallyId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		DateOfBirth = dateOfBirth;
		NationallyId = nationallyId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDateOfBirth() {
		return DateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}

	public String  getNationallyId() {
		return NationallyId;
	}

	public void setNationallyId(String nationallyId) {
		NationallyId = nationallyId;
	}
	
	
}
