package com.week.nine.day.one;

public class BanksTest {
public static void main(String[] args ) {
	Bank capBank = new CapitolOne(); //bank is the object but this refers to child (Capitol One) for the object); this calls the obj
	float rate = capBank.getInterestRate();//this calls the method
	
	System.out.println(rate);
	
	//Super class //refers to subclass
	Bank wellsBank = new WellsFargo();
	float wellsRate = wellsBank.getInterestRate();
	
	System.out.println(wellsRate);
	
}
}
