package review.java;

public class LoopingWithForLoop {
	public static void main(String[] args) {

		//Count 1 - 10
		
		for(int counter = 1 ; counter <= 10 ; counter ++) {
			System.out.println(counter);
		}
		//counter 10 -1
		for (int counter = 10 ; counter >=1 ; counter --) {
			System.out.println(counter);
			
		//loop some code for 1 minute but wait for two seconds at each loop;Most important thing to remember
		for (int timer = 0 ; timer <= 60 ; timer += 2) {//the 2 helps it increment to run for a minute
		//do some kind of logic
			System.out.println(timer);
			
			//wait for 2 seconds
			try {
			Thread.sleep(2000);//will go by milliseconds 2 seconds = 2k
			}catch(Exception e) {
				System.out.println(e.getMessage());
				
		
		}
	}
}
}
}