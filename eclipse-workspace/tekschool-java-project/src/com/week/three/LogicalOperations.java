package com.week.three;

public class LogicalOperations {
public static void main(String[] args) {
	
	// Logical operators are
	
	// && (AND) => return true only if both relational operations are true
	// || (OR) => return true only if one if the relational operations is true
	// ! (NOT) => return true if condition of value is false
	
	boolean numberA = 10 == 10;
	boolean numberB = 20 == 30;
	
	// Example for AND &&
	boolean checkAndCondition = numberA && numberB;
	System.out.println(checkAndCondition);
	
	boolean checkAndCondition2 = numberA || numberB;
	System.out.println(checkAndCondition2);
	
	boolean checkAndCondition3 = numberA = ! numberB;
	System.out.println(checkAndCondition3);
	
	
	
}
}
