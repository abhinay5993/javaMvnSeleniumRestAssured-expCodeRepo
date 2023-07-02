package com.spr.radapps.SprTryAnnotatationExps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.spr.radapps.SprTryAnnotatationExps.compack.BeanConfigTestCls;
import com.spr.radapps.SprTryAnnotatationExps.compack.ComponentAppExpCls;
import com.spr.radapps.SprTryAnnotatationExps.modpojo.EntityBeanPojoStudent;
import al.io.pack1.OrganizationsApp;
import clr.apps.qa.ClientsQABuilds;

@SpringBootApplication
public class SprTryAnnotatationExpsApplication implements CommandLineRunner {

	//Object Life Cycle Maintained by Spring Container
	@Autowired
	private ComponentAppExpCls compAppRefObj;
	
	@Autowired 
	private BeanConfigTestCls beanConfObj;
	
	@Autowired
	private EntityBeanPojoStudent stuModelObj;
	
	@Autowired
	private ClientsQABuilds clbldObj;
	
	@Autowired
	@Qualifier("beanId3TrdName")
	private OrganizationsApp orgAppObj;
	
	public static void main(String[] args) {
		SpringApplication.run(SprTryAnnotatationExpsApplication.class, args);
		System.out.println("\nWelcome to server.port=2023 SpringBoot app!!.. in main().. runs on ");
	}

	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("\nI am inside Run() --> ");
		this.compAppRefObj.getSimpleMsgFromComponentCls();
		System.out.println(this.beanConfObj.getStudentEntity().toString());
		System.out.println("\nThis is User Name - "+stuModelObj.getStuName());
		System.out.println("\nThis is Student Roll- "+stuModelObj.getStuRoll());
		System.out.println("\nObject from Model-1 - "+clbldObj.toString());
		System.out.println("\nObject from Model-2 - "+orgAppObj.toString());
	}
	

}