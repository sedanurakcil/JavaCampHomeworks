package core.concretes;

import Google.GoogleManager;
import core.abstracts.GoogleService;

public class GoogleManagerAdaptor implements GoogleService{

	
	public GoogleManagerAdaptor() {}
	
	@Override
	public void registerToGoogle(String message) {
		
		GoogleManager googleManager = new GoogleManager();
		
		googleManager.register(message);
		
	}

}
