package com.jervis.BO;

public class LoginBO {												// class to store values while login
	private String lusername;								// variable to store username for varification
	private String lpassword;								// variable to store password for varification
	public String getLusername() {			//username getter
		return lusername;
	}									
	public void setLusername(String lusername) {		//username setter
		this.lusername = lusername;
	}
	public String getLpassword() {			//password getter
		return lpassword;
	}
	public void setLpassword(String lpassword) {			//password setter
		this.lpassword = lpassword;
	}
	

}
