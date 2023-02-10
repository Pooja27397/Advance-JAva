package com.Level2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*Design the calss which returns list that contains the elements as
Ram,Sohan,Ashok,Prasanna. Now I want to sort that element based on
descending order.*/
public class SortedList {
  
	//method for returning list elements
	public List<String> getListElements(){
		List<String> list=new ArrayList<String>();
		  list.add("Ram");
		  list.add("Sohan");
		  list.add("Ashok");
		  list.add("Prasanna");
		  return list;
	}
    public static void main(String[] args) {
    	SortedList sortlist=new SortedList();
    	
    	//Store list elements into new list variables
    	List<String>ascendingList=sortlist.getListElements();
    	Collections.sort(ascendingList);
    	System.out.println("List in ascending order::"+ascendingList);
    	
    	//List in descending order
    	System.out.println("List in descending order");
    	for(int i= ascendingList.size()-1;i>=0;i--) {
    		System.out.println(ascendingList.get(i)+" ");
    	}
    	}
    }
