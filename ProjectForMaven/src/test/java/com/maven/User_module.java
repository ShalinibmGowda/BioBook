package com.maven;

import org.testng.annotations.Test;

public class User_module {

	
	@Test
	public void shareStatus()
	{
		System.out.println("share the status ");
	}
	
	@Test(groups = "smoke")
	public void deleteStatus()
	{
		System.out.println("delete the status");
	}
}
