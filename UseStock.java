import java.util.Scanner;

//track user's purchase of two stocks and compute which one is more profitable

public class UseStock {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		//first stock 
		System.out.print("First stock symbol: ");
		String symbol1 = console.next();
		
		//create an instance of the stock
		Stock stock1 = new Stock(symbol1);
		
		double profit1 = makePurchase(stock1, console);
		
		//second stock
		System.out.print("Second stock symbol: ");
		String symbol2 = console.next();
		
		//create an instance of the stock
		Stock stock2 = new Stock(symbol2);
		
		double profit2 = makePurchase(stock2, console);
		
		//report on profit
		if(profit1 > profit2) {
			System.out.println(symbol1 + " was more profitable than " + symbol2 + ".");
			
		}else if (profit2 > profit1) {
			System.out.println(symbol2 + " was more profitable than " + symbol1 + ".");
			
		}else {//equal profits
			System.out.println(symbol1 + " and " + symbol2 + " are equally profitable.");
		}
		
		

	}
	//make purchases of stocks and return the profit
	private static double makePurchase(Stock currentStock, Scanner console) {
		System.out.print("How many purchases did you make?");
		int numPurchases = console.nextInt();
		
		//ask about each purchase
		for(int i = 1; i <= numPurchases; i++) {
			System.out.print(i + " How many shares, at what price per share?");
			int numShares = console.nextInt();
			double pricePerShare = console.nextDouble();
			
			currentStock.purchase(numShares, pricePerShare);
		}
		
		//use the stock object to compute the profit
		
		System.out.print("Today's price per share? ");
		double currentPrice = console.nextDouble();
		
		double profit = currentStock.getProfit(currentPrice);
		System.out.println("Net profit or loss: $" + profit);
		System.out.println();
		return profit;
	}

}
