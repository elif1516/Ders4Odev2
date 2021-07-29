import java.rmi.RemoteException;

import Adaptor.KPSServiseAdapter;
import Concrete.BaseCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException {
		// TODO Auto-generated method stub
		
		Customer customer1=new Customer(1,"ELÝF","KOÇAK",1986,"31331339736");
		Customer customer2=new Customer(1,"MURAT","KOÇAK",1982,"31331339736");
		BaseCustomerManager starbucksCustomer=new StarbucksCustomerManager(new KPSServiseAdapter());
		starbucksCustomer.save(customer2);
		starbucksCustomer.save(customer1);

	}

}
