package com.Revision;

import java.util.Scanner;

public class FibonacciWithScanner {
public static void getFiboSeries(int num) {
	int a=0;
	int b=1;
	for(int i=1;i<=num;i++) {
		System.out.println(a+"");
		int t=a; a=a+b;
		b=t;
	}	
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		getFiboSeries(num);
	}
	
}

