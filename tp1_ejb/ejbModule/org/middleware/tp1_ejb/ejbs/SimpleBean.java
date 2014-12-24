package org.middleware.tp1_ejb.ejbs;

import javax.ejb.Stateful;


@Stateful(name="SimpleEJB", mappedName="SimpleBean")
public class SimpleBean implements SimpleRemote{

	String login = null;
	
	@Override
	public String hello() {
		if (login == null) {			
			return "Bonjour !!!";
		}
		else {
			return "Bonjour " + login;
		}
	}

	@Override
	public String echo(String s) {

		return "Le message est : " + s;
	}

	@Override
	public void login(String name) {

		this.login = name;
	}

}
