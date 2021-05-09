
import java.util.ArrayList;

import business.abstracts.UserService;
import business.concretes.AuthManager;
import business.concretes.UserManager;
import dataAccess.concretes.HibernateUserDao;
import entities.concerets.User;
import core.concretes.GoogleManagerAdaptor;

public class Main {

	public static void main(String[] args) {
		 
		
		User user = new User("Sedanur ","Akcil","sedaakcil@gmail.com","1234567",true);
		User user1 = new User("S ","Ak","sedal@gmail.com","1234567",true);
		
		User user2= new User("Seda","Akcil","sedaakcil@gmail.com","1234567",true);
		User user3 = new User("Sed ","Akcil","sedaakcil@gmail.com","12347",true);
		
		UserService userservice = new UserManager(new AuthManager(new HibernateUserDao(new ArrayList<User>())),new GoogleManagerAdaptor());
		
		userservice.addtoUser(user);
		userservice.addtoUser(user1);
		userservice.addtoUser(user2);
		userservice.addtoUser(user3);
		userservice.logintoUser(user.getEmail(), user.getPassword());
		userservice.logintoUser(user1.getEmail(), user1.getPassword());
		
	}

}
