package com.week.six.day.two;

public class BasicCalculator {
//create 2 numbers and do adding, mult, subtraction and divi
	
	public static void main(String[] args) {
	
	CalculatorService service = new CalculatorService();
	
	service.firstNumber = 10.21;
	service.secondNumber = 2.31;
	
	//use the object and call the method to do the functionality
	service.doAdding();
	service.doDivision();
	service.doRemained();
	service.doSubtraction();
	service.doMultipication();
	
	
	
	}
}
	
	
	
	//public static void main(String[] args) {
	
	//double firstNumber = 10.21;
	//double secondNumber = 2.31;
	
	//double addResult = firstNumber + secondNumber;
	//System.out.println("Result for addition is " + addResult);
	
	//double subResult = firstNumber - secondNumber;
	//System.out.println("Result for subtraction is " + subResult);
	
	//double multResult = firstNumber * secondNumber;
	//System.out.println("Result for multiplication is " + multResult);
	
	//double quoResult = firstNumber / secondNumber;
	//System.out.println("Result for division is " + quoResult);
	
	//double remResult = firstNumber % secondNumber;
	//System.out.println("Result for remainder is " + remResult);
	//}}
		
