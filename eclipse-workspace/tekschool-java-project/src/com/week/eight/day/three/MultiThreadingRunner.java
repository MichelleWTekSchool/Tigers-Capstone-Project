package com.week.eight.day.three;

public class MultiThreadingRunner {
	
public static void main(String[] args) {
	for( int i = 1 ; i <5 ; i ++) {
	MultiThreading obj = new MultiThreading(i);
	obj.start();
}
}}
