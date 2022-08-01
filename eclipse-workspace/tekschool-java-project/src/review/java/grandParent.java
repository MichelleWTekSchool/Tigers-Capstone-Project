package review.java;

public class grandParent {

	public String someString;

	public grandParent(String someString) {
		this.someString = someString;
	}

	public void fromgrandParent() {
		//System.out.println("This is from the grandparent " + this.someString);//multilevel inheritance
		System.out.println("This is from the grandparent ");
	}
}