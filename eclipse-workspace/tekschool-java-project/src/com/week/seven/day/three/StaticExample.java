package com.week.seven.day.three;

public class StaticExample {
public static void main(String[] args) {
	
	Constants object1 = new Constants();
	object1.number = 12345567;//this number is static; shares amount with all other objects based on execution process
	System.out.println("Object 1 " + object1.number);
	
	Constants object2 = new Constants();
	System.out.println("Obejct 2 number " + object2.number);
	
	Constants object3 = new Constants();
	System.out.println("Obejct 3 number " + object3.number);
	
	Constants object4 = new Constants();
	object4.number = 9876543; //now object4 onward shares same NEW value
	System.out.println("Obejct 4 number " + object4.number);
	
	Constants object5 = new Constants();	
	System.out.println("Obejct 5 number " + object5.number);
	
}
}
