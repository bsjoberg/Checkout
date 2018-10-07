package com.checkout;

public class Checkout {
	private int itemCount = 0;
	private int totalPrice = 0;
	
	public Checkout() {
		
	}

	public void add(int itemCount, int bananaPrice) {
		this.itemCount = this.itemCount + itemCount;
		totalPrice = totalPrice + itemCount * bananaPrice;
	}

	public int itemCount() {
		return itemCount;
	}

	public void subtract(int itemCount) {
		if (this.itemCount > 0)
		{
			this.itemCount = this.itemCount - itemCount;
		}
		
		if (this.itemCount < 0)
		{
			this.itemCount = 0;
		}
	}

	public int total() {
		return totalPrice;
	}
}
