package com.sdate;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {
	
	@Test
	public void testlogin1()
	{
		App app = new App();
		Assert.assertEquals(0,app.userlogin("abc","abc@123"));

	}
		
	@Test
	public void testlogin2()
	{
		App app=new App();
		Assert.assertEquals(1,app.userlogin("abc","abc@123"));
	
	}
}
