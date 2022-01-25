package com.Anudip;

import java.util.LinkedList;

public class Linklist_Specific {
	public static void main(String[] args) {
		  // create an empty linked list
		  LinkedList <String> city = new LinkedList <String> ();
		  // use add() method to add values in the linked list
		  city.add("Mumbai");
		  city.add("Pune");
		  city.add("Delhi");

		  // print original list
		  System.out.println("Original linked list:" + city);

		  // create a new collection and add some elements

		  city.add(1, "Chennai");
			// print the list
			System.out.println("The linked list:" + city);
		 }
}
