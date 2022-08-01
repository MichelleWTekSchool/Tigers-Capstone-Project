package com.week.eight.day.three;

public class InheritanceRunner {
public static void main(String[] args) {
	InheritanceSuper obj1 = new InheritanceSuper ("Alrington VW" , "22 Parkway Drive, Arlington VA 33454");
	System.out.println(obj1.printListOfVWModels());
	System.out.println("\n===================================\n");
	InheritanceSub obj2 = new InheritanceSub("Porsche VA" , "55 court cir, Alexandria VA 33434");
	System.out.println(obj2.printAllPorscheModel());
	
	//What if POrsche wants a list og VW models
	//we are chaining constructor and Porsche already has access to list of trims?
	//and print list of all vw trims?
	
}
}
