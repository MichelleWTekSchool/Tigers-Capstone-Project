package review.java;

public class TestStudents {
	public static void main(String[] args) {
		Student student1 = new Student(1234566L, "Alex Morgan");
		System.out.println("Student Name: "  + student1.getfullName());
		System.out.println("Student Id: " + student1.getStudentId());
	}

}
