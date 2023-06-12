package com.spr.radapps.SprTryAnnotatationExps;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringSecurAppContoler {
	
	@RequestMapping("/authuser-home")
	public String getEcomHome()
	{
		return "<h3>This is Authenticated user HOME !! page..</h3>";
	}
	
	@RequestMapping("/product-pd")
	public String getListOfProd()
	{
		return "<h3>This is Authenticated user PD page...</h3>";
	}

}