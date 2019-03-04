
public class Stock {
	//fields
	private String symbol;
	private int totalShares;
	private double totalCost;
	
	//constructors
	//setting up pre-condition: our stock is not null (!=null) -- 
	public Stock(String theSymbol) {
		if(theSymbol == null) {
			throw new NullPointerException();
		}
		
		symbol = theSymbol;
		totalShares = 0;
		totalCost = 0.0;
	}
	
	//methods
	//first method to get PROFIT -- will return total profit or loss returned on the stock based on given price per share
	//pre: price >= 0;
	public double getProfit(double currentPrice) {
		if(currentPrice < 0.0) {
			throw new IllegalArgumentException();
			
		}
		double marketValue = currentPrice * totalShares;
		return marketValue - totalCost;
	}
	
	//record a purchase of a share at a given price
	//pre: shares should be greater than or equal to 0 and price per share greater than or eqal to 0.0
	//shares >=0 || pricePerShare >= 0.0
	public void purchase(int shares, double pricePerShare) {
		if(shares < 0 || pricePerShare < 0.0) {
			throw new IllegalArgumentException();
		}
		totalShares +=shares;
		totalCost += shares * pricePerShare;
	}
	
	

}
