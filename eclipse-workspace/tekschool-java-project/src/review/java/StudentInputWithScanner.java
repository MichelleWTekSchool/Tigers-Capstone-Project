package review.java;

import java.util.Scanner;

public class StudentInputWithScanner {
	
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	Student student = new Student();
	
	System.out.println("Enter Student Id:");
	long id = scanner.nextLong();
	System.out.println("Enter Student Name:");
	String name = scanner.next();
	
	student.setfullName(name);
	student.setStudentId(id);
	
	scanner.close();
	
}
}
