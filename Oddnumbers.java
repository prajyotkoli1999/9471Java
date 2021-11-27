package com.Anudip;

public class Oddnumbers {

	public static void main(String[] args) {
		int number=99;
        System.out.println("List of odd numbers from 1 to "+number+": ");
        for (int i=1; i<=number; i++)
        {
            if (i%2!=0)
            {
                System.out.println(i);
            }
        }

	}

}
