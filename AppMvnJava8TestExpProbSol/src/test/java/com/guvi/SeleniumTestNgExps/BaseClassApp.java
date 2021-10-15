package com.guvi.SeleniumTestNgExps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.problemsolving.testUtilExps.readConfigData;

public class BaseClassApp {
	
	public static void main(String[] args) {
		readConfigData readObj=new readConfigData();
		System.out.println("\nApp URL : "+readObj.getAppURL());
		System.out.println("\nChomre Driver : "+readObj.getChromeDriverPath());
		System.out.println("\nUname : "+readObj.getUserName());
        System.out.println(System.getProperty("user.dir"));
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+readObj.getChromeDriverPath());
		WebDriver dr=new ChromeDriver();
		dr.get(readObj.getAppURL());
		dr.manage().window().maximize();
		System.out.println("\nURL Lauched!!..");
		dr.findElement(By.id("identifierId")).sendKeys(readObj.getUserName());
		
		System.out.println("\nUsername passed!!..");
		
		if(dr!=null)
		{
			dr.quit();
			System.out.println("Browser Closed!!");
		}
		
	}

}
