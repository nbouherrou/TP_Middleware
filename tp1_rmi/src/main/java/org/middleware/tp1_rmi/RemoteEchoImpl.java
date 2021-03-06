package org.middleware.tp1_rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RemoteEchoImpl extends UnicastRemoteObject implements RemoteEcho {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected RemoteEchoImpl() throws RemoteException {
		super();
	}

	public String hello() throws RemoteException {
		return "Bonjour";
	}

	public String echo(String s) throws RemoteException {
		return "Le message est : " + s;
	}

}
