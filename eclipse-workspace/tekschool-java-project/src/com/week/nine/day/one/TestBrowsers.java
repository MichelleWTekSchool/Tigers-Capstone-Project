package com.week.nine.day.one;

public class TestBrowsers {
public static void main(String[] args) {
	ChromeBrowser chrome = new ChromeBrowser();
	chrome.openBrowser();
	chrome.closeBrowser();
	chrome.navigate();
	
	SafariBrowser safari = new SafariBrowser();
	safari.openBrowser();
	safari.closeBrowser();
	safari.navigate();
}
}
