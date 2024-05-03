package A3;

import java.util.Scanner;

public class Arraytype {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size");
		int length = sc.nextInt();
		int a[][] = new int[length][length];
		int b[][] = new int[length][length];
		int c[][] = new int[length][length];

		System.out.println("Enter a[] Array elements");

		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println();
		System.out.println("Enter b[] Array elements");

		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				b[i][j] = sc.nextInt();
			}
		}
		System.out.println();
		System.out.println("print a[] Array elements");

		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				System.out.println(a[i][j] + " ");
			}
			System.out.println("");
		}
		System.out.println();
		System.out.println("print b[] Array elements");

		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				System.out.println(b[i][j] + " ");
			}
			System.out.println("");
		}
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				c[i][j] = a[i][j]+b[i][j];
			}
		}
		System.out.println();

		System.out.println("print Sum c[] Array elements");

		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				System.out.println(c[i][j] + " ");
			}
			System.out.println("");
		}
	}

}
