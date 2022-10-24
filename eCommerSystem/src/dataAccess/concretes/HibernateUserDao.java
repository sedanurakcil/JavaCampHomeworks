package dataAccess.concretes;

import java.util.ArrayList;


import dataAccess.abstracts.UserDao;
import entities.concerets.User;

public class HibernateUserDao implements UserDao{


	private ArrayList <User> userArray = new ArrayList<>();
	
	/**
	 * @param userArray
	 */
	public HibernateUserDao() {}
	
	public HibernateUserDao(ArrayList<User> userArray) {
		super();
		this.userArray = userArray;
	}

	public void addtoUser(User user) {
		System.out.println("Hibernate ile eklendi" + user.getName());
		userArray.add(user);
	}

	@Override
	public void logintoUser(User user) {
		// TODO Auto-generated method stub
		
	}
	
	public ArrayList<User> getAll(){
		
		return userArray;
	}
	

}
