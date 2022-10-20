package Assignment_String;

import java.util.Scanner;

/*
 * 8. WAP to count number of special characters.
 */
public class Special_Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String :");
		String s1 = scan.nextLine();
		
		int upper = 0;
		int lower = 0;
		int number = 0;
		int special = 0;
		
		for (int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);
			
			if (ch >= 'A' && ch <= 'Z')
				upper++;
			else if (ch >= 'a' && ch <= 'z')
				lower++;
			else if (ch >= '0' && ch <= '9')
				number++;
			else
				special++;
		}
		
		System.out.println("Upper Case Letter : " + upper);
		System.out.println("Lower Case Letter : " + lower);
		System.out.println("Numbers : " + number);
		System.out.println("Special Characters : " + special);
	}

}
