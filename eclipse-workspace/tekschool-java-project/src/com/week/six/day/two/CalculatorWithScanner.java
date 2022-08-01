package com.week.six.day.two;

import java.util.Scanner;

public class CalculatorWithScanner {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		CalculatorService service = new CalculatorService();//instantiate and object of class
		
		System.out.println("Enter first number: ");
		service.firstNumber = scanner.nextDouble();//assign data to member of class (calc service in this case)
		
		System.out.println("Enter second number: ");
		service.secondNumber = scanner.nextDouble();
		
		service.doSubtraction();//calling the method doSubtraction from calc service
		scanner.close();
		
	}
}
