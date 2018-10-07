package com.checkout;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CheckoutUnit {
	private Checkout checkout;
	
	@Before
	public void setup() {
		checkout = new Checkout();
	}
	
	@Test
	public void testAddOneItem() {
		checkout.add(1, 10);
		assertEquals(1, checkout.itemCount());
	}

	@Test
	public void testAddTwoItems() {
		checkout.add(2, 10);
		assertEquals(2, checkout.itemCount());
	}
	
	@Test
	public void testAddTwoItemsSubstractOne() {
		checkout.add(2, 10);
		assertEquals(2, checkout.itemCount());
		checkout.subtract(1);
		assertEquals(1, checkout.itemCount());
	}
	
	@Test
	public void testSubtractOneItem() {
		checkout.add(1, 10);
		checkout.subtract(1);
		assertEquals(0, checkout.itemCount());
	}
	
	@Test
	public void testSubtractTwoItems() {
		checkout.add(1,10);
		checkout.subtract(2);
		assertEquals(0, checkout.itemCount());
	}
	
	@Test
	public void testTotalofTen() {
		checkout.add(1, 10);
		assertEquals(10, checkout.total());
	}
	
	@Test
	public void testTotalofTwoItemsTwentyTotal() {
		checkout.add(2, 10);
		assertEquals(20, checkout.total());
	}
	
	@Test 
	public void testTotalWhenAddingSameItemTwice() {
		checkout.add(1, 20);
		checkout.add(1, 20);
		assertEquals(40, checkout.total());
	}
}
