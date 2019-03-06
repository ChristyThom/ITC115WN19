public class UseProduct {

	public static void main(String[] args) {

		Product dress = new Product(1, "Cocktail Dress", 99.99);
		Product acessory = new Product(2, "Shrug", 29.95);
		Product boots = new Product(3, "Knee High Boots", 140);
		Product stockings = new Product(4, "Stockings", 12.5);
		Product necklace = new Product(5, "Necklace", 43);
	
		
		//display results of product instantiation
		System.out.println("My Product Wardrobe:");
		System.out.println(dress.toString());
		System.out.println(acessory.toString());
		System.out.println(boots.toString());
		System.out.println(stockings.toString());
		System.out.println(necklace.toString());
		
		
	}

}
