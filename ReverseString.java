package com.Anudip;
import java.util.Scanner;


public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.println("Enter String");
		str=sc.nextLine();
        StringBuffer sb = new StringBuffer(str);
        System.out.println(sb.reverse());

	}

}
