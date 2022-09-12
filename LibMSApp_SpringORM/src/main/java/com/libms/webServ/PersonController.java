package com.libms.webServ;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.libms.bean.Person;

@Controller
public class PersonController {

	@RequestMapping("/purl")
	public String demo(Model m) {
		Person p = new Person();
		m.addAttribute("per", p);
		return "person";
	}

	@RequestMapping("/rgurl")
	public String register(@ModelAttribute("per") Person p) {
		return "result";
	}
}