package review.java;

import com.week.seven.day.one.main;

public class StringManipulation {
	public static void main(String[] args) {
		
		int age = 35; //'age' is variable name ; 35 is value ; = is the assignment
		//Lower caMel case: Naming convention rule for variable name
		
		double taxRate = 1.34;
		
		String name = "Matin Bahramy";
		
		//using methods to return a new string
		String nameUpperCase = name.toUpperCase();//How can I make this all upper case
		
		int indexOfSpace = name.indexOf(' ');//return the index
		
		String[] splittedName = name.split(" ");//Split the string because the text is long etc
		System.out.println(splittedName[0].toUpperCase());
		System.out.println(splittedName[1].toLowerCase());
		
		//make first letter of first name upper case
				String firstName = "michelle";
				char firstLetter = firstName.charAt(0);//locate the first letter
				System.out.println(firstLetter);
				char firstLetterName = Character.toUpperCase(firstLetter);//upper case the first letter
				System.out.println(firstLetterName);
				String restOFLetters = firstName.substring(1);//Identifies the m = ichelle
				System.out.println(firstLetterName + restOFLetters);//String M to the + ichelle
		
	}

}
