package testScripts;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;
import pageObjects.BaseHooks;

public class TC02_NavigateToListPage_By_Search extends BaseHooks {
	
	@Test
	public void verifyListPageBySearch()
	{
		if(homeObj.performSearch(ocfg.getDataByKey("searchText")))
		{
		assertTrue(true,"Succeesfully Searched Items!!...");
		}
		else
		{
		assertFalse(false,"Unable to Search Properly!!...");
		}
	}

}