package com.checkout;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CheckoutSteps {
	private int bananaPrice = 0;
	
	@Given("^the price of a \"([^\"]*)\" is (\\d+)c$")
	public void thePriceOfAIsC(String name, int price) throws Throwable {
	    bananaPrice = price;
	}

	@When("^I checkout (\\d+) \"([^\"]*)\"$")
	public void iCheckout(int itemCount, String itemName) throws Throwable {
	    Checkout checkout = new Checkout();
	    checkout.add(itemCount, bananaPrice);
	}

	@Then("^the total price should be (\\d+)c$")
	public void theTotalPriceShouldBeC(int arg1) throws Throwable {
	    throw new PendingException();
	}

}
