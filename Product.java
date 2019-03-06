import java.text.NumberFormat;

public class Product {
	/* FIELDS */
	private int productCode;
	private String description;
	private double price;

	
	/* CONSTRUCTOR */
	//precondition: productCode != 0 and description != null
	public Product(int productCode, String description, double price) {
		if (productCode == 0 || description == null) {
			throw new NullPointerException();
		}
		
		this.productCode = productCode;
		this.description = description;
		this.price = price;
	
	}
	
	/* METHODS */
	//returns a string with a currency format appropriate for display to the user
	public String getPriceFormatted() {
        String formattedPrice = NumberFormat.getCurrencyInstance().format(this.price);
        return formattedPrice;
    }
	
	//returns a string representation of the product
		public String toString() {
			String formattedPrice = this.getPriceFormatted();
			return "Product Code: " + productCode + "  Description: " + description + "  Price: " + formattedPrice;
		}
		
	//getters and setters
	public int getProductCode() {
		return productCode;
	}

	public void setProductCode(int productCode) {
		this.productCode = productCode;
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