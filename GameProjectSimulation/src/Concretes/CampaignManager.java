package Concretes;

import Abstracts.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void login(Campaign campaign) {
		System.out.println(campaign.getName()+": Kampanya sisteme eklendi");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName() + " : Kampanya sistemden silindi");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getName()+" : Kampanya güncellendi");
		
	}

}
