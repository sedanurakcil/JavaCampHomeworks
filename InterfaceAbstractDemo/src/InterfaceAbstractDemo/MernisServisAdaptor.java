package InterfaceAbstractDemo;

import tr.gov.nvi.tckimlik.WS.*;

import java.rmi.RemoteException;


public class MernisServisAdaptor implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer)  {
	
		KPSPublicSoapProxy client  = new KPSPublicSoapProxy();
		
		try {
			return client.TCKimlikNoDogrula(Long.parseLong(customer.getNationallyId()),(customer.getFirstName().toUpperCase()) ,
					(customer.getLastName().toUpperCase()), (customer.getDateOfBirth().getYear()));
			
		} catch (RemoteException e) {
			
			e.printStackTrace();
		}
		return false;
		
	}

}
