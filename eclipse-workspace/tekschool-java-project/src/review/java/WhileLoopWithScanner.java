package review.java;

import java.util.Scanner;

public class WhileLoopWithScanner {
	
//if you know the start and end go with for loop; otherwise choose while loop
//Continue asking user input until user enters 20
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			int number = 0;
			
			while(number != 20) {
				System.out.println("Guess the correct number:");
				number = scanner.nextInt();
				
				if (number == 20) {
					System.out.println("20 is the correct number!");
					scanner.close();
				}
			}	
	}
}