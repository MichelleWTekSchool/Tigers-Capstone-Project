package review.java;

public class WhileLoop {
	
	public static void main(String[] args) {
			//Count 1 to 10
			
		int counter = 1;
//			
//			while(counter <= 10) {
//				System.out.println(counter);
//				counter ++;	
//			}
		while(counter <= 1000) {
			System.out.println(counter);
			
			//stop looping at counter = 10
			if (counter == 20) {
				break;
		}
			counter ++;
	}
}
}