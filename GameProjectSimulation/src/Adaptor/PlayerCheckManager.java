package Adaptor;



import java.rmi.RemoteException;

import Entities.Player;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class PlayerCheckManager implements PlayerCheckService {

	@Override
	public boolean checkIfRealPlayer(Player player) {
		
		KPSPublicSoapProxy client  = new KPSPublicSoapProxy();
		
		boolean result = false;
		
		
		try {
			result = client.TCKimlikNoDogrula(Long.parseLong(player.getNationallyId()),player.getName() ,player.getSurname(),
						player.getLocalDate().getYear());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			
			e.printStackTrace();
		}
	
		return result;
		
	}

}
 