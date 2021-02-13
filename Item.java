/**
 *  sets the information of the items to the array, allows price to be changed to string, returns the price, and prints out the information.
 * @author Kyrtis Scott
 *
 */

public class Item {

	private String title;
	private String description;
	private double price;
	
	/**
	 * Sets the instance field of title, description, and price to the actual title, description, and price of the item.
	 * @param title passes title in to set the instance field of title.
	 * @param description passes description in to set the instance field of description.
	 * @param price passes in the value of price and sets the instance field price.
	 */
	public Item(String title, String description, double price) {
		this.title = title;
		this.description = description;
		this.price = price;
	}
	
	/**
	 * this returns the structure of the array list to be printed out, and formats the price to reflect the cents as a string (example: instead of $5.0, it would show $5.00)
	 */
	public String toString() {
		return "\n***** " + title + " *****\n " + description + "\n " + String.format("Price: $%.2f", price);
		
	}
	
	/**
	 * Gets the price of the item.
	 * @return returns the price of the item.
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * Prints out the item information in the format set by toString.
	 */
	public void print() {
	       System.out.println(toString());
	}
}
