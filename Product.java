import java.text.NumberFormat;

public class Product {
	//Fields
	private int product;
	private String description;
	private double price;

	
	//Constructor - because I finally understand what a constructor is with this assignment
	public Product(int product, String description, double price) {
		if (product == 0 || description == null) {
			throw new NullPointerException();
		}
		
		this.product = product;
		this.description = description;
		this.price = price;
	
	}
	
	//Method
	public String getPriceFormatted() {
        String formattedPrice = NumberFormat.getCurrencyInstance().format(this.price);
        return formattedPrice;
    }
	
	//returns a string representation of the product
		public String toString() {
			String formattedPrice = this.getPriceFormatted();
			return "Product Number: " + product + "  What are you wearing: " + description + "  Cost: " + formattedPrice;
		}
		
	//getters and setters -- god I love how you can right click to load this!!! YAY ECLIPSE HELP!!!
	public int getProduct() {
		return product;
	}

	public void setProduct(int product) {
		this.product = product;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

		
}
