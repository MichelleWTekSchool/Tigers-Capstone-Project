package com.week.eight.day.three;
import java.text.DateFormatSymbols;

public class PrintDaysOfANdMonthOf {
public static void main(String[] args) {
	//How to print days of week
	//first create obj of DateFormatSymbols and import the clss form java.text package
	
	DateFormatSymbols dfs = new DateFormatSymbols();
	String[] daysOfWeek = dfs.getWeekdays();
	for(String dayName : daysOfWeek){
		System.out.println(dayName);
	}
	System.out.println("\n");
	
	//If we have already made obj dateFOrmatSymbols, we dont need to do it again
	//we can use the same obj
	
	String[] monthsOfYear = dfs.getMonths();
	for(String mOfy : monthsOfYear) {
		System.out.println(mOfy);
		
	}

}
}
