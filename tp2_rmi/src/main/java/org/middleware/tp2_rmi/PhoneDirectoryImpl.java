package org.middleware.tp2_rmi;

import java.rmi.RemoteException;
import java.util.Collection;

public class PhoneDirectoryImpl implements PhoneDirectory{
	
	private Collection<Person> personList;
	

	public void addPerson(Person person) throws RemoteException {

		personList.add(person);
	}

	public Person searchPerson(String name, String firstname)
			throws RemoteException {
		Person personne = null;

		for (Person person : personList) {
			if (person.getName().equals(name) && person.getFirstname().equals(firstname)) {
				personne = person;
			}
			else {
				personne = null;
			}
		}
		
		return personne;
	}

	public Collection<Person> listPerson() throws RemoteException {
		
		return personList;
	}

	public void removePerson(Person persone) throws RemoteException {
		for (Person person : personList) {
			if (person.equals(persone)) {
				personList.remove(persone);
			}
		}
	}

}
