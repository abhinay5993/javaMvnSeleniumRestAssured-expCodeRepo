package com.guvi.SeleniumTestNgExps;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestRunnerAppQA {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("\nTesting with Git Repo hands on!!!..");
		String absUserDirPath=System.getProperty("user.dir");
		System.out.println("\n Current Dir - "+absUserDirPath);
		System.setProperty("webdriver.chrome.driver",absUserDirPath+"\\src\\test\\resources\\drivers\\chromedriver.exe");
		
		WebDriver wdRef=new ChromeDriver();
		wdRef.get("https://www.youtube.com/");
		
		WebDriverWait dynWait=new WebDriverWait(wdRef,30);
		dynWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='search']")));
		wdRef.manage().window().maximize();
		wdRef.findElement(By.xpath("//input[@id='search']")).sendKeys("Automation By Raghav");
		wdRef.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		System.out.println("Search Button Clicked!!");
		
		if(wdRef!=null)
		{
			wdRef.close();
			System.out.println("\nBrowser closed!!!");
			wdRef.quit();
		}
	}
}
