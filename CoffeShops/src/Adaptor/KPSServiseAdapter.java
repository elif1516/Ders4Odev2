package Adaptor;

import java.rmi.RemoteException;

import Acstract.CheckCustomerService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class KPSServiseAdapter implements CheckCustomerService{

	KPSPublicSoapProxy kps=new KPSPublicSoapProxy();
	@Override
	public boolean CheckIfRealPerson(Customer customer) throws NumberFormatException, RemoteException {
		// TODO Auto-generated method stub
		boolean isRealPerson=kps.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(), customer.getDateOfBirth());
		if(isRealPerson)
		{System.out.println("Baþarýlý"); return true;}
		else 
		{ System.out.println("Baþarýsýz"); return false;}
	
	}
	
	

}
