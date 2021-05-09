package business.abstracts;

import java.util.List;

import entities.concerets.User;

public interface AuthService {
	
		boolean login(String email,String password);
	 
		List<User> getAll();
	 
		boolean register(User user);
		void accountActivetedLincClink(User user) ;
		
	 
}



