package review.java;

import java.util.ArrayList;
//you would have had t import student if it wasnt in this package already
public class ArrayListStudentEx2 {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		Student student1 = new Student(1234, "Alex Morgan");
		list.add(student1);
		Student student2 = new Student(432, "Tom Hanks");
		list.add(student2);
		Student student3 = new Student(987, "Zeke Fazly");
		list.add(student3);

		System.out.println(list.size());

		for (Student student : list) {
			System.out.println(student.getStudentId() + " " + student.getfullName());
		}
	}

}