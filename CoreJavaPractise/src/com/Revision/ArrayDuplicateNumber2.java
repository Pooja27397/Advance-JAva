package com.Revision;
//2..By using set interface.
import java.util.HashSet;
import java.util.Set;
//same as array if your element is repeated > 2 times then is not work. 
public class ArrayDuplicateNumber2 {
public static void main(String[] args) {
	int[] a= {10,30,20,60,70,40,30,50,10};
	System.out.println("Duplicate elements are::");
	Set<Integer> s=new HashSet<Integer>();    //set is interface & hashset is class we can not
	//create the object of interface so we use hashset here.Hashset is class
	
	for(int no:a) {   //for each loop  no. is any variable & a is array name.
		//boolean b=s.add(no);
		//if(b==false) {      
			if(s.add(no)==false) {  //we have to use this statement otherwise we use that other statement
			System.out.println(no+"");
		}
	}
}
}
