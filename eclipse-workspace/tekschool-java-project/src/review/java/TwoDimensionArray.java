package review.java;

public class TwoDimensionArray {
	
	public static void main(String[] args) {//220 in video
		
		
		String[][] information = {
				{"Mohammad" , "VA"},
				{"John" , "NY"},
				{"Nikki" , "CA"},
				{"Michelle" , "TX"}
		};
			//		//
		// M		VA		0,0    0,1
		// J		NY		1,0    1,1
		// N		CA		2,0    2,1
		// M		TX		3,0    3,1
		
		//Using for each 2D : Depends on code what to use
		for(String[] rows : information) {
			for(String value : rows) {
				System.out.println(value);
			}}}}
			//}
	//	}
		
//		nested for loop: Depends on code what to use
//		System.out.println(information[2][0]);
//		System.out.println(information[3][1]);
//		System.out.println(information[0][0]);
		
		//for(int row = 0 ; row < information.length ; row ++ ) {
			//for(int col = 0 ; col < information[row].length ; col ++) {
				//System.out.println(information[row][col]);
			//}
	//	}
	//	}
	//}