package business.concretes;



import business.abstracts.AuthService;
import business.abstracts.UserService;
import core.abstracts.GoogleService;
import dataAccess.abstracts.UserDao;
import entities.concerets.User;

public class UserManager implements UserService {

	
	private AuthService authService;
	private GoogleService googleService;
	

	public UserManager() {

	}



	public UserManager( AuthService authService, GoogleService googleService) {
		super();
	
		this.authService = authService;
		this.googleService = googleService;
	}



	@Override
	public void addtoUser(User user) {

		if (authService.register(user)) {

			authService.accountActivetedLincClink(user);
			googleService.registerToGoogle(user.getName());
		}

	}

	@Override
	public void logintoUser(String email , String password) {
		
		if(authService.login(email, password)) {
			System.out.println("Login Succsessful");
			
		}
		else {
			System.out.println(" Login in unsuccessful Please try Again");
			
		}
			
	}


	
}
