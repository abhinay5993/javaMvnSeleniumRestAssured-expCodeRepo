package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.readConfigProperties;

public class AmzHomePage {
	
	WebDriver driver;
	readConfigProperties ocfg;
	
	public AmzHomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		ocfg=new readConfigProperties("objects");
	}
	
	@FindBy(id="twotabsearchtextbox")
	WebElement searchBox;
	
	@FindBy(id="nav-search-submit-button")
	WebElement searchIconButton;
	
	public boolean verifyHomePageLogo()
	{
    WebDriverWait wdWait=new WebDriverWait(driver,20);
    wdWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ocfg.getDataByKey("amazonHomePagelogo"))));
	return driver.findElement(By.xpath(ocfg.getDataByKey("amazonHomePagelogo"))).isDisplayed();
	}
	
	
	public boolean performSearch(String searchText)
	{
		searchBox.sendKeys(searchText);
		searchIconButton.click();
		String newXpathProp=ocfg.getDataByKey("listPageResultFor").replace("xxx",searchText);
		WebDriverWait wdWait=new WebDriverWait(driver,20);
	    wdWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(newXpathProp)));
		return driver.findElement(By.xpath(newXpathProp)).isDisplayed();
	}
	
	

}