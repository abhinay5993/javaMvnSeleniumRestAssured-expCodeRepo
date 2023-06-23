package com.spr.radapps.SprTryAnnotatationExps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import al.io.pack1.OrganizationsApp;

/*
 * Using the @PathVariable - instead of returning int return it in String format
 * Using the @RequestParam - to accept data into String format
 * 
 */

@RestController
public class SpringSecurAppContoler {
	
	@Autowired
	@Qualifier("beanId3TrdName")
	private OrganizationsApp orgAppObj;
	
	@RequestMapping("/authuser-home")
	public String getEcomHome()
	{
		return "<h3>This is Authenticated user HOME !! page..</h3>"+orgAppObj.toString();
	}
	
	@RequestMapping(value = "/palim-str/strValue", method = RequestMethod.GET)
	public String checkStrIsPalindrom(@RequestParam(name = "qerKey") String inpStrDat) {
		System.out.println("@RequestParam --> annotation we are using as query prameter to URI.");
		StringBuilder sb = new StringBuilder(inpStrDat);
		if (sb.reverse().toString().equals(inpStrDat)) {
			return "<h3>String is Palindrom : ...Reversed Data of query param value : " + sb.toString() + " </h3>";
		} else {
			return "<h3>String is Not Palindrom : ...Reversed Data of query param value : " + sb.toString() + " </h3>";
		}
	}

}