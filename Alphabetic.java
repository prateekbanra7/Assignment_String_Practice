package Assignment_String;

import java.util.Arrays;
import java.util.Scanner;

/*
 * WAP to sort a String Alphabetically.
 */
public class Alphabetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String :");
		String s1 = scan.nextLine();
		String s2 = s1.toLowerCase();

		char[] cArray = s2.toCharArray();
		Arrays.sort(cArray);
		System.out.println(cArray);
	}

}
