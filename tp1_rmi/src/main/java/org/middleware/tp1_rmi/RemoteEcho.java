package org.middleware.tp1_rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.RemoteObject;

public interface RemoteEcho extends Remote{

	String hello() throws RemoteException;
	String echo(String s) throws RemoteException;
	
}
