package com.Anudip;
import java.util.Scanner;


public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		num1=sc.nextInt();
//		System.out.println(num1 * 1);
//		System.out.println(num1 * 2);
//		System.out.println(num1 * 3);
//		System.out.println(num1 * 4);
//		System.out.println(num1 * 5);
//		System.out.println(num1 * 6);
//		System.out.println(num1 * 7);
//		System.out.println(num1 * 8);
//		System.out.println(num1 * 9);
//		System.out.println(num1 * 10);
		for(int i=1;i<=10;i++) {
			System.out.println(+num1+ " * "+i+" = "+num1*i);
		}
		

	}

}
