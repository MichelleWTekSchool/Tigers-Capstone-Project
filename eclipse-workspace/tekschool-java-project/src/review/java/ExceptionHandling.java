package review.java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
		System.out.println("Enter first number");
		
		int first = scanner.nextInt();
		System.out.println("Enter second number");
		
		int second = scanner.nextInt();
		int result = first / second;
		System.out.println(result);
		}catch (Exception e) { //this is literally the only exception to need to know
			System.err.println("Wrong Input" + e.getMessage());
		}finally {
			scanner.close();
	}
}
}