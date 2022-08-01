package notes.java;
import java.util.Scanner;
public class Replit441 {
	public static void main(String[] args) {

		  String [] cityNames = new String[5];
		  
		    System.out.println("Please enter city name");
		    Scanner scanner = new Scanner(System.in);
		    Scanner userInput = new Scanner(System.in);
		    //userInput = scanner.nextInt();
		for (int i = 0; i < cityNames.length; i ++) {
		    cityNames[i] = userInput.nextLine();
		  }
		   userInput.close();
		  
		  for (int i = 0; i < cityNames.length; i ++) {

		    String city = cityNames[i];
		    if (city.startsWith("D")) {
		      System.out.println(city);
			scanner.close();
}}}}