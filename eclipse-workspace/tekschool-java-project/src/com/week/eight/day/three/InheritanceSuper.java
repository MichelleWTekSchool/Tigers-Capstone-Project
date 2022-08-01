package com.week.eight.day.three;

import java.util.Arrays;

public class InheritanceSuper {
//VW
	
	String[] vwModels;
	private String dealershipName;
	private String address;
	
	public InheritanceSuper(String dealershipName , String address) { 
	this.vwModels = new String[3];
	
	vwModels[0] = "vw X1";
	vwModels[1] = "vw X2";
	vwModels[2] = "vw X3";
	
	this.dealershipName = dealershipName;
	this.address = address;
}
	//get method
	public String getdealershipName() {
		return dealershipName;
	}
	public void setDealershipNAme(String dealershipName) {
	this.dealershipName = dealershipName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String printListOfVWModels() {
		return "List of VW Models Available at " + this.getdealershipName() + Arrays.toString(vwModels) + this.getAddress();
		
	}
} //video at 2:08
