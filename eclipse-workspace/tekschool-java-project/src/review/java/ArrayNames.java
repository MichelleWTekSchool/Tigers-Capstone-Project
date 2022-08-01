package review.java;

public class ArrayNames {
	public static void main(String[] args) {
		
		String[] names = new String[5];
		
		names[0] = "michelle";
		names[1] = "tumnus";
		names[2] = "pickles";
		names[3] = "clea";
		names[4] = "keke";
		
		
		UtilityClass utility = new UtilityClass();
		
		for(int i = 0; i < names.length ; i ++) {
			utility.firstLetterToUpperCase(names[i]);
		}
	}
}
