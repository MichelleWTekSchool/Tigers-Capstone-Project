package come.week.six.day.one;

public class BreakTheStatements {
public static void main(String[] args) {
	
	int[] numbers = {10, 20 , 30 , 40 , 50, 12 , 120, 12};
	//Find number 12 in this array
	//index 5
	
	//create a loop
	for (int index = 0 ; index < numbers.length ; index ++) {
	
	//condition to find the 12 - index 5
	if (numbers[index] == 12) {
		System.out.println("Found 12 on index" + " " + index );
		break; // ends the loop at the right placement 
		//only if we are expecting 12 only once
		//if you want to find more than one  don't break; it
		//scanner uses close; but break; terminates a loop
	}}}}


