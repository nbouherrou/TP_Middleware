package org.middleware.tp1_ejb.client;

import javax.naming.InitialContext;

import org.middleware.tp1_ejb.ejbs.SimpleRemote;

public class Client {

	public static void main(String[] args) {
		try {
			InitialContext ctx = new InitialContext();
			SimpleRemote bean = (SimpleRemote) ctx.lookup("SimpleBean");
			
			bean.login("Nacer");
			
			System.out.println(bean.hello());
			
			System.out.println(bean.hello());
			
			bean.login("Zizou");
			
			System.out.println(bean.hello());
			
			System.out.println(bean.hello());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
