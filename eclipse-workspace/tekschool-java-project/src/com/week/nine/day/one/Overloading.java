package com.week.nine.day.one;

public class Overloading {
	
	//Methods can not remain the same while overloading
	
public void doAdding(int first, int second) {
	int result = first + second;
	System.out.println("From int parameters " + result);
	
} 
public void doAdding(double first , double second) { //changed data type
	double result = first + second;
	System.out.println("From dbl parameters " + result);
	
}
public void doAdding(int first , int second , int third) { //added a third 
	double result = first + second + third;
	System.out.println("From int parameters " + result);
	
}
public void doAdding(String first , String second)	{
	double result = Double.parseDouble(first) + Double.parseDouble(second); //parse is...
	System.out.println("From dbl parameters " + result);
	
}
}
