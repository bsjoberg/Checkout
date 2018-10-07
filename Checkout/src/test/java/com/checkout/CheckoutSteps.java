package com.checkout;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CheckoutSteps {
	private int bananaPrice = 0;
	private int applePrice = 0;
	private Checkout checkout;
	
	@Given("^the price of an? \"([^\"]*)\" is (\\d+)c$")
	public void thePriceOfAIsC(String name, int price) throws Throwable {
	    checkout = new Checkout();
	    
	    if (name.equals("banana"))
	    	bananaPrice = price;
	    else if (name.equals("apple"))
	    	applePrice = price;    	
	}

	@When("^I checkout (\\d+) \"([^\"]*)\"$")
	public void iCheckout(int itemCount, String itemName) throws Throwable {
		if (itemName.equals("banana"))
			checkout.add(itemCount, itemName, bananaPrice);
		else if (itemName.equals("apple"))
			checkout.add(itemCount, itemName, applePrice);
	}

	@Then("^the total price should be (\\d+)c$")
	public void theTotalPriceShouldBeC(int total) throws Throwable {
	    assertEquals(total, checkout.total());
	}

}
