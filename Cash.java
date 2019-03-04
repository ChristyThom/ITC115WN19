
public class Cash extends Asset {

	private double amount;
	
	@Override
	public void assetDescription() {
		System.out.print("Cash amount: " + amount);
		
	}
	
	@Override
	public double getMarketValue() {
		return amount;
	}
	

}
