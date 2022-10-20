package Assignment_String;

import java.util.Scanner;

/*
 * 4. WAP to check if the String is a Pangram or not.
 */
public class Pangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String");
		String s1 = scan.nextLine();

		boolean[] alphaList = new boolean[26];
		int index = 0;
		int flag = 1;

		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) >= 'a' && s1.charAt(i) <= 'z') {
				index = s1.charAt(i) - 'a';
			}
			alphaList[index] = true;
		}

		for (int i = 0; i < 25; i++) {
			if (alphaList[i] == false)
				flag = 0;

		}
		System.out.println("Entered String is..!! : " + s1);

		if (flag == 1) {
			System.out.println("---Pangram---");
		} else {
			System.out.println("---Not Pangram---");
		}
	}
}
