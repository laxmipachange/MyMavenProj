package com.sdate;

public class App {
	
	public int userlogin(String in_user, String password)
	{
		if (in_user.equals("username") && password.equals("password"))
			return 1;
		else
			return 0;
	}

}
