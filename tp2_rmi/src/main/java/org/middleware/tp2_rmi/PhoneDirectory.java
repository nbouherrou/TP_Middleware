package org.middleware.tp2_rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Collection;

public interface PhoneDirectory extends Remote {
	
	public void addPerson(Person person) throws RemoteException;

	public Person searchPerson(String name, String firstname)
			throws RemoteException;

	public Collection<Person> listPerson() throws RemoteException;

	public void removePerson(Person person) throws RemoteException;
}