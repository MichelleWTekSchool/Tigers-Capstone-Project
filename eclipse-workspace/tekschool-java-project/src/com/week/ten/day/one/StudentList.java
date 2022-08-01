package com.week.ten.day.one;
import java.util.ArrayList;
public class StudentList {
	
public static void main(String[] args) {
	
	ArrayList<Student> studentsList = new ArrayList<>();//pulling object of <Student>
	
		Student first = new Student("Williams", "Michelle", 70);
		studentsList.add(first);
		
		Student second = new Student("Donna", "Hot", 21);
		studentsList.add(second);
		
		Student third = new Student("Depp", "Johnny", 50);
		studentsList.add(third);
		
		System.out.println(studentsList.size());
		
		for( Student student : studentsList) {
			System.out.println("Student first Name " + student.getFirstName()
			+ " Student Last Name " + student.getLastName() 
			+ " Student Score " + student.getScore());
		
		}
}
} 