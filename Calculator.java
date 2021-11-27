package com.Anudip;
import java.util.Scanner;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,addition,substraction,multiplication,division,reminder;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number");
		num1=sc.nextInt();
		System.out.println("Enter Second Number");
		num2=sc.nextInt();
		
		addition = num1 + num2;
		substraction = num1 - num2;
		multiplication = num1 * num2;
		division = num1 / num2;
		reminder = num1 % num2;
		System.out.println(+num1+"+"+num2+"="+addition);
		System.out.println(+num1+"-"+num2+"="+substraction);
		System.out.println(+num1+"*"+num2+"="+multiplication);
		System.out.println(+num1+"/"+num2+"="+division);
		System.out.println(+num1+" Mod "+num2+" = "+reminder);
		
		

	}

}
