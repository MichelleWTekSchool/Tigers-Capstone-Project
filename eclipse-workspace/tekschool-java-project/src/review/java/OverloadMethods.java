package review.java;

public class OverloadMethods {
	//is happening during compile time
	//is polymorphism
	//same parameters 
	//same class
public void doAdd(int first , int second) {//doAdding is the overload 3x
	System.out.println(first + second);
}
public void doAdd(double first , double second) { //did it here and added new info
	System.out.println(first + second);
	
}
public void doAdd(int first) {//did it here too with new parameters
	System.out.println(first + 10);
	
	
}
}