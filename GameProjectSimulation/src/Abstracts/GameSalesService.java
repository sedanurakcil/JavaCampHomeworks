package Abstracts;

import Entities.Campaign;
import Entities.GameSales;
import Entities.Player;

public interface GameSalesService {

	
	void salesOfGame(Player player );
	
	void salesOfGameAfterCampaign(Campaign campaign,GameSales gameSales,Player player);
	
}

