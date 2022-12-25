package com.h2dbconnect.jpaRestserve;
import java.util.Date;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

// Rest API

@RestController
public class TryWithJpaExpController {

	@GetMapping(path = "/")
	public BeanCompoForStrApp withOutPathUrl()
	{
		return new BeanCompoForStrApp("Hey!!.. FSD --> withOutPathUrl() ..");
	}
	
	@RequestMapping("/try-date-without-http-meth")
	public String withOutRequestMeth()
	{
		return "<h2><marquee>Hello Abhinay- Time is - "+new Date()+" </marquee></h2>";
	}
	
	@RequestMapping(method = RequestMethod.GET,path = "/jpadb-sprhello-test")
	public String helloSpringBootJpa()
	{
		return "SpringBoot+H2 DB JPA implimentation-- @RequestMapping(method = RequestMethod.GET,path = '/jpadb-sprhello-test) hello!!..";
	}
	
	@GetMapping(path = "/qa-automaiton-sdet")
	public String getMethQASdet()
	{
		return "We are SDET!!.. Learning SpringBootJPA + H2-Db..--> getMethQASdet()";
	}
	
	@GetMapping(path = "/call-by-bean")
	public BeanCompoForStrApp returnByBeanCompnent()
	{
		return new BeanCompoForStrApp("Hey!!.. Bean Compo!!..");
	}
	
	
}