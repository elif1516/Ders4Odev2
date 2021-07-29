package Concrete;

import Acstract.CheckCustomerService;
import Entities.Customer;

public class CheckCustomerManager implements CheckCustomerService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		return true;
	}

}
