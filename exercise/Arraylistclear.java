package com.Anudip;
import java.util.ArrayList;
public class Arraylistclear {
	public static void main(String[] arg)
    {
 
        // Create an empty array list
        // with an initial capacity of 4
        ArrayList<String> numbers
            = new ArrayList<String>();
 
        // Use add() method to add elements
        // in numbers ArrayList
        numbers.add("10");
        numbers.add("20");
        numbers.add("30");
        numbers.add("40");
 
        // Printing numbers ArrayList
        System.out.println("Numbers ArrayList : "
                           + numbers);
 
 
        // Using clear function
        numbers.clear();
 
        int numbers_size_new = numbers.size();
 
        // Printing new ArrayList
        System.out.println(
            "Finally Numbers ArrayList consists of: "
            + numbers_size_new + " elements");
    }

}
