package org.middleware.tp1_rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RemoteEchoImpl extends UnicastRemoteObject implements RemoteEcho {

	protected RemoteEchoImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	public String hello() throws RemoteException {
		return "Bonjour";
	}

	public String echo(String s) throws RemoteException {
		// TODO Auto-generated method stub
		return "Le message est : " + s;
	}

}
