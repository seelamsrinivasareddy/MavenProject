package com.sample;

import java.util.ResourceBundle;

public class MyLogin {
	public boolean checkLogin(String uid,String psw)
	{
		//System.out.println(uid+" "+psw);
		ResourceBundle rb = ResourceBundle.getBundle("config");
		String uname=rb.getString("username");
		String password=rb.getString("password");
		//System.out.println(uname+" "+password);
		if(uid.equals(uname)&&psw.equals(password))
		return true;
		else
		return false;
	}
	/*public static void main(String args[])
	{
		System.out.println(new MyLogin().checkLogin("srinu", "12345"));
	}*/
}
