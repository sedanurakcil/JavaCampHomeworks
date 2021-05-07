package Concretes;
import Entities.Player;
import Abstracts.PlayerService;
import Adaptor.PlayerCheckService;
import Entities.Player;

public class PlayerManager implements PlayerService {
	
	private PlayerCheckService playerCheckService;
	
	
	public PlayerManager(PlayerCheckService playerCheckService) {
		super();
		this.playerCheckService = playerCheckService;
	}

	
	@Override
	public void register(Player player) {
		if(playerCheckService.checkIfRealPlayer( player)) {
			System.out.println(player.getName()+ " was recorded");
		}
		else {
			System.out.println("Not valid Person ");
		}
		
		
	}

	@Override
	public void update(Player player) {
		System.out.println( player.getName()+": Güncellendi ");
		
	}

	@Override
	public void delete(Player player) {
		System.out.println(player.getName()+" : Silindi ");
		
	}
	

}
