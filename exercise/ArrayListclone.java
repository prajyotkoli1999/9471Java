package com.Anudip;
import java.util.ArrayList;

public class ArrayListclone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>list1 = new ArrayList<Integer>();
		list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);
        
        System.out.println("First ArrayList: "+ list1);
        
        ArrayList list2=new ArrayList<>();
        list2=(ArrayList)list1.clone();
        
        System.out.println("Second ArrayList is: "+ list2);

	}

}
