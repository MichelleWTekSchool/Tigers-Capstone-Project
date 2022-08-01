package com.week.six.day.two;

public class BasicCalculatorTwo {
	
	public static void main(String[] args) {
		
		CalculatorService calculator = new CalculatorService();
		calculator.firstNumber = 100;
		calculator.secondNumber = 20;
		
		calculator.doAdding();
		calculator.doSubtraction();
		calculator.doMultipication();
		calculator.doDivision();
		calculator.doRemained();
		
		
	}}	
		
		//double firstNumber = 100;
		//double secondNumber = 10;
		
		//double addResult = firstNumber + secondNumber;
		//System.out.println("Result for addition is " + addResult);
		
		//double subResult = firstNumber - secondNumber;
		//System.out.println("Result for subtraction is " + subResult);
		
	//	double multResult = firstNumber * secondNumber;
	//	System.out.println("Result for multiplication is " + multResult);
		
	//	double quoResult = firstNumber / secondNumber;
	//	System.out.println("Result for division is " + quoResult);
		
	//	double remResult = firstNumber % secondNumber;
		//System.out.println("Result for remainder is " + remResult);
	//}}