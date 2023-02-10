package com.Revision;

public class PrimeNumber {
public static void main(String[] args) {
	int num=8;
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
