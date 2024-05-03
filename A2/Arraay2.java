package A2;

import java.util.Scanner;

public class Arraay2 {

	public static void main(String[] args) {

		int length;
		System.out.println("Enter Your Array Length");
		Scanner sc = new Scanner(System.in);

		length = sc.nextInt();
		int count = 0;
		String arr[] = new String[length];

		System.out.println("Enter Your Array Elements");
		for (int i = 0; i < arr.length; i++) {
			count++;

			arr[i] = sc.next();

		}
		System.out.println("Array elelments: "+arr[0]+" "+arr[1]);

		System.out.println("total Count is: " + count);

	}

}
