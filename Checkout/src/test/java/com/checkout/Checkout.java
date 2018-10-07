package com.checkout;

public class Checkout {
	private int itemCount = 0;
	
	public Checkout() {
		
	}

	public void add(int itemCount, int bananaPrice) {
		this.itemCount = this.itemCount + itemCount;
	}

	public int itemCount() {
		// TODO Auto-generated method stub
		return itemCount;
	}

	public void subtract(int itemCount) {
		this.itemCount = this.itemCount = itemCount;
	}

}
