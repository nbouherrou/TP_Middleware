package org.middleware.tp1_rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RemoteEcho extends Remote{

	String hello() throws RemoteException;
	String echo(String s) throws RemoteException;
	
}
