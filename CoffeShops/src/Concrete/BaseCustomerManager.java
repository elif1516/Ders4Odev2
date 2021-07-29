package Concrete;

import java.rmi.RemoteException;

import Acstract.CustomerService;
import Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService{
	
 public void save(Customer customer) throws NumberFormatException, RemoteException
 {
	 System.out.println(customer.getFirstName()+" m��terisi eklendi.");
 }

}
