package com.odinapp.SprBootWebInitiApp;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@ComponentScan
@Controller
@ResponseBody
public class SprWebAppController {

	@RequestMapping("/getWebApp")
	public String getAppCode() {
		String app = " ";
		for (int i = 0; i <= 50; i++) {
			app="App Lauched SpringBoot https://start.spring.io/ : " + app;
		}
		return app;
	}
}
