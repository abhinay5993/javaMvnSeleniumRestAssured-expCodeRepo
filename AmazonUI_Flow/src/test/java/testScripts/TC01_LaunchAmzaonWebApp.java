package testScripts;
import java.io.IOException;
import org.testng.annotations.Test;
import pageObjects.BaseHooks;
import utils.CommonUtils;

public class TC01_LaunchAmzaonWebApp extends BaseHooks {
	
	@Test
	public void testHomePage() throws IOException
	{
		System.out.println("\nLaunch and verify Amazon Home page");
		CommonUtils.takeScreenCapture(driver);
	}
	

}
