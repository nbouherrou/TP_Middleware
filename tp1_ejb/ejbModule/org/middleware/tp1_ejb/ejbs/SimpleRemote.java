package org.middleware.tp1_ejb.ejbs;

import javax.ejb.Remote;

@Remote
public interface SimpleRemote {
	
	public void login(String name);
	
	public String hello();
	
	public String echo(String s);

}
