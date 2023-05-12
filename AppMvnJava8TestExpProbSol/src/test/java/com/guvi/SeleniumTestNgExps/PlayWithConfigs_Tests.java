package com.guvi.SeleniumTestNgExps;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
import com.prog.edubridgeindia.jdbconnects.AccessResourceBundles;

public class PlayWithConfigs_Tests {
	
	AccessResourceBundles resBunds=new AccessResourceBundles();
	
	@Test
	public void checkLogIn_test1()
	{
	assertEquals(0,resBunds.getLoginStatus("ashis","ram122"));
	}

	
	@Test
	public void checkLogIn_test2()
	{
	assertEquals(1,resBunds.getLoginStatus("atif","kk@123"));
	}
	
	
	@Test
	public void checkLogIn_test3()
	{
	assertEquals(0,resBunds.getLoginStatus("skjdksd","kk@123"));
	}
	
	
	@Test
	public void checkMaxNum_test4()
	{
	assertEquals(30,resBunds.findMaxOfThreeNums());
	}
	
	
	@Test
	public void checkMaxNum_test5()
	{
	assertEquals(60,resBunds.findMaxOfThreeNums());
	}
	
	
	@Test
	public void checkArraysMaxItem_test6()
	{
	assertEquals(60,resBunds.getMaxNumber2Array(new int[]{45,34,64,88,434,54,45,66}));
	}
	
	
	@Test
	public void checkArraysMaxItem_test7()
	{
	assertEquals(434,resBunds.getMaxNumber2Array(new int[]{45,34,64,88,434,54,45,66}));
	}
	
}