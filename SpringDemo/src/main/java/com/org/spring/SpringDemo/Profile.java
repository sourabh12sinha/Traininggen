package com.org.spring.SpringDemo;

public class Profile {
	private String fname;
	private String lname;
	private String mobileno;
	private String emailid;
	
	public void setFname(String fname) {
		this.fname = fname;
	}
	
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String Register()
	{
		return "Name "+ fname+" " + lname  + "\n"+ "Mobile No "+ mobileno + "\n" + "Email ID " + emailid;
	}
	
	

}
