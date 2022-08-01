package com.week.six.day.two;

public class CalculatorService {
	
	//this is the code that the other methods are executing from in BasicCalculator 1 & 2
	
	double firstNumber;
	double secondNumber;
	
	public void doAdding() {
		double addResult = firstNumber + secondNumber;
			System.out.println("Addition result " + addResult);
	}	
	public void doMultipication() {
		double multResult = firstNumber * secondNumber;
			System.out.println("Result for multiplication is " + multResult);
	}
		
	public void doSubtraction() {
		double subResult = firstNumber - secondNumber;
			System.out.println("Result for subtraction is " + subResult);
	}		
	public void doDivision() {
		double divResult = firstNumber / secondNumber;
			System.out.println("Result for division is " + divResult);
	}		
	public void doRemained() {
		double remResult = firstNumber % secondNumber;
			System.out.println("Result for remainder is " + remResult);
}}