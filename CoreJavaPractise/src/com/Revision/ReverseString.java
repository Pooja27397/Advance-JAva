package com.Revision;

public class ReverseString {

  public static void main(String[] args) {
	String input="Hello Good Morning";
	int size=input.length();     //length() method is used to count the number of alphabet in input String
	String rev="";
	for(int i=size-1;i>=0;i--) {
		rev=rev+input.charAt(i);
	} 
	System.out.println("Reverse of  " + input + "  is::"+rev);
  }
  }


