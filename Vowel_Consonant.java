package Assignment_String;

import java.util.Scanner;

/*
 * WAP to count the number of Vowels and Consonants of a String value.
 */
public class Vowel_Consonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String :");
		String s1 = scan.nextLine();

		int vCount = 0, cCount = 0;
		String s2 = s1.toLowerCase();

		for (int i = 0; i < s2.length(); i++) {
			if (s2.charAt(i) == 'a'
					|| s2.charAt(i) == 'e'
					|| s2.charAt(i) == 'i' 
					|| s2.charAt(i) == 'o'
					|| s2.charAt(i) == 'u')
				vCount++;
			else if (s2.charAt(i) >= 'a' && s2.charAt(i) <= 'z'
					||
					s2.charAt(i) >= 'A' && s2.charAt(i) <= 'Z')
				cCount++;

		}
		System.out.println("Number of Vowels   : " + vCount);
		System.out.println("Number of Consonant : " + cCount);
	}

}
