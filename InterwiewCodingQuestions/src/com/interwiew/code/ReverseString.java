package com.interwiew.code;

public class ReverseString {
public static void main(String[] args) {
	String inputData="Hello Good Morning";
	String reverse="";
	int size=inputData.length();
	for(int i=size-1;i>=0;i--) {
		reverse=reverse+inputData.charAt(i);
	}
		System.out.println("Reverse of"+inputData+"is::"+reverse);
		
	}
}

