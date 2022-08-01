package review.java;

public class inheritAnceTest {
public static void main(String[] args) {
	
	FirstChild object = new FirstChild("This is from implementation firstChild");
		
	object.fromgrandParent();	
	object.fromParent();
	object.fromFirstChild();
	
	//secondChild obj = new secondChild("This is from implementation secondChild");//multi level inheritance
	//obj.fromgrandParent();
	
	System.out.println("Values get passed down through chaining");
}
}
