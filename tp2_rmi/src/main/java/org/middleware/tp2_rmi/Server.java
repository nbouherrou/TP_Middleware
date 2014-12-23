package org.middleware.tp2_rmi;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


public class Server {
	
	public static void main(String[] args) throws RemoteException {

		Registry registry = LocateRegistry.createRegistry(19000);
		
		PersonImpl person = new PersonImpl();
		PhoneDirectoryImpl phoneDirectory = new PhoneDirectoryImpl();
		
		String rebindName = "person";
		String rebindName1 = "phoneDirectory";
		
		registry.rebind(rebindName, person);
		registry.rebind(rebindName1, phoneDirectory);
		
		System.out.println("Object ( Person && PhoneDirectory ) Ok !!!!    Enjoy ");
		
	}

}
