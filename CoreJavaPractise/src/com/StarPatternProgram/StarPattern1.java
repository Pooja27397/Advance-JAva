package com.StarPatternProgram;
//*
//* *
//* * *
//* * * *  program for this type of star pattern
public class StarPattern1 {
	public static void main(String[] args) {
		for(int i=1;i<=4;i++) {    //For loop for the rows
			for(int j=1;j<=i;j++) {   //For loop for the columns
				System.out.print("*");
		} 
			
			System.out.println();
		}
	}
}


