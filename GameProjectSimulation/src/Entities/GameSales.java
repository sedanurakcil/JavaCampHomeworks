package Entities;

public class GameSales implements Entity{
	
	private double gamePrice;
	
	public GameSales() {}
	
	public GameSales(double gamePrice) {
		super();
		this.gamePrice = gamePrice;
	}

	public double getGamePrice() {
		return gamePrice;
	}

	public void setGamePrice(double gamePrice) {
		this.gamePrice = gamePrice;
	}

	
	

}
