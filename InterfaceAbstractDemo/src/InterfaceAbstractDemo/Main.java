package InterfaceAbstractDemo;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new StarBucksCustomerManager(new MernisServisAdaptor());
		 customerManager.Save(new Customer(1,"Sedanur","Akçil", new Date(2000,5,7),"12345678"));
		
		 	
	}

}
