package com.org.reward.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
* The CustomerDetails program that maintain application state model
*
* @author  Pritee
* @version 1.0
* @since   05-07-2022
*/
public class CustomerDetails {
	private String customerId;
	private String customerName;
	private String customerAddress;
	private Double spentAmount;
	private Double rewardPoint;

	public String getCustomerId() {
		return customerId;
	}

	@Override
	public String toString() {
		return "CustomerDetails [customerId=" + customerId + ", customerName=" + customerName + ", customerAddress="
				+ customerAddress + ", spentAmount=" + spentAmount + ", rewardPoint=" + rewardPoint + "]";
	}

	public CustomerDetails(String customerId, String customerName, String customerAddress, Double spentAmount,
			Double rewardPoint) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.spentAmount = spentAmount;
		this.rewardPoint = rewardPoint;
	}

	public CustomerDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public Double getSpentAmount() {
		return spentAmount;
	}

	public void setSpentAmount(Double spentAmount) {
		this.spentAmount = spentAmount;
	}

	public Double getRewardPoint() {
		return rewardPoint;
	}

	public void setRewardPoint(Double rewardPoint) {
		this.rewardPoint = rewardPoint;
	}

}
