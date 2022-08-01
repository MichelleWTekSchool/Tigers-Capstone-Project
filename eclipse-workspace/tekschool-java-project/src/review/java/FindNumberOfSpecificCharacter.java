package review.java;

public class FindNumberOfSpecificCharacter {
public static void main(String[] args) {
	
	String text = "arizona";
	
	//find how many are there
	
	char[]characters = text.toCharArray();
	
	int count = 0;
	for(int i = 0 ; i < characters.length ; i ++) {
		if(characters[i] == 'a') {
			count ++;
		}
	}
	System.out.println(count);
}
}
