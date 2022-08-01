package review.java;

public class ArrayDeclaration {
	public static void main(String[] args) {

		// int[] numbers = new int[5]; //Good for pulling from information in another class
		int[] numbers = { 11, 2, 3, 40, 52, 63, 79, };// Hard coded value
		
		//find even and odd numbers
		
		for(int i = 0 ; i < numbers.length ; i ++) { //Making a loop
			
			int number = numbers[i];
			if(number % 2 == 0) { //Storing in a new variable
			System.out.println("Number is even " + number);
			
			}else { //loop if not %2
				System.out.println("Number is odd " + number);//Storing in new variable
			}
		}
	}
}
//148-ish video