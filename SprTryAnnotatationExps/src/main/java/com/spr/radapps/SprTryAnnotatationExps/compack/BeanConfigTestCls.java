package com.spr.radapps.SprTryAnnotatationExps.compack;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.github.javafaker.Faker;
import com.spr.radapps.SprTryAnnotatationExps.modpojo.EntityBeanPojoStudent;
import al.io.pack1.OrganizationsApp;
import clr.apps.qa.ClientsQABuilds;
import sport.playerapp.pojomodel.PlayerMod;

@Configuration
@ComponentScan(basePackages = {"al","clr","sport"})
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
	
	@Bean("beanId3TrdName")
	public OrganizationsApp getOrgApps()
	{
		System.out.println("\nInside @Bean of OrganizationsApp methode!!.. Bean Id/Name : beanId3TrdName");
		int rolNo = Integer.valueOf(fakOb.numerify("###"));
		String stuName = fakOb.name().firstName();
		long numDat = Long.parseLong(fakOb.numerify("########"));
		return new OrganizationsApp(rolNo,stuName,numDat);
	}
	
	@Bean
	public ClientsQABuilds getClientsApps()
	{
		System.out.println("\nInside @Bean of OrganizationsApp methode!!..");
		return new ClientsQABuilds();
	}
	
	
	@Bean
	public PlayerMod getPlayersBean()
	{
	return new PlayerMod();
	}
	
}