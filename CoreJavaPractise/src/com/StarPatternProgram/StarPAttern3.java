package com.StarPatternProgram;
   //  *
   //  * *
    // * * *       -----rows
    // * * * *     | columns
    // * * *
    // * *   combination of first 2 pattern
    // *
public class StarPAttern3 {
 // Here we are using first 2 program logic
	public static void main(String[] args) {
	for(int i=1;i<=4;i++) {
		for(int j=1;j<=i;j++) {
		System.out.print("*");   // Here we have to use only print because if we use 
		                    //println then they not show the star in pattern
	} 
	  System.out.println();
	}
   for(int i=1;i<=3;i++) {
	   for(int j=3;j>=i;j--) {
		   System.out.print("*");
		   
	   } 
	      System.out.println();
   }
   }
}
