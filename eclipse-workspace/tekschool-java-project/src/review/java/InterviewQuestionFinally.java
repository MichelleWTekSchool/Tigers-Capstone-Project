package review.java;

import java.util.Scanner;

public class InterviewQuestionFinally {
	public class ExceptionHandling {
		public void main(String[] args) {
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
			}finally {  //when will this finally execute? Always after try or catch block. No matter what.
						//Is there any scenario where finally will not execute? Always, unless one scenario...
						//you exit the app before it reached that point and turn off when you leave. System.exit();
				scanner.close();
		}
	}
	}
}
