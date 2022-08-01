package com.week.one.day.three;

public class StringRealWorkEx {
	
	public static void main(String[] args) {
		
		//20221213
		//00012360
		//001
		
		//Date 8 in length.
		//amount length of 7
		//some code length of three
		
		String text = "202212130001236001";
		String date = text.substring(0,8);
		String amount = text.substring(8,15);
		String code = text.substring(15);
		
		System.out.println("Date is " + date);
		System.out.println("Amount is " + amount);
		System.out.println("Code is " + code);
		
	}

}
