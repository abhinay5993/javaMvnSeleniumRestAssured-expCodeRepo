package al.io.pack1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import sport.playerapp.pojomodel.NumberChecker;

/*
 * 
 * If @Configuration class if we have multiple @Bean methods while calling in Spring main() -
 * in @Bean("sampleStrText") while creating a reference in main() along with @Autowire annotation use @Qualifyer("sameSampleStrText")
 * 
 * Inorder to prevent of calling multiple @Bean resrources in @Configuration class along with @Qualifyer("otherSampleStrTextmeths") use 
 * @Lazy annotation in your other methodes 
 * 
 * If we are not using @Lazy annotation with other methods which are marked with @Qualifyer("otherSampleStrTextmeths") annotation inside @Configuration class
 * those are also getting called in main() spring app.
 * 
 */

@Configuration
public class OrgsAppClsConfig {
	
	@Bean("OrgsBeanName1Id")
	@Lazy
	public OrganizationsApp getOrgAppsInstance()
	{
		System.out.println("Calling first bean object!!.. Name : OrgsBeanName1Id");
		return new OrganizationsApp(5001,"CartaLane",5000);
	}
	
	@Bean("OrgsBeanName2Id2")
	@Lazy
	public OrganizationsApp getOrgDefaultObjects()
	{
		System.out.println("Calling 2nd bean object!!.. named : OrgsBeanName2Id2");
		return new OrganizationsApp(0001,"FreshWorks",1000);
	}
	
	@Bean
	public NumberChecker getNumberCheckerIns()
	{
		return new NumberChecker();
	}
}