package A2;

import java.util.Arrays;
import java.util.Scanner;

public class Reversestring {

	public static void main(String[] args) {

		String str;
		Scanner sc = new Scanner(System.in);
		str = sc.next();
		String rev="";
		int Length = str.length();
		for (int i = str.length() - 1; i >= 0; i--) {
			char ch1 = str.charAt(i);
			rev= rev+ch1;

		}
	       System.out.print("Reverced String: "+rev);


	}

}
