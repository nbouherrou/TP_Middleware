package org.middleware.tp1_rmi;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
	
	public static void main(String[] args) {
		
		String serverAdress = "localhost";
		
		try {
			Registry registry = LocateRegistry.getRegistry(serverAdress, 18500);
			RemoteEcho echo = (RemoteEcho) registry.lookup("echo");
			System.out.println("Connection OK to " + serverAdress);
			String s = echo.hello() + "\n"
					+ echo.echo("All your base are belong to us");
			System.out.println(s);
			
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		}
	}
}