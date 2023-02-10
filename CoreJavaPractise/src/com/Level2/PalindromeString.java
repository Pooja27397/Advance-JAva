package com.Level2;

public class PalindromeString {
	public static void main(String[] args) {
String str="NITIN";
String rev="";
  for(int i=str.length()-1;i>=0;i--) {
	   rev=rev+str.charAt(i);
  }
    if(str.equals(rev)) {
    	System.out.println("Palindrome number");
    } else
    { 
    	System.out.println("not Palindrome number");
    }
    
	}
	
}














 





     