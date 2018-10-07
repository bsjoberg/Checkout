package com.checkout;

public class Checkout {
	private int itemCount = 0;
	private int runningTotal = 0;
	
	public Checkout() {
		
	}

	public void add(int itemCount, String itemName, int price) {
		this.itemCount = this.itemCount + itemCount;
		runningTotal += itemCount * price;
	}

	public int itemCount() {
		return itemCount;
	}

	public void subtract(int itemCount, String itemName) {
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
		return runningTotal;
	}
}
