package com.guvi.SeleniumTestNgExps;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExpTestNgAnnotations {
	int tc=0;
	
	@Test
	public void myTest1()
	{
		System.out.println("my 1st TestNg TestCase");
	}
	
	@Test
	public void myTest2()
	{
		System.out.println("my 2nd TestNg TestCase");
	}
	
	@Test
	public void myTest3()
	{
		System.out.println("my 3rd TestNg TestCase");
	}
	
	@BeforeMethod
	public void basedOnNoOfTest()
	{
	tc=tc+1;
    System.out.println("@BeforeMethod--->No of Times called : "+tc+" ");	
	}
	
	@AfterMethod(groups = {"reg"})
	public void basedOnNoOfTestEnds()
	{
    System.out.println("After Methods---> @AfterMethod");	
	}
	
	@BeforeSuite
	public void myFirstTestSuite()
	{
		System.out.println("\nTest Entry Session started!!!...--> BeforeSuite");
	}
	
	@BeforeClass
	public void lauchClassLoader()
	{
		System.out.println("\n@BeforeClass---> Class loaded into Memo");
	}
	
	@BeforeTest
	public void setUpApp()
	{
		System.out.println("\n@BeforeTest---> sould run after @BeForeSuite");
	}
	
	
}