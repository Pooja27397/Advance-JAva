package com.Level2;

import java.util.HashSet;

public class RemoveDuplicacy {
//By using hashset it is applicable for both sorted and unsorted array..
	public static void main(String[] args) {
		int[] a= {3,5,9,1,2,6,5,3};
	
    HashSet<Integer> hs=new HashSet<>();
    for(int i=0;i<a.length;i++) {
    	hs.add(a[i]);    //add method is used to add the array element	
    }  
        for(int no:hs) {    //for each loop
        	System.out.println(no+" ");
        }  
	     }
        }
