package testScripts;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;
import pageObjects.BaseHooks;

public class TC03_VerifyProductPageNavigation_byClickOnListPageItem extends BaseHooks {
	
	@Test
	public void verifyListToPdNavigationAndValidateDetails() {
		
		if (homeObj.performSearch(ocfg.getDataByKey("searchText"))) {
			
			assertTrue(true, "Succeesfully Searched Items!!...");
			System.out.println("\nSuccessfully Searched the Item..");
			if (listPageObj.clickOnProductByName(ocfg.getDataByKey("listItemLabel"))) {
				System.out.println("\n" + listPageObj.listPageProductName + " List page Item clicked!!!");
				assertTrue(true, "Clicked on List Item");
				if (prodPageObj.verifyProductNameAndPriceMatchedWithListClickItem(listPageObj.listPageProductName,listPageObj.listPageItemPrice)) {
					System.out.println("\nList page details matched with clicked Product details");
					assertTrue(true, "details matched Succeesfully!!...");
				} else {
					System.out.println("\nProduct details is not matching with list page");
					assertFalse(false, "Product details is not matching with list page");
				}

			} else {
				assertFalse(false, "Unable to Click on List page Item...");
			}

		} else {
			assertFalse(false, "Unable to Search Properly!!...");
		}

	}
	

}