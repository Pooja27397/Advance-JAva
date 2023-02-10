package com.Revision;

import java.util.Scanner;

import com.Level2.ArmStrongNum;

public class ArmstrongNumber {
	int remainder;
	int sum=0;
	int n;
	public void getArmstrongNum() {
		Scanner sc=new Scanner(System.in);
		  System.out.println("Enter a number");
		  int num=sc.nextInt();
		  n=num;
		  while(num>0) {
			  remainder= num%10;
			  sum=sum+(remainder*remainder*remainder);
			  num=num/10;
		  } 
		   if(n==sum) {
			    System.out.println("Number is Armstrong");
			    
		   }else {
			   System.out.println("number is not Armstrong");
		   }
	} 
	   public static void main(String[] args) {
		   ArmStrongNum arm=new ArmStrongNum();
		   arm.getArmstrongNum();
	   }
	}


