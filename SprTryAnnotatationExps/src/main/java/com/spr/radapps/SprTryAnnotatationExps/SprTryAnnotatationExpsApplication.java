package com.spr.radapps.SprTryAnnotatationExps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.spr.radapps.SprTryAnnotatationExps.compack.BeanConfigTestCls;
import com.spr.radapps.SprTryAnnotatationExps.compack.ComponentAppExpCls;

@SpringBootApplication
public class SprTryAnnotatationExpsApplication implements CommandLineRunner {

	//Object Life Cycle Maintained by Spring Container
	@Autowired
	ComponentAppExpCls compAppRefObj;
	
	@Autowired 
	BeanConfigTestCls beanConfObj;
	
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
	}
	

}
