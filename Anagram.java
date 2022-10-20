package Assignment_String;

import java.util.Arrays;
import java.util.Scanner;

/*
	3. WAP to check if the String is Anagram or not.
*/
public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First String");
		String s1 = scan.nextLine();
		System.out.println("Enter Second String");
		String s2 = scan.nextLine();
		// String s1="Heart";
		// String s2="Earth";

		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();

		// check if length is same or not
		if (s1.length() == s2.length()) {

			// convert string to char Array
			char[] charArray1 = s1.toCharArray();
			char[] charArray2 = s2.toCharArray();

			// sort the char Array
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);

			boolean result = Arrays.equals(charArray1, charArray2);

			if (result) {
				System.out.println("Anagram");
			} else {
				System.out.println("Not Anagram");
			}
		}
	}

}
