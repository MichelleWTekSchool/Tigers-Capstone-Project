package review.java;

public class FirstChild extends Parent {

	public FirstChild(String someText) {
		super(someText);
	}

	public void fromFirstChild() {
		System.out.println("This is from child");
	}
}
