package com.Anudip;

import java.util.LinkedList;

public class Linklist_specefic_some {

	public static void main(String[] args) {
		  // create an empty linked list
		  LinkedList <String> country = new LinkedList <String> ();
		  // use add() method to add values in the linked list
		  country.add("India");
		  country.add("USA");
		  country.add("England");

		  // print original list
		  System.out.println("Original linked list:" + country);

		  // create a new collection and add some elements

		  LinkedList <String> new_country = new LinkedList <String> ();
		  new_country.add("Australia");
		  new_country.add("Japan");

		  // Add the collection in the second position of the existing linked list
		  country.addAll(1, new_country);

		  // print the new list
		  System.out.println("LinkedList:" + country);
		 }
}
