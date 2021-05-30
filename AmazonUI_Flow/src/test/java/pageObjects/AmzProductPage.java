package pageObjects;
import java.util.ArrayList;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.readConfigProperties;

public class AmzProductPage {
	
	WebDriver driver;
	readConfigProperties ocfg;
	public AmzProductListingPage listobj;
	public AmzProductPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		ocfg=new readConfigProperties("objects");
		listobj=new AmzProductListingPage(driver);
	}
	
	@FindBy(id="productTitle")
	WebElement productNameByTitle;
	
	@FindBy(id="priceblock_ourprice")
	WebElement productPriceLabel;
	
	public boolean verifyProductNameAndPriceMatchedWithListClickItem(String expProdName,String expPriceVal)
	{
	boolean blnResult=false;
	WebDriverWait wdWait = new WebDriverWait(driver,40);
	ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	driver.switchTo().window((String) tabs.get(1)); 
	wdWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(ocfg.getDataByKey("pdPageItemName"))));
	wdWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(ocfg.getDataByKey("pdPageItemPrice"))));
	String actProdName=productNameByTitle.getText();
	String actPriceVal=productPriceLabel.getText();
	System.out.println("\nProduct Page Product Name - "+actProdName);
	System.out.println("\nProduct Page Price - "+actPriceVal);
	blnResult=(StringUtils.containsIgnoreCase(expProdName, actProdName) && StringUtils.containsAny(expPriceVal,actPriceVal));
	return blnResult;
	}
	

}