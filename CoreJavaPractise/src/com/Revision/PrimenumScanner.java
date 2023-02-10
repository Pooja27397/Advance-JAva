package com.Revision;

import java.util.Scanner;

public class PrimenumScanner {

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enetr a number ");
	int num=sc.nextInt();
	int count=0;
	for(int i=num;i>0;i--) {
		if(num%i==0) {
			count++;
		}
	}
	if(count>2) {
		System.out.println("Number is not prime");
	}else {
		System.out.println("Number is prime");
			
	}	
}
}
