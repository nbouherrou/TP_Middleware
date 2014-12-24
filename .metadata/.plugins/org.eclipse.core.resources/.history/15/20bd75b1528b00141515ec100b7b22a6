package org.middleware.tp2_rmi;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


public class Client {

	public static void main(String[] args) {

		String serverAdress = "localhost";

		try {
			Registry registry = LocateRegistry.getRegistry(serverAdress, 19000);
			
			Person person = (Person) registry.lookup("person");
			//Person person2 = (Person) registry.lookup("person");
			
			System.out.println("Connection OK to " + serverAdress);
			
			
			person.setName("Nacer");
			person.setFirstname("bouherrou");
			person.setAddress("AVANNE");
			person.setPhone("0652685419");
			person.setEmail("nacerbouherrou@gmail.com");
			/*
			person2.setName("Nourredine");
			person2.setFirstname("bouherrou");
			person2.setAddress("Besancon");
			person2.setPhone("0666666666");
			person2.setEmail("nourredine@gmail.com");
			*/
			
			PhoneDirectory phoneDirectory = (PhoneDirectory) registry.lookup("phoneDirectory");
			
			phoneDirectory.addPerson(person);
			//phoneDirectory.addPerson(person2);
			
			System.out.println(phoneDirectory.listPerson());

		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		}

	}

}
