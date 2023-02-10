package com.Revision;

public class ArrayMissingnumber {
public static void main(String[] args) {
	System.out.println("Missing number is::");
 int[] a= {1,2,4,5,6,8,9,10};
 int size=a.length;
 for(int num=1;num<=size;num++) {
	 int count=0;
	 for(int j=0;j<size;j++) {
		 if(num==a[j]) {
			 count++;
		 }
		 
	 }
	 if(count==0) {
		 System.out.println(+num);
	 }
		 
	 }
		 
	 }
 }
