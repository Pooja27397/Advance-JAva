package com.Revision;

import java.util.Scanner;

public class ReverseStringScanner {
public String getReverseString(String input) {
		String reverse=" ";
		int lang=input.length();
		for(int i=lang-1;i>=0;i--) {
			 reverse=reverse+input.charAt(i);
		}
		return reverse;
		
	} 
	 public static void main(String[] args) {
		 ReverseStringScanner reverseString=new ReverseStringScanner();
		 
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Enter the input String");
		 String input=sc.next();
		   
		 System.out.println("Reverse of"+input +"is::"+reverseString.getReverseString(input));
		 
	 }
	}



