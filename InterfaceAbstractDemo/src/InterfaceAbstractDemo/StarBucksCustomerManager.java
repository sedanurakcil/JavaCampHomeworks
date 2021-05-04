package InterfaceAbstractDemo;

public class StarBucksCustomerManager  extends BaseCustomerManager  {

	private CustomerCheckService _customerCheckService;
	
	public StarBucksCustomerManager(CustomerCheckService customerCheckService) {
		
		this._customerCheckService = customerCheckService;
	}

	public void Save(Customer customer) {
		
		
		if(_customerCheckService.checkIfRealPerson(customer)) {
			
			super.Save(customer);
		
		}
		else {
			System.out.println("Not a valid Person");
		}
		
	}

	
}
