package com.springwebapp.SpringProductManagementApp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDriverApp {

	public static void main( String[] args )
	{
	ApplicationContext context = new ClassPathXmlApplicationContext("./configs/product-cfg.xml");
	ProductBean pbObj =context.getBean("pbClsRef",ProductBean.class);
	pbObj.showProductList();
	}
}