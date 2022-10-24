import Entities.Campaign;
import Entities.GameSales;
import Entities.Player;
import java.util.Date;

import Abstracts.CampaignService;
import Abstracts.GameSalesService;
import Abstracts.PlayerService;
import Adaptor.PlayerCheckManager;
import Concretes.CampaignManager;
import Concretes.GameSalesManager;
import Concretes.PlayerManager;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Player player = new Player(123,"carl","july","1234567",new Date (2002,9,5));
		Player player2 = new Player (124,"sedanur","Akçil", "513433983",new Date(2000,8,7));
		Campaign campaign = new Campaign(123,"Bayram kampanyasý",10);
		GameSales gameSales= new GameSales(36);
		
		GameSalesService gamesalesService = new GameSalesManager();
		PlayerService playerService = new PlayerManager(new PlayerCheckManager());
		CampaignService campaignService= new CampaignManager();
		
		playerService.register(player2);
		playerService.register(player);
		
		playerService.update(player2);
		
		campaignService.delete(campaign);
		campaignService.login(campaign);
		campaignService.update(campaign);
		
		
		
		gamesalesService.salesOfGame(player2);
		gamesalesService.salesOfGame(player);
		gamesalesService.salesOfGameAfterCampaign(campaign, gameSales,player);

	}

}
