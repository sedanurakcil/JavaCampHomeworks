package business.concretes;

import java.util.List;


import java.util.regex.Pattern;

import business.abstracts.AuthService;
import dataAccess.abstracts.UserDao;
import entities.concerets.User;

public class AuthManager implements AuthService {
	
	private static final String EMAIL_PATTERN = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";

	int minNameLength= 2;
	private UserDao userDao;

	public AuthManager(UserDao userDao) {
		
		this.userDao = userDao;
	}

	@Override
	public boolean login(String mail, String password) {
		
		 List<User> users= this.getAll();
		
		for(User user : users ) {
			
			if(user.getEmail().equals(mail)  && user.getPassword().equals(password)) {
				
				return true;
			}	
			
		}
		return false;
		
		
	}

	@Override
	public List<User> getAll() {
		
		return this.userDao.getAll();
	}
	
	public static boolean isEmailValid(User user ) {
		Pattern pattern = Pattern.compile(EMAIL_PATTERN,
		Pattern.CASE_INSENSITIVE);
		return pattern.matcher(user.getEmail()).find();
		}
	@Override
	public boolean register(User user) {
		
		if(user.getName().length() <= minNameLength) {
			
			System.out.println("User name must be more than 2 character");
			
			return false ;
		}
		else if(user.getSurname().length()<=  minNameLength ) {
			
			System.out.println("user surname must be more than 2 character ");
			
			return false;
			
		}
		else if(user.getPassword().length()<6) {
			System.out.println("User password must be more than 6 character");
			
			return false;
			
		}
		else if(!isEmailValid(user)) {
			
			System.out.println("Email is not valid");
			
			return false;
		
			
		}
		
		 List<User> users  = this.getAll();
		 
		 for(User control: users){
			 
			if(user.getEmail().equals(control.getEmail())== true);{
			 
			 
			 System.out.println("this email already exists");
			 
			 return false;
			 }	
		 }
		 
		 
			 userDao.addtoUser(user);

				System.out.println("verification message send to email");
		 
		 return true;
		 
		 }
		
			
	
	
	
	
	public void accountActivetedLincClink(User user) {
		
		user.setAccountActivated(true);
		
		System.out.println(" Verification is successful ");
		
		
	}
	
	 
}
