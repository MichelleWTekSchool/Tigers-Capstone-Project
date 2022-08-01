package notes.java;
import java.util.Scanner;
public class Replit521 {

public static void main(String[] args) {
Scanner userInput = new Scanner(System.in);
System.out.println("Please enter integer number");
int number = userInput.nextInt();



while (number > 0) {

if (number % 10 == 3 || number % 3 == 0) {

System.out.println(number);
}
number--;
}}
}