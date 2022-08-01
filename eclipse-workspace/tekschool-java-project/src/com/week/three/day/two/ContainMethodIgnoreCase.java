package com.week.three.day.two;

public class ContainMethodIgnoreCase {
	public static void main(String[] args) {
		
		String gender = "FEMALE";
		
		String genderAllInLowerC = gender.toLowerCase();
		
		boolean check = genderAllInLowerC.contains("female");
		
		System.out.println(check);
	}

}
