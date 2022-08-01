package com.week.eight.day.three;

public class StringBuilderMethods {
public static void main(String[] args) {
	//most methods are shared between String and StringBuilder
	//but there are some methods that are only for StringBuilder
	
	StringBuilder sb1 = new StringBuilder ("Tekschool Classes");
	System.out.println(sb1.insert(3, '-'));
	System.out.println(sb1.deleteCharAt(3));
	System.out.println(sb1.delete(9, 17));
	String name = "Tekschool";
	
	//--------------------------
	String reversedText = "";
	for(int i = name.length() - 1 ; i >=0; i --) {
		reversedText = reversedText + name.charAt(i);
	}
	System.out.println("Reverse a STRING " + reversedText);
	//---------------------------
	System.out.println("Reverse a STRINGBUILDER " + sb1.reverse());
	//---------------------------
	String subject = "Java";
	StringBuilder sb2 = new StringBuilder(subject);
	System.out.println("Covert to StringBuilder and then reverse: " + sb2.reverse());
	
	
	

}}