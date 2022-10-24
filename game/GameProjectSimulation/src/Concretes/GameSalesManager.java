package Concretes;

import Abstracts.GameSalesService;
import Entities.Campaign;
import Entities.GameSales;
import Entities.Player;


public class GameSalesManager implements GameSalesService{


	public void salesOfGame(Player player) {
		
		System.out.println(player.getName()+": Oyunu  sat�n ald�");
		
	}

	@Override
	public void salesOfGameAfterCampaign(Campaign campaign, GameSales gameSales,Player player) {
		System.out.println("Kampanyadan sonraki oyun fiyat� "+(gameSales.getGamePrice()*campaign.getDiscountRate())/100);
		System.out.println(player.getName()+" kampanyal� oyunu sat�n ald� ");
	}

	
	


}
