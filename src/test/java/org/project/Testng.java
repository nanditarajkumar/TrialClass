package org.project;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testng {
	@BeforeClass
	private void tc1() {
		// TODO Auto-generated method stub
		System.out.println("TC1");

	}
	
	@AfterClass
	private void tc2() {
		// TODO Auto-generated method stub
		System.out.println("TC2");

	}
	
	@AfterMethod
	private void tc3() {
		// TODO Auto-generated method stub
		System.out.println("TC3");
	}
	
	@BeforeMethod()
	private void tc4() {
		// TODO Auto-generated method stub
		System.out.println("TC4");
	}
	
	@Test(invocationCount=2)
	private void tc5() {
		// TODO Auto-generated method stub
		System.out.println("TC5");

	}
}
