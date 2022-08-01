package com.week.eight.day.three;

public class MultiThreading extends Thread {
	private int threadNumber;
	public MultiThreading(int threadNumber) {
		this.threadNumber = threadNumber;
		}
		public void run() {
		for(int i = 1; i <= 5 ; i ++) {
			System.out.println(i + " This is coming from thread. => " + threadNumber);
		try {
			Thread.sleep(1000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}}
		}}
