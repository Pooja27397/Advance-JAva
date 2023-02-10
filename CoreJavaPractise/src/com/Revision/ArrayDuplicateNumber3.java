package com.Revision;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//By using HashTable
//In map key value pair
public class ArrayDuplicateNumber3 {
	/*
	 * {3,5,4,3,2,2,1}; key -|- value HashMap -> hm.get(no) 
	 * key 3 5 4 3   value 1,1,1,2   here count is increase ie. count+1=2
	 * numbers in array as key and vaues are 1 etc..
	 * Entry is the subinterface of map interface.
	 * By uisng this we can get overcome drawback of first 2 method
	 */
	
	public static void main(String[] args) {
	  int [] a= {3,5,4,7,8,9,3,2,1,3};
	  Map<Integer,Integer> hm=new HashMap<>();
	  for(int  no:a) {
		   Integer count=hm.get(no);
		   if(count==null) {
			   hm.put(no, 1);
			   
		   } else
		   {
			   count=count+1;
			   hm.put(no,count);
		   }
		   }
	  System.out.println("Duplicate elements are::");
	    Set<Map.Entry<Integer,Integer>> es=hm.entrySet();
	    for(Map.Entry<Integer,Integer> me:es) {
	    	if(me.getValue()>1) {
	    		System.out.println(me.getKey()+" ");
	    	}
	    	
	    	}
	}
}
      
     