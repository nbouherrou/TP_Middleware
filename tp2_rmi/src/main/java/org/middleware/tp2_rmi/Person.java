package org.middleware.tp2_rmi;

import java.io.Serializable;

public interface Person extends Serializable {
	
	public String getName();

	public void setName(String name);

	public String getFirstname();

	public void setFirstname(String firstname);

	public String getAddress();

	public void setAddress(String address);

	public String getPhone();

	public void setPhone(String phone);

	public String getEmail();

	public void setEmail(String email);
}