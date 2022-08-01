package come.week.six.day.one;

public class Item {
	String name;
	double price;
	double quantity;
	
	//create method for total price
	///method signature, method body, and parameters* (*if needed)
	
	public double getTotalPrice() {
		//method body
		double totalPrice = price * quantity;
		
		//can not have code after this line
	
	return totalPrice; //can not have any code after this line
	
	//any code after return can not will not be executed
	//java will terminate result (compile error)
}
}