package testScripts;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;
import pageObjects.BaseHooks;
import utils.CommonUtils;

public class TC02_NavigateToListPage_By_Search extends BaseHooks {
	
	@Test
	public void verifyListPageBySearch() throws IOException
	{
		if(homeObj.performSearch(ocfg.getDataByKey("searchText")))
		{
		CommonUtils.takeScreenCapture(driver);
		assertTrue(true,"Succeesfully Searched Items!!...");
		}
		else
		{
		assertFalse(false,"Unable to Search Properly!!...");
		}
		CommonUtils.takeScreenCapture(driver);
	}

}