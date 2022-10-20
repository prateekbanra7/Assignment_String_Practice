package Assignment_String;

import java.util.Scanner;

/*
	2. WAP to reverse a sentence while preserving the position.
		Input : “Think Twice”
		Output : “kniht eciwt”
		package Assignment_String;
*/
public class Reverse_Sentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Think Twice");
		String s1 = scan.nextLine();

		//String s1 = "Think Twice";
		
		//[Think,Twice]
		String a[] = s1.split(" ");
		String sRev = "";

		for (int i = 0; i < a.length; i++) {
			String s2 = a[i];
			String s3 = "";

			for (int j = s2.length() - 1; j >= 0; j--) {

				s3 = s3 + s2.charAt(j);// kniht
			}
			sRev = sRev + s3 + " ";// kniht eciwt
		}

		System.out.println(sRev.toLowerCase());

	}

}
