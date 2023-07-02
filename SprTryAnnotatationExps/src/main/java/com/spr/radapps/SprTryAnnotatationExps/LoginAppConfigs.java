package com.spr.radapps.SprTryAnnotatationExps;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

/*
 * @Configuration 
 * make this annotation in calls and use 
 * @Bean annotation
 * Create a simple class called Cutter Pojo class
 * while diclaration of @Configuaration class and creating the refacrence add @Autowire annotaion to initilizat object automatically.
 * 
 */

@Configuration
@EnableWebSecurity
public class LoginAppConfigs extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private UserDetailsService userDetServInterRef;
	/*
	 * implementation with DB based authentication security
	 * 
	 */
	@Bean
	protected AuthenticationProvider getAuthenticationProvider() {
		DaoAuthenticationProvider daoAuthProvObj = new DaoAuthenticationProvider();
		daoAuthProvObj.setUserDetailsService(userDetServInterRef);
		daoAuthProvObj.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
		
		return daoAuthProvObj;
	}

	/*
	 * Code for inmemory java collections based autentication security
	 * 
	 */
//	@Bean
//	protected UserDetailsService getUserDetailsServs()
//	{
//		List<UserDetails> userDetList=new ArrayList<>();
//		userDetList.add(User.withDefaultPasswordEncoder().username("alqa").password("al123").roles("USER").build());
//		userDetList.add(User.withDefaultPasswordEncoder().username("abhi12").password("alqa12").roles("USER").build());
//		return new InMemoryUserDetailsManager(userDetList);
//	}

}
