package com.Anudip;
import java.util.Scanner;


public class password {
	public static final int Password_Length =10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("1. A password must have at least Ten characters.\\n\" +\r\n"
						  +"\"2. A password consists of only letters and digits.\\n\" +\r\n"
				          +"\"3. A password must contain at least two digits \\n\" +\r\n"
				          +"\"Input a password (You are agreeing to the above Terms and Conditions.): ");
        String ps = sc.nextLine();
        if (is_Valid_Password(ps)) {
            System.out.println("Password is valid: " + ps);
        } else {
            System.out.println("Not a valid password: " + ps);
        }

  
	}

    public static boolean is_Valid_Password(String password) {

        if (password.length() < Password_Length) return false;

        int charCount = 0;
        int numCount = 0;
        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);

            if (is_Numeric(ch)) numCount++;
            else if (is_Letter(ch)) charCount++;
            else return false;
        }


        return (charCount >= 2 && numCount >= 2);
    }

    public static boolean is_Letter(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');
    }


    public static boolean is_Numeric(char ch) {

        return (ch >= '0' && ch <= '9');
    }

}
