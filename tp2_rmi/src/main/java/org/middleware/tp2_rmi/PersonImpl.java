package org.middleware.tp2_rmi;

import java.rmi.Remote;

public class PersonImpl implements Person, Remote{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	

	private String name;
		
	private String firstname;
	
	private String address;
	
	private String phone;
	
	private String email;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
