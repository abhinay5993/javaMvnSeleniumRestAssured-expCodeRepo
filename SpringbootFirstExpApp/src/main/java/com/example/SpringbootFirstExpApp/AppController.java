package com.example.SpringbootFirstExpApp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class AppController {

	@RequestMapping("/getStatus")
	public String getAppCode()
	{
		return "App Lauched Succesfully : "+200;
	}
}
