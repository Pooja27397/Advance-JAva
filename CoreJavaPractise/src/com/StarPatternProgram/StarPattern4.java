package com.StarPatternProgram;
//   s|             *
 //  p|          *  *
 // a |       *  *  *
 // c |   *   *  *  *      In this pattern first row having 3 spaces 2nd is 2 and 3rd is 1..
public class StarPattern4 {
    public static void main(String[] args) {
    	 for(int i=1;i<=4;i++) {  //for loop for rows
    		 for(int j=3;j>=i;j--) {
    			 System.out.print(" ");
    		 }
    		 for(int k=1;k<=i;k++) {
    			 System.out.print("*");
    		 } 
    		 System.out.println();
    	 }
    }
    }
