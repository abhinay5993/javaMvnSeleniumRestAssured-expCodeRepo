package com.h2dbconnect.jpaRestserve.usersService;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import org.springframework.stereotype.Component;

@Component
public class UsersDaoService {

	//JPA + Hibernet
	private static List<UsersBean> usersObj=new ArrayList<>();
	private static int idCount=0;
	
	static
	{
		usersObj.add(new UsersBean(++idCount,"AbhinayL",LocalDate.now().minusYears(30)));
		usersObj.add(new UsersBean(++idCount,"KK",LocalDate.now().minusYears(30)));
		usersObj.add(new UsersBean(++idCount,"Atif Aslam",LocalDate.now().minusYears(30)));
		usersObj.add(new UsersBean(++idCount,"CaratLane",LocalDate.now().minusYears(40)));
		usersObj.add(new UsersBean(++idCount,"Google",LocalDate.now().minusYears(20)));
		usersObj.add(new UsersBean(++idCount,"ITC-InfoTech",LocalDate.now().minusYears(60)));
	}
	
	public List<UsersBean> getAllUsers()
	{
		return usersObj;
	}
	
//	public UsersBean getUserInfoByUserId(int userId)
//	{
//		Predicate<? super UsersBean> prediRef=usersBeanObj -> Integer.valueOf(usersBeanObj.getUserId()).equals(userId);
//		UsersBean userObjOptional=Optional.ofNullable(usersObj.stream().filter(prediRef).findFirst()).get().orElse(new UsersBean("Hey!! Try Again..."));
//		return userObjOptional;
//	}
	
	public UsersBean getUserInfoByUserId(int userId)
	{
		Predicate<? super UsersBean> prediRef=usersBeanObj -> Integer.valueOf(usersBeanObj.getUserId()).equals(userId);
		UsersBean userObjOptional=usersObj.stream().filter(prediRef).findFirst().orElse(null);
		return userObjOptional;
	}
	
	public UsersBean saveNewUserData(UsersBean userBeanObj)
	{
		userBeanObj.setUserId(++idCount);
		usersObj.add(userBeanObj);
		return userBeanObj;
	}
	
	
	public void deleteUserByUserId(int userId)
	{
		Predicate<? super UsersBean> prediRef=usersBeanObj -> Integer.valueOf(usersBeanObj.getUserId()).equals(userId);
		usersObj.removeIf(prediRef);
	}
	
	
}