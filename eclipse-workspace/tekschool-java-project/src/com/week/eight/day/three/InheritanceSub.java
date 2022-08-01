package com.week.eight.day.three;

import java.util.Arrays;

public class InheritanceSub extends InheritanceSuper {
//Porsche
	
	String[] porscheModels;
	
	public InheritanceSub(String dealershipName , String address) {
		super(dealershipName , address);
		this.porscheModels = new String[3];
		
		porscheModels[0] = "Z1";
		porscheModels[1] = "Z2";
		porscheModels[2] = "Z3";
	}
	public String printAllPorscheModel() {
		return "List of Porsche Models available at " + super.getdealershipName() + " dealership " + Arrays.toString(porscheModels)
		+ "\nAddress = " + super.getAddress() + "\n"
		+ "List of VW Models avail at " + super.getdealershipName() + " dealership " + Arrays.toString(vwModels)
		+ "\nAddress = " + super.getAddress() ;
	}
}
