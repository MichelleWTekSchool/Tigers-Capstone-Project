package com.week.eight.day.two;

public class SomeOfStringMethodInJava {
	public static void main(String[] args) {
		//There are dozens of methods that are coming from java class
		//but there are important ones to know
		
		String name = "Tom";
				//length();
		System.out.println(name.length());
		
		//Character at a specific index
		System.out.println(name.charAt(2));
		
		//index of character of a string
		System.out.println(name.indexOf('T'));
		
		//we can get a substring of a string
		System.out.println(name.substring(1));
		System.out.println(name.substring(1,3));
		
		//to character to lowercase
		System.out.println(name.toLowerCase());
		
		//to uppercase
		System.out.println(name.toUpperCase());
		
		//startswith => will return with a boolean either T or F
		System.out.println(name.startsWith("T"));
		
		//ends with => will return with a boolean either T or F
		System.out.println(name.endsWith("M"));
		
		//contains => will return with a boolean either T or F
		System.out.println(name.contains("o"));
		
		//replace characters
		String fullName = "Michelle Williams";
		System.out.println(fullName.replace('i', 'u'));
		System.out.println(fullName.replace("Michelle" , "Tina"));
		String text = "My salary is $5000 after 12% tax";
		System.out.println(text.replaceFirst("[1-90%]", "*"));
		
		//Trim Method
		String name1 = "  Emma";
		System.out.println(name1);
		System.out.println(name1.trim());
	
		//Equals => the lower and upper case matters
		String name2 = "Carmen";
		String name3 = "Carmen";
		System.out.println("Equals: " + name2.equals(name3));
		
		//Equal ignore case => lower and upper case letter does not matter
		String city1 = "Tysons Corner";
		String city2 = "TYSONS CORNER";
		System.out.println(city1.equalsIgnoreCase(city2));
		
		//content
		String state1 = "Virginia";
		String state2 = "Maryland";
		System.out.println(state1.contentEquals(state2));
	}
}
