package com.h2dbconnect.jpaRestserve.usersService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException {
	
	public UserNotFoundException(String errorMsg)
	{
		super(errorMsg);
	}

}
