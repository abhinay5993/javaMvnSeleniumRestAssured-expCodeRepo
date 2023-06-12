package com.spr.radapps.SprTryAnnotatationExps;
import java.util.ArrayList;
import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class LoginAppConfigs extends WebSecurityConfigurerAdapter {
	
	@Bean
	protected UserDetailsService getUserDetailsServs()
	{
		List<UserDetails> userDetList=new ArrayList<>();
		userDetList.add(User.withDefaultPasswordEncoder().username("alqa").password("al123").roles("USER").build());
		userDetList.add(User.withDefaultPasswordEncoder().username("abhi12").password("alqa12").roles("USER").build());
		return new InMemoryUserDetailsManager(userDetList);
	}

}
