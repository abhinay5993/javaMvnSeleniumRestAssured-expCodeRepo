package com.spr.radapps.SprTryAnnotatationExps.authServicesPack;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.spr.radapps.SprTryAnnotatationExps.authentitymodel.UsersAuthModel;

@Service
public class AuthUserDetailsServiceInter implements UserDetailsService {

	@Autowired
	UserJpaRepoInter userRepoObjRef;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UsersAuthModel userModObj = userRepoObjRef.findByUserName(username);

		if (userModObj == null) {
			throw new UsernameNotFoundException("User not present in DB!!..");
		} else {
			return new UserPrincipleServ(userModObj);
		}
	}

}
