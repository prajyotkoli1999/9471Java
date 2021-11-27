package com.Anudip;
import java.util.Scanner;


public class PositiveOrNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		num=sc.nextInt();
		if(num>0) {
			System.out.println("Numbers is positive");
		}
		else if (num<0) {
			System.out.println("Numbers is negative");

		}
		else {
			System.out.println("Numbers is zero");

		}
		

	}

}
