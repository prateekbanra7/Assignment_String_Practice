/*
1. WAP to reverse a String.
	Input: “iNeuron”
	Output: “norueNi”

*/
package Assignment_String;

import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter String");
		String s1=scan.nextLine();
	//	String s1="iNeuron";
		String s2="";
		
		for(int i=s1.length()-1; i>=0; i--)
		{
			s2=s2+s1.charAt(i);
		}
		System.out.println(s2);
		
	}

}
