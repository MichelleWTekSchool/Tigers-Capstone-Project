package com.week.seven.day.three;

public class RecapThis {
	
	public String firstName;
	
	public RecapThis() {
		if (this.firstName == "Michelle") {
			//Do login
			
		}else {
			//do other logic
		}
	}
	
	public RecapThis(String firstName) {
		this();//chain it with empty parenthesis
		this.firstName = firstName;
	}
	
	public void doSomething() {
		this.firstName = "Michelle";
		
	}

}
;