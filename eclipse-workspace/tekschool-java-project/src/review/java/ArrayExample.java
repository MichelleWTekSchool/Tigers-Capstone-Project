package review.java;

public class ArrayExample {
public static void main(String[] args) {
	Object[] objects = new Object[5];
	
	//objects can hold any value
	objects[0] = "Some Name";
	objects[1] = 1000;
	objects[2] = true;
	objects[3] = 1.43;
	
	UtilityClass utility = new UtilityClass();
	objects[4] = utility;
	
	for(Object obj : objects) {
		utility.firstLetterToUpperCase(obj.toString());
		
	}
}
}
