package com.spr.radapps.SprTryAnnotatationExps;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.github.javafaker.Faker;
import com.spr.radapps.SprTryAnnotatationExps.compack.BeanConfigTestCls;
import sport.playerapp.pojomodel.PlayerMod;

@Controller
public class FirstAppController {

	@Autowired
	BeanConfigTestCls beanObj;
	
	@Autowired
	private PlayerMod playObj;
	
	
	@RequestMapping("/greet-msg")
	@ResponseBody
	public String getSimpleMsg() {
		System.out.println("\nURL called - http://localhost:2023/greet-msg ");
		return "<h3>Hello : "+beanObj.getStudentEntity().toString()+" Welcome!! to SpringBoot app.."+new Date()+" </h3>";
	}
	
	
	@RequestMapping(value = "/json-players-list",method = RequestMethod.GET)
	@ResponseBody
	public PlayerMod getListOfPlayers() {
		Faker fkObj = new Faker();
		int fakId = Integer.parseInt(fkObj.numerify("###"));
		String playName = fkObj.name().username();
		this.playObj.setPlayId(fakId);
		this.playObj.setPlayerName(playName);
		System.out.println("\nReuring as Fake Json data : "+this.playObj.toString());
		return this.playObj;
	}
	
	
	@RequestMapping(value = "/save-players",method = RequestMethod.GET)
	@ResponseBody
	public PlayerMod receiveDataViaForm(@RequestBody PlayerMod receivedJsonObj) {
		System.out.println("\nReceiving Json data via UI/ Postman form request : "+receivedJsonObj.toString());
		return receivedJsonObj;
	}
	
	
}