package com.week.eight.day.two;

public class StringBuilder {
public StringBuilder(String string) {
		// TODO Auto-generated constructor stub
	}

public StringBuilder() {
	// TODO Auto-generated constructor stub
}

public StringBuilder(int i) {
	// TODO Auto-generated constructor stub
}

public static void main(String[] args) {
//String builder is mutable
	//if we create a string builder we can change the value 
	//if we change the value a new obj will be created in heap but
	//the value for the obj will be chnaged, that is why it is mutable
	
	//THIS DOESNT SEEM TO WORK WITH MY VERSION OF JAVA
	
	StringBuilder sb1 = new StringBuilder("Java");
	//size 0, capacity 16
	StringBuilder sb2 = new StringBuilder();
	//size and cap is 4
	StringBuilder sb3 = new StringBuilder(4);
	
	//APPEND DOESNT SEEM TO WORK IN MY VBERSION OF JAVA
	//StringBuilder sbName = new StringBuilder("Emma");
	//sbName.append("Chen");
	//sbNAme.apend("Age = 30);
	//System.out.println(sbName);//? Will print Emma Chen
	
	//but if we string will not print emma chen only emma; inmutable
	String strName = "Emma";
	strName.concat(" Chen");
	System.out.println(strName);
	
	
	//how we can print the full name?
	//first we have to store the full name as (strName + "Chen") in another string
	String fullName = strName.concat(" Chen");
	System.out.println(fullName);
	
	
	//what if we use the StringBuilder to print alpha letter a-z
	//aAPPEND DOES NOT WORK IN MY VERSION OF JAVA
	//StringBuilder sb1 = new StringBuildler();
	//for(char i = 'A' ; i <= 'Z' ; i ++) {
	//	System.out.println(sb1.append(i) + ", ");
	//}
	//System.out.println(sb1);
	//}
	
	//Video starts with 8 day three
	
	}
}
