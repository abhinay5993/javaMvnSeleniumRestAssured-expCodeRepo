package sport.playerapp.controlservices;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import sport.playerapp.pojomodel.PlayerMod;

@RestController
public class PlayersControllerCls {

	@Autowired
	PlayerClsServicesLayer playServicesObj;
	
	@RequestMapping(value = "/get-allplayers",method = RequestMethod.GET)
	public List<PlayerMod> getListOfAllPlayers()
	{
		System.out.println("\nTrying to call data members from OrganizationsApp");
		return this.playServicesObj.getListOfAllPlayers();
	}
	
}