package com.myexample.dao;

import com.myexample.model.Employee;


public enum IneligibilityReasonMappings {
  INSUFFICIENT_CREDIT_LIMIT(IneligibilityReason.INSUFFICIENT_CREDIT_AVAILABLE),

  
  public Test(Size pizzaSize) {
	   this.pizzaSize = pizzaSize;
	 }
	 public void orderPizza() {
	   switch(pizzaSize) {
	     case SMALL:
	       System.out.println("I ordered a small size pizza.");
	       break;
	     case MEDIUM:
	       System.out.println("I ordered a medium size pizza.");
	       break;
	     default:
	       System.out.println("I don't know which one to order.");
	       break;
	   }
	 }
  private final IneligibilityReason ineligibilityReason;
}