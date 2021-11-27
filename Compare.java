package com.Anudip;

import java.util.Scanner;

public class Compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number");
		num1=sc.nextInt();
		System.out.println("Enter Second Number");
		num2=sc.nextInt();
		 if ( num1 == num2 )           
	            System.out.println(+num1+" = "+num2);
		 if (num1 != num2) {
	            System.out.println(+num1+" != "+num2);
			
		}
		 if (num1>num2) {
			 System.out.println(+num1+" > "+num2);
			
		}if (num1<num2) {
			 System.out.println(+num1+" < "+num2);
				
	    }if (num1<=num2) {
		 System.out.println(+num1+" <= "+num2);
	    }if (num1>=num2) {
		 System.out.println(+num1+" <= "+num2);
	    }
 }
}
