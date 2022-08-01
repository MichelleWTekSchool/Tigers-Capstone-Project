package com.week.eight.day.one;

import java.util.Arrays; //video at 1:04

public class Practice2 {
	public static void main(String[] args) {
		String str1 = "Virginia";
		//but here we are saying str1 = null
		str1 = null;
		//so if str2 points to the same obj as str1'
		//that means both str1 &2 are pointing to nothing
		String str2 = "Virginia";
		//System.out.println(str2);
		
		String str3 = new String ("New York");
		String str4 = str3;//equals ny
		str4 = null;//now equals nothing
		System.out.println(str4);
		System.out.println(str3);
		
		String givenName = "John";
		String firstName = new String ("John");
		String lastName = new String ("John");
		
		//==
		//.equal();
		System.out.println(firstName.equals(lastName));//value of objects compared; john = 2 == mark = 2; value 2 is same
		System.out.println(firstName == lastName);//objects compared; 2 == 2
		
				
		//int [] arr = {1,2,3};
		//System.out.println(arr);
		//System.out.println(Arrays.toString(arr));
	}

}
