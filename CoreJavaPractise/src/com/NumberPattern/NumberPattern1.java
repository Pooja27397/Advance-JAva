package com.NumberPattern;
//It is same as star pattern
//If you print j then pattern is like  1
//1             If you print i then pattern is   1
//12                                             22
//123                                             333 like as
//1234     
public class NumberPattern1 {
  public static void main(String[] args) {
	for(int i=1;i<=4;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(i);
		} 
		System.out.println();
	}
  }
	
}
