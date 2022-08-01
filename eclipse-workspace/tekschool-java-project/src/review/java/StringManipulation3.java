package review.java;

public class StringManipulation3 {
//welcome to tekschool
	//Below: overloading is part of polymorphism; and overriding is too
	public static void main(String[] args) {
		String text = "Stress here";
		
		
		
//		int firstIndex = text.indexOf("e");//locates e 
//		int secondEIndex = text.indexOf("e" , firstIndex +1);///looking for 2nd e
//		System.out.println(secondEIndex);
		
		
char[] characters = text.toCharArray();//finds the e's on the index
for(int index = 0 ; index < characters.length ; index ++) {
	
	if(characters[index] == 'e') {
		System.out.println(index);
	}
}
	}
}
