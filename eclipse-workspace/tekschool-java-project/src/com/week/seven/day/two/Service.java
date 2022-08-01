package com.week.seven.day.two;

public class Service {
		
		public Service(int number) {
			System.out.println("Constructor with 1 parameter " + number);
			
		}
		
		public Service(int number, String text) {
			this(number);
			System.out.println("This is constructor with 2 parameters " + text);
			
		}
	}