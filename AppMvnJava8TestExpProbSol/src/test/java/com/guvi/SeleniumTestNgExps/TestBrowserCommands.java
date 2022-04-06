package com.guvi.SeleniumTestNgExps;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBrowserCommands {
    static WebDriver driver; 
    
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","driversPack/geckodriver");
		driver=new FirefoxDriver();
		driver.get("https://www.google.in/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		System.out.println("\nBrowser Lauched with Title : "+driver.getTitle()+"");
		WebDriverWait wt=new WebDriverWait(driver,5);
		driver.findElement(By.name("q")).sendKeys("CaratLane");
		Actions act=new Actions(driver);
		driver.findElement(By.xpath("(//span[contains(text(),'CaratLane')])[1]")).click();
		driver.quit();
		System.out.println("\nBrowser Closed!!!..");
	}

}
