package com.week.two.day.three;

public class StringConcatExample {
	
public static void main(String[] args) {
	
	String address1 = "1234 Lee Highway ";
	String address2 = "suite 234";
	
	//USPS format all uppercase in one line
	
    String fullAddress = address1.concat(address2);
    System.out.println(fullAddress);

    String AddressInUpper = fullAddress.toUpperCase();
    System.out.println(AddressInUpper);
	
}
}
