package com.Anudip;
import java.util.ArrayList;


public class Arraylistempty {
	public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<String>();
         
        if(myList.isEmpty()) {
            System.out.println("ArrayList is empty.");
        } else {
            System.out.println("ArrayList is not empty.");
        }
    }
}
