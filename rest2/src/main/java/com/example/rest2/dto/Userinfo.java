package com.example.rest2.dto;

public class Userinfo {
	private String userid;
    private String pw;
    private String username;
    private int usertype;
    
    public Userinfo() {
    	super();
    }
    
    public String getUserid() {
    	return userid;
    }
    public void setUserid(String userid) {
    	this.userid = userid;
    }
    
    public String getPw() {
    	return pw;
    }
    public void setPw(String pw) {
    	this.pw = pw;
    }
    
    public String getUsername() {
    	return username;
    }
    public void setUsername(String username) {
    	this.username = username;
    }
    
    public int getUsertype() {
    	return usertype;
    }
    public void setUsertype(int usertype) {
    	this.usertype = usertype;
    }
    
    @Override
    public String toString() {
    	return "Userinfo [id="+userid+", pw="+pw+", name="+username+", type="+usertype+"]";
    }
}
