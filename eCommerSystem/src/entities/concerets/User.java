package entities.concerets;

public class User {
	
	private String name;
	private  String surname;
	private String  email;
	private String password;
	private boolean accountActivated;
	
	/**
	 * @param name
	 * @param surname
	 * @param email
	 * @param password
	 * @param accountActivated
	 */
	public User() {}
	
	public User(String name, String surname, String email, String password, boolean accountActivated) {
		super();
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.password = password;
		this.accountActivated = accountActivated;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isAccountActivated() {
		return accountActivated;
	}

	public void setAccountActivated(boolean accountActivated) {
		this.accountActivated = accountActivated;
	}
	
	

}
