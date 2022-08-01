package com.week.eight.day.one;

import java.util.Arrays;

public class PracticeArrays {

	public static void main(String[] args) {
		//Is an array an object? Yes.
		//Is array a class? Yes.
		//Is array a reference type? Yes.
		//Can we create an array using "new" keyword? Yes.
		//Do primitives data types have hash codes? No. They have no methods or functions
		//Primitives are stored in heap
		
		String country = "United States";
		System.out.println(country.hashCode());
		
		//int [] arr1 = {10,20,30};
		
		String[] arr1 = new String[3];
		arr1[0] = "A";
		arr1[1] = "B";
		arr1[2] = "C";
		System.out.println(arr1.toString());
		
		String [] arr2 = new String [3];
		arr2[0] = "A";
		arr2[1] = "B";
		arr2[2] = "C";
		
		System.out.println(arr1 == arr2);
		
		boolean flag = true;
		for (int i = 0 ; i < arr2.length ; i ++) {
			if(arr1[i].equals(arr2[i]) == false) {
				flag = false;
				break;
			}
		}
		System.out.println(flag);
		
		//How to compare two arrays?
		int[] nums1 = {10 , 20 , 30};
		int[] nums2 = {10 , 20 , 30};
	
		if(Arrays.equals(nums1, nums2)) {
			System.out.println("They are equals");
			
		}else { 
			System.out.println("They are not equals");	
		}
	}
	}