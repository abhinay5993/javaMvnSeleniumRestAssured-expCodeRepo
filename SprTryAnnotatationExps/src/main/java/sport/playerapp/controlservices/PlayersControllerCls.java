package sport.playerapp.controlservices;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import sport.playerapp.pojomodel.NumberChecker;
import sport.playerapp.pojomodel.PlayerMod;

@RestController
public class PlayersControllerCls {

	@Autowired
	PlayerClsServicesLayer playServicesObj;
	
	@Autowired
	private NumberChecker checkNumObj;
	
	@RequestMapping(value = "/get-allplayers",method = RequestMethod.GET)
	public List<PlayerMod> getListOfAllPlayers()
	{
		System.out.println("\nTrying to call data members from OrganizationsApp");
		return this.playServicesObj.getListOfAllPlayers();
	}

	@RequestMapping(value = "/number-checker/{reqNum}", method = RequestMethod.GET)
	public NumberChecker checkNumberStatus(@PathVariable("reqNum") long inpLongData) {
		this.checkNumObj.setNumberData(inpLongData);
		return this.checkNumObj;
	}
	
}