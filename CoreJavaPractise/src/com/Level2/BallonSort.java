package com.Level2;

import java.util.LinkedList;

public class BallonSort {
	/*
	 * Suppose I have one container that contain different colors of ballons .Such
	 * as Red, Blue,Green,Red,Blue,red,Blue,green in this order, now sort that
	 * ballons is such manners so red balloon at added first then blue &lasr is
	 * green balloon ,use proper colection.
	 */
     public static void main(String[] args) {
    	 LinkedList<String> list=new LinkedList<String>();
    	 list.add("Red");
    	 list.add("Blue");
    	 list.add("Green");
    	 list.add("Red");
    	 list.add("Blue");
    	 list.add("Red");
    	 list.add("Green");
    //second list for storing the output
    	 LinkedList<String> list2=new LinkedList<String>();
    	 System.out.println("Elements in list container");
    	 
    	 System.out.println(list);
	 for(String str:list) 
    	 if(str.equals("Red")) {
    		 list2.addFirst("Red");
    		 
    	 } else if(str.equals("Blue")) {
    		 list2.add("Blue");
    	 }
           for(String str:list) {
        	   if(str.equals("Green")) {
        	   list2.add("Green");
             }
          }  
         System.out.println("Output");
         System.out.println(list2);
         }
         } 
           
        	   
    		 
    	 
    	 
     
