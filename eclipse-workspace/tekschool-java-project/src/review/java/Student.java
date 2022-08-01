package review.java;

public class Student { // create an object and also use as a data type
	//Create objects
	private long studentId;
	private String fullName;
	
	//Instantiate with a constructor
	public Student() {}
	public Student (long studentId, String fullName) {
		this.studentId=studentId;
		this.fullName = fullName;
	}
	public void setStudentId(Long studentId) {//setters
		this.studentId = studentId;
	}
	public long getStudentId() {//getters
		return this.studentId;
	}
	public void setfullName(String fullName) {//setters
		this.fullName = fullName;
	}
	public String getfullName() {//getters
		return this.fullName;
	}
} 