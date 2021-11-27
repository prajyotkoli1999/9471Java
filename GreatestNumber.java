package com.Anudip;
import java.util.Scanner;


public class GreatestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,num3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number");
		num1 =sc.nextInt();
		System.out.println("Enter Second number");
		num2 =sc.nextInt();
		System.out.println("Enter Third number");
		num3 =sc.nextInt();
		
		if (num1>num2 && num1>num3) {
			System.out.println("The greatest number : "+num1);
			
		}else if (num2>num1 && num2>num3) {
			System.out.println("The greatest number : "+num2);

		}else if (num3>num1 && num3>num2) {
			System.out.println("The greatest number : "+num3);

			
		}else {
			System.out.println("All numbers are equal");
		}

	}

}
