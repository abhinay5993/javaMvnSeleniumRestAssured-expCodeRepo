package al.io.pack1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

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
	
}