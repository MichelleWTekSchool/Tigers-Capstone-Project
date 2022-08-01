package com.week.two;

public class IncrementalNumbers {

public static void main(String[] args) {

//Different option to add an increment in this ex it is a 1
int number = 10;
System.out.println(number);

//add 1 to number
//option 1
number = number + 1;
System.out.println(number);

//option 2
number += 10; // can be any number even 10+
System.out.println(number);

//option 3
//Increment by only one
number ++;
System.out.println(number);

number ++;
System.out.println(number);

number ++;
System.out.println(number);

number += 1;
System.out.println(number);

number = number + 1;
System.out.println(number);

}
}
