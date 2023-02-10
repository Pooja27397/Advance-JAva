package com.Revision;
//* * * *                             *               * * * *                             
//* * *                            *  *                 * * *
//* *                            * *  *                   * *
//*                           *  * *  *                     *
//
//                          
public class Add_Pra {
public static void main(String[] args) {
	System.out.println("Missing number are::");
	int[] a= {1,2,4,5,6,7,8,10};
	int size=a.length;
	for(int num=1;num<=0;num++) {
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