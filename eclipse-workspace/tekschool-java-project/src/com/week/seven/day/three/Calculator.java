package com.week.seven.day.three;

public class Calculator {
	public double firstNumber;
	public double secondNumber;
	
	//constructor of this class
	
	public Calculator(double firstNumber , double secondNumber) {
		this.secondNumber = secondNumber;
		this.firstNumber = firstNumber;
		
	}
	public double doAdding() {
		return this.firstNumber + this.secondNumber;
	}
	
	public double doSubtraction() {
		return this.firstNumber - this.secondNumber;
	}
	
	public double doMultiplication() {
		return this.firstNumber * this.secondNumber;
}
}