package com.checkout;

import static org.junit.Assert.*;

import org.junit.Test;

public class CheckoutUnit {

	@Test
	public void testAddOneItem() {
		Checkout checkout = new Checkout();
		checkout.add(1, 10);
		assertEquals(1, checkout.itemCount());
	}

	@Test
	public void testAddTwoItems() {
		Checkout checkout = new Checkout();
		checkout.add(2, 10);
		assertEquals(2, checkout.itemCount());
	}
	
	@Test
	public void testAddTwoItemsSubstractOne() {
		Checkout checkout = new Checkout();
		checkout.add(2, 10);
		assertEquals(2, checkout.itemCount());
		checkout.subtract(1);
		assertEquals(1, checkout.itemCount());
	}
	
	@Test
	public void testSubtractOneItem() {
		Checkout checkout = new Checkout();
		checkout.add(1, 10);
		checkout.subtract(1);
		assertEquals(0, checkout.itemCount());
	}
	
	@Test
	public void testSubtractTwoItems() {
		Checkout checkout = new Checkout();
		checkout.add(1,10);
		checkout.subtract(2);
		assertEquals(0, checkout.itemCount());
	}
}
