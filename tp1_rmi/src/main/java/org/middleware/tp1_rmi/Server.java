package org.middleware.tp1_rmi;

import java.rmi.AccessException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {

	public static void main(String[] args) {
		try {
			
			Registry registry = LocateRegistry.createRegistry(18500);
			RemoteEchoImpl echo;
			echo = new RemoteEchoImpl();
			String rebindName = "echo";
			registry.rebind(rebindName, echo);
			System.out.println("Object Echo ok");
			
		} catch (AccessException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
}
