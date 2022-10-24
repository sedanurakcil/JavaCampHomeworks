package dataAccess.abstracts;

import java.util.ArrayList;

import entities.concerets.User;

public interface UserDao {
	
	
	void addtoUser(User user);
	void logintoUser(User user);
	ArrayList<User> getAll();

}
