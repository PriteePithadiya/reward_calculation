package com.org.reward.test;

import com.org.reward.model.CustomerDetails;

public class StudbData {
  public CustomerDetails getCustomerDetails() {
	  
	  CustomerDetails customerDetails=new CustomerDetails();
	  customerDetails.setCustomerAddress("Texas");
	  customerDetails.setCustomerId("12345");
	  customerDetails.setCustomerName("Sham");
	  customerDetails.setSpentAmount(120.00);
	  
	  return customerDetails;
	  
  }
}
