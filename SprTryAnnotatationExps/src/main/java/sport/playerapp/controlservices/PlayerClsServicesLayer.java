package sport.playerapp.controlservices;
import java.util.LinkedList;
import java.util.List;
import org.springframework.stereotype.Service;
import sport.playerapp.pojomodel.PlayerMod;

@Service
public class PlayerClsServicesLayer {

	List<PlayerMod> listOfPlayers = new LinkedList<>();

	public PlayerClsServicesLayer() {
		listOfPlayers.add(new PlayerMod(1, "Atif"));
		listOfPlayers.add(new PlayerMod(2, "KK"));
		listOfPlayers.add(new PlayerMod(2, "Basul"));
	}

	public List<PlayerMod> getListOfAllPlayers() {
		return listOfPlayers;
	}
}