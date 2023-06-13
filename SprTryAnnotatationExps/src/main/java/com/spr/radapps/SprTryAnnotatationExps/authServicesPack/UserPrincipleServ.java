package com.spr.radapps.SprTryAnnotatationExps.authServicesPack;
import java.util.Collection;
import java.util.Collections;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import com.spr.radapps.SprTryAnnotatationExps.authentitymodel.UsersAuthModel;

public class UserPrincipleServ implements UserDetails{

	UsersAuthModel userModObj;
	public UserPrincipleServ(UsersAuthModel userModObj) {
		this.userModObj = userModObj;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return Collections.singleton(new SimpleGrantedAuthority("USER"));
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return userModObj.getStrPwd();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return userModObj.getUserName();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
