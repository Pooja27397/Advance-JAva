package com.Revision;
//If any element is repeated greater than 2 times then this logic not work for example
//If we have insert 10,10,10...then in output is 10,10,10 i.e. it can print the number 3 times..If you insert

public class ArrayDuplicateNumber {
public static void main(String[] args) {
	int[] b= {10,30,20,40,60,70,50,20,30,90,10};
	System.out.println("Duplicate numbers are");
	int size=b.length;
	for(int i=0;i<size;i++) {
		for(int j=1+i;j<size;j++) {
			if(b[i]==b[j]) {
				System.out.println(b[i]);
			}
		}
	}
}
}
