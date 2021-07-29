package Acstract;

import java.rmi.RemoteException;

import Entities.Customer;

public interface CheckCustomerService {
	boolean CheckIfRealPerson(Customer customer) throws NumberFormatException, RemoteException;

}
