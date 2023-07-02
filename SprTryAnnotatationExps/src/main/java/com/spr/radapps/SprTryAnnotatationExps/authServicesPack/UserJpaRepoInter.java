package com.spr.radapps.SprTryAnnotatationExps.authServicesPack;
import org.springframework.data.jpa.repository.JpaRepository;
import com.spr.radapps.SprTryAnnotatationExps.authentitymodel.UsersAuthModel;

public interface UserJpaRepoInter extends JpaRepository<UsersAuthModel, Integer> {
	
	UsersAuthModel findByUserName(String userName);

}
