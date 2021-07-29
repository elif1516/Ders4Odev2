package Concrete;

import java.rmi.RemoteException;

import Acstract.CheckCustomerService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	CheckCustomerService checkCustomerService;

	public StarbucksCustomerManager(CheckCustomerService checkCustomerService) {

		this.checkCustomerService = checkCustomerService;
	}
	@Override
	public void save(Customer customer) throws NumberFormatException, RemoteException
	{
		if(checkCustomerService.CheckIfRealPerson(customer))
		{
			super.save(customer);
		}
		else
		{
			System.out.println("Hatalý kullanýcý giriþi");
		}
	}

}
