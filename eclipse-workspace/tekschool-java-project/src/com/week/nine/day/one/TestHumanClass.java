package com.week.nine.day.one;

public class TestHumanClass {
public static void main(String[] args) {
	Human object = new Human(); // subclass to child and everything in parent
	object.setfirstName("Michelle");
	object.setlastName("Williams");
	
object.print();
	
BaseClass obj = new Human();
obj.print();

BaseClass parent = new BaseClass();
parent.print();

}
}