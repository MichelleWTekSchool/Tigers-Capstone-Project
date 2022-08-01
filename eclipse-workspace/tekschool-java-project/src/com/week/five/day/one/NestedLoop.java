package com.week.five.day.one;

public class NestedLoop {
	
	public static void main(String[] args) {
		//1 x 1 - 1 = 1, 3x
		//0-10 to each other
		
		for (int row = 0; row <= 3; row ++ ) {
			
			for (int col = 0 ; col <=3; col ++) {
				
				int number = row * col;
				
				System.out.print(row + " x " + col + " + " + number + "\t");
			}
			
			System.out.println();
		}
	}

}
//video at 1:51