package Assignment_String;

/*
 *  WAP to print repeatedly occurring characters in the given String.
 */
import java.util.Scanner;

public class Repeated_charater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String");
		String s1 = scan.nextLine();
		char[] cArray = s1.toCharArray();

		System.out.println("The String is : " + s1);

		System.out.println("Repeated Strings are :");

		for (int i = 0; i < s1.length(); i++) {
			for (int j = i+1; j < s1.length(); j++) {
				if (cArray[i] == cArray[j]) {
					System.out.print(cArray[j] + " ");
					
				}
			}
		}

	}

}
