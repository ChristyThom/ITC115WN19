
public class Stock extends Asset {
	//field
	private String symbol;
	double totalShares;
	double currentPrice;
	
	public Stock(String symbol, double currentPrice) {
		this.symbol = symbol;
		this.currentPrice = currentPrice;
		totalShares = 0;
	}
	
	@Override
	public void assetDescription() {
		System.out.println("Stock symbol: " + symbol);
		
	}
	
	@Override
	public double getMarketValue() {
		return totalShares * currentPrice;
	}

}
