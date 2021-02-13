/**
 * Imports util.Iterator to then let methods to call upon that to iterate through the array.
 * @author Kyrtis Scott
 *
 */

import java.util.Iterator;

public class WishListIterator implements Iterator<Object> {
	
	private Item[] items;
	private int position = 0;

	/**
	 * The instanced field of items is set to items.
	 * @param items passes through the items information from the array.
	 */
	public WishListIterator(Item[] items) {
		this.items = items;
	}

	/**
	 * Uses the util iterator to be used and sets a true or false value if the current index position is the last in the array and true if it is not the last.
	 */
	public boolean hasNext() {
		if(position >= items.length || items[position] == null) {
			return false;
		}
		else {
			return true;
		}
	}
	
	/**
	 *  Uses the util iterator to change the current index position to the next, then returns null if it does not have a next index position.
	 */
	public Item next() {
		if(hasNext()) {
		Item item = items[position];			
		position++;
		return item;
		}
		else
			return null;
	}
}
