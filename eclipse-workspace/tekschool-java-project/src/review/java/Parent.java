package review.java;

public class Parent extends grandParent {
	
	public Parent(String text) {//constructors in parenthesis
		super(text); //used to chain constructors; without this will not instantiate in grandParent constructor
	}
	public void fromParent() {
		System.out.println("This is parent");
	}

}
