package A2;

import java.util.Scanner;

public class Factorialnumber {

	public static void main(String[] args) {

		int fact =1;
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			
			fact=fact*i;
		}
		System.out.print(fact);
	}

}
