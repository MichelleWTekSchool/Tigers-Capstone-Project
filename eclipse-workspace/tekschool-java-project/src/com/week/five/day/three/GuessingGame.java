package com.week.five.day.three;

import java.util.Scanner;

public class GuessingGame {
	
	public static void main(String[] args) {
		//java will pick a random number 1-50
		//then we have to guess
	
		double random = Math.random() * 50;
		int randomInteger = (int) random;
		
		Scanner scanner = new Scanner(System.in);
				int guessedNumber = 0;
		
		while (guessedNumber != randomInteger) {
			System.out.println("Guess a number");
			guessedNumber = scanner.nextInt();
			
			if (guessedNumber == randomInteger) {
			System.out.println("Hooray you guessed it!");
			
			}else if (guessedNumber < randomInteger) {
			System.out.println("Almost there guess higher");
			
			}else if (guessedNumber > randomInteger) {
			System.out.println("Go lower");
			} else
			System.out.println("Try Again");
			}}}
