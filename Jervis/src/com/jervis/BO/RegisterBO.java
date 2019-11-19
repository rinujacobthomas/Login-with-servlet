package com.jervis.BO;

public class RegisterBO {
										// variables to store data while registration
	private String name;				// name variable
	private String number;				// phone number variable
	private String email;				//email variable
	private String userame;				//username variable
	private String password;			// password variable
	private String compassword;			// confirm password variable
	
															///setters to set values
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCompassword(String compassword) {
		this.compassword = compassword;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setUserame(String userame) {
		this.userame = userame;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
																	//getters 
	
	public String getNumber() {
		return number;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getUserame() {
		return userame;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getCompassword() {
		return compassword;
	}
	
	
}
