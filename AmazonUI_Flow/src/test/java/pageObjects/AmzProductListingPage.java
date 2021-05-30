package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.readConfigProperties;

public class AmzProductListingPage {
	
	WebDriver driver;
	readConfigProperties ocfg;
	
	public String listPageProductName;
	public String listPageItemPrice;
	
	public AmzProductListingPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		ocfg=new readConfigProperties("objects");
		
	}
	
	public boolean clickOnProductByName(String searchItem) {
		boolean blnResult = false;
		String listItemXpath = ocfg.getDataByKey("litsPageItem").replace("xxx",searchItem);
		WebDriverWait wdWait = new WebDriverWait(driver, 20);
		listPageProductName = driver.findElement(By.xpath(listItemXpath)).getText();
		listPageItemPrice = driver.findElement(By.xpath(ocfg.getDataByKey("listPagePrice"))).getText();
		wdWait.until(ExpectedConditions.elementToBeClickable(By.xpath(listItemXpath))).click();
		System.out.println("List Page Product Name : "+listPageProductName );
		System.out.println("List Page Product Price : "+listPageItemPrice);
		
		blnResult = (listPageProductName != null && listPageProductName.length() != 0 && listPageItemPrice != null
				&& !listPageItemPrice.isEmpty());
		return blnResult;
	}
	

}