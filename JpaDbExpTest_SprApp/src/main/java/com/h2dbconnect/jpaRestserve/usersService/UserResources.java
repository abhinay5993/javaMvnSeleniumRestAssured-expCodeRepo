package com.h2dbconnect.jpaRestserve.usersService;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResources {

	private UsersDaoService daoServObj;

	public UserResources(UsersDaoService daoServObj) {
		this.daoServObj = daoServObj;
	}
	
	// GET- all users
	
	@GetMapping(path="/cl-users/")
	public List<UsersBean> retriveAllUsers()
	{
		return daoServObj.getAllUsers();
	}
	
	@GetMapping("/cl-users/{userId}")
	public UsersBean getUserByUserId(@PathVariable int userId)
	{
		UsersBean userBeanObj= daoServObj.getUserInfoByUserId(userId);
		if(userBeanObj==null)
		{
			throw new UserNotFoundException("User id - "+userId+" Not!! exists..");
		}
		return userBeanObj;
	}
	
	
	@DeleteMapping("/cl-users/remove/{userId}")
	public void removeUserByUserId(@PathVariable int userId)
	{
		daoServObj.deleteUserByUserId(userId);
	}
	

	@PostMapping("/saveUsers")
	public void createNewUsers(@RequestBody UsersBean usersBeanObj)
	{
		daoServObj.saveNewUserData(usersBeanObj);
	}

	
}