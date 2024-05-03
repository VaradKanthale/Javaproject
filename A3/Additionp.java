package A3;

import java.util.Scanner;

public class Additionp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("please Enter Your Numbers for Sum is: " + a + "+" + b);
		int c = 0;
		for (int i = 0; i <= c; i++) {
			c = a + b;
			System.out.println("Addition is: " + c);
			a = c;
			int d = sc.nextInt();
			b = d;
		}

	}

}
