package review.java;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ScannerInputMismatchEx {
public static void main(String[] args) {
	//how to handle user input
	//You ask enter and should provide integer if not handle it
	
	//TODO find a solution for infinite loop
	
	boolean flag = false;
	while(!flag) {
		Scanner scanner = null;
		
		try {
			scanner = new Scanner(System.in);
			System.out.println("Enter any number");
			int number = scanner.nextInt();
			System.out.println(number);
			flag = true;
			scanner.close();
			
		} catch (InputMismatchException e) {//Multiple catch block in one try block? : Yes, as many as you want (interview question)
			System.err.println("Please provide numbers");
			flag = false;
			
		}catch (NoSuchElementException e) {
			System.err.println("Please provide numbers");
			flag = false;
		}
	}
}
}
