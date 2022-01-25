package com.Anudip;

import java.util.LinkedList;

public class LinkList_first_last {
	public static void main(String[] args) {
		   // create an empty linked list
		     LinkedList<String> names = new LinkedList<String>();
		   // use add() method to add values in the linked list
		          names.add("Prajyot");
		          names.add("Rahul");
		          names.add("Sanket");
		     System.out.println("Original linked list:" + names);    
		  // Add an element to front of LinkedList
		     names.offerFirst("yash");
		     names.offerLast("Rohit");
		     System.out.println("Final linked list:" + names);  
		 }	
}
