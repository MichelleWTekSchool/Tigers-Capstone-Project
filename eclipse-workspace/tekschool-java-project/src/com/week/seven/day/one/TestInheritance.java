package com.week.seven.day.one;

public class TestInheritance {
public static void main(String[] args) {
	//Declare object of parent
	
//	 Parent parent = new Parent();
//	parent.parentMethod();
	
	///parent. :: can not inherit from child method
	
	ChildOne child = new ChildOne();
	/// child. :: child inheritance pulls list of methods from parent and never its child sub classes
	
	child.parentMethod();
		child.printhairColor();
	
	ChildFour ChildFourObject = new ChildFour();
	ChildFourObject.printhairColor();
	
	ChildFourObject.childFourMethod();
}
}
