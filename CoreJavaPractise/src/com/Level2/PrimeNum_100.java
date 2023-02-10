package com.Level2;

import java.util.Scanner;

public class PrimeNum_100 {
    int temp=0;
    public void getPrime() {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter a number::");
    	int num =sc.nextInt();
    	
    	
    	for(int j=2;j<=num;j++) {
    		temp=0;
    		for(int i=1;i<=j;i++) {
    			if(j%i==0) {
    				temp=temp+1;
    			}
    		} 
    		if(temp==2) {
    			System.out.println(j+" ");
    		}
    	}
    } 
      public static void main(String[] args) {
    	  PrimeNum_100 p= new PrimeNum_100();
    	  p.getPrime();
      }
}
     