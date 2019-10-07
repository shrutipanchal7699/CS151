/**
 * A decorator for an item that applies a discount.
 */
public class DiscountedItem implements LineItem {
	/**
	 * Constructs a discounted item.
	 * 
	 * @param item
	 *            the item to be discounted
	 * @param discount
	 *            the discount percentage
	 */
	public DiscountedItem(LineItem item, double discount) {
		this.item = item;
		this.discount = discount;
		quantity = 1;
	}

	public double getPrice() {
		return item.getPrice() * (1 - discount / 100);
	}

	public String toString() {
		return item.toString() + " (Discount " + discount + "%)";
	}

	// keeps track of the quantity
	public int getQuantity() {
		return quantity;
	}

	public void incrementQuantity() {
		quantity++;
	}

	private LineItem item;
	private double discount;
	private int quantity;
}
