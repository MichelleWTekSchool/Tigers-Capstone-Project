package review.java;

public class UtilityClass {
	
	public void firstLetterToUpperCase(String name) {
		
		char firstChar = name.charAt(0);
		
		String firstCharInString = String.valueOf(firstChar).toUpperCase();
		
		String restOfLetters = name.substring(1);
		
		System.out.println(firstCharInString + restOfLetters);
	}

}
