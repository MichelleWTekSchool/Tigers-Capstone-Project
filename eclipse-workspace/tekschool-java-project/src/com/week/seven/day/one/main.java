package com.week.seven.day.one;

public class main {
	public static void main(String[] args) {
		int[] numbers = { 10 , 20 , 30, 40, 50 , 60 , 66, 78};
	
		Service object = new Service();
	
		int result = object.getSum(numbers);
		System.out.println(result);
	
	
}
}