package com.spr.radapps.SprTryAnnotatationExps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import al.io.pack1.OrganizationsApp;

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
	
	@RequestMapping("/product-pd")
	public String getListOfProd()
	{
		return "<h3>This is Authenticated user PD page...</h3>";
	}

}