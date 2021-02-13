/**
 * This sets up the wishlist and iterator, allows the growth of the array size, then gives the ability to modify the array and stores the name and to access the total cost.
 * @author Kyrtis Scott
 *
 */

public class WishList {
	
	public String name;
	private Item[] items = new Item[5];
	private int count = 0;

	/**
	 * This stores the name of the array
	 * @param name passes the name of the array through to wishlist.
	 */
	public WishList(String name) {
		this.name = name;
	}
	
	/**
	 * This adds an item to the array where if the array is too short, it will grow the array.
	 * @param Title  passes in the title of the item.
	 * @param Description passes in the description of the item.
	 * @param Price passes in the price of the item.
	 */
	public void addItem(String title, String description, double price) {
		if(count == items.length)	
	       items = growArray(items);
	       items[count] = new Item(title, description, price);
	       count++;
	}

	/**
	 * This calls upon the new creation of an iterator.
	 * @return This returns the iterator for the items.
	 */
	public WishListIterator createIterator() {
		return new WishListIterator(items);
	}
	
	/**
	 * This loops through the array and gets the cost for that index position in the array and adds it to the total cost.
	 * @return Returns the total cost at index in the array.
	 */
	public double getTotalCost() {
	       double totalCost= 0;
	       for(int i = 0; i < count; i++)
	           totalCost += items[i].getPrice();
	       return totalCost;
	}
	
	/**
	 *  This creates a new array that is twice the size of the previous array and copies all information from the previous.
	 * @param items passes through the previous array item information to then be added to the new array.
	 * @return returns the new array.
	 */
	private Item[] growArray(Item[] items) {
	       Item[] temp = new Item[2 * items.length];
	       for(int i = 0; i < items.length; i++)
	           temp[i] = items[i];
	       return temp;		
	}

}
