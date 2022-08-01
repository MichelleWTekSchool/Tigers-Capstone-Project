package com.week.six.day.three;

public class AccessModifier {
		
		public String firstName; // access is in method, class and variable to all
		
		protected String lastName; // access is in a package or class
		
		private int age; // private method is just living inside the same class and not accessible outside
		
		String address; //same access as level for protect - known as a default
		
		public void doSomething() {}
		
		private void doAdding() {}
		
		protected String returnSokmeString() { return null;}
		
		void methodWithoutAccessModifier() {}
		
		
	}