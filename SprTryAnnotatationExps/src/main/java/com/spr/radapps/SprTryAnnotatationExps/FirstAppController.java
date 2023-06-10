package com.spr.radapps.SprTryAnnotatationExps;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.spr.radapps.SprTryAnnotatationExps.compack.BeanConfigTestCls;

@Controller
public class FirstAppController {

	@Autowired
	BeanConfigTestCls beanObj;
	
	@RequestMapping("/greet-msg")
	@ResponseBody
	public String getSimpleMsg() {
		System.out.println("\nURL called - http://localhost:2023/greet-msg ");
		return "<h3>Hello : "+beanObj.getStudentEntity().toString()+" Welcome!! to SpringBoot app.."+new Date()+" </h3>";
	}
}