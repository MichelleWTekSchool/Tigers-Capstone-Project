package come.week.six.day.one;

public class BreakExample {
	public static void main(String[] args) {
		int[] numbers = {10 , 102, 123, 45, 1234, 
				34, 12367, 12, 12, 1456, 12, 876, 2356,
				12, 64, 34567, 12, 876, 54};
		int counter = 0;
		
		for (int index = 0 ; index < numbers.length; index ++) {
		
		if(numbers[index] == 12) {
			System.out.println("Found 12 on index " + index);
			counter ++; // tells you how many to get of the 12s
			
		}
		if (counter == 3) {
			break;
		}
	}
}}