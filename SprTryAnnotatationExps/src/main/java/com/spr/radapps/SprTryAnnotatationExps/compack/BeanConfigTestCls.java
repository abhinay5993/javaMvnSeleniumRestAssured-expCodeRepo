package com.spr.radapps.SprTryAnnotatationExps.compack;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.github.javafaker.Faker;
import com.spr.radapps.SprTryAnnotatationExps.modpojo.EntityBeanPojoStudent;

@Configuration
public class BeanConfigTestCls {
	
	Faker fakOb=new Faker();
	static
	{
		System.out.println("\nThis!! is my BeanConfigTestCls classed marked with @Configuration...");
	}
	
	@Bean
	public EntityBeanPojoStudent getStudentEntity() {
		System.out.println("\nInside getStudentEntity() Bean methode!! .. ");
		int rolNo = Integer.valueOf(fakOb.numerify("###"));
		String stuName = fakOb.name().firstName();
		double numDat = Double.parseDouble(fakOb.numerify("##.##"));
		return new EntityBeanPojoStudent(rolNo, stuName, numDat);
	}
	
}