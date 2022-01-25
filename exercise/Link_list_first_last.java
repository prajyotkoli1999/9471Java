package com.Anudip;

import java.util.LinkedList;

public class Link_list_first_last {
	public static void main(String[] args) {
		   // create an empty linked list
		     LinkedList<String> colours = new LinkedList<String>();
		   // use add() method to add values in the linked list
		          colours.add("Red");
		          colours.add("Green");
		          colours.add("Black");
		     System.out.println("Original linked list:" + colours);    
		   // Add an element at the beginning 
		    colours.addFirst("White");
		 
		   // Add an element at the end of list 
		    colours.addLast("Pink");
		     System.out.println("Final linked list:" + colours);  
		 }

}
