package A2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Twoarray {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Please Array enter the size");
		int length=sc.nextInt();
		String s1[][]= new String[length][length];
		
		System.out.println("Please Array enter the elements");
		int count=0;

		for(int i=0; i<length; i++) {
			for(int j=0; j<length; j++) {
				count++;
				s1[i][j]=sc.next();
			}
		}
		System.out.println("array elements count: "+count);

		System.out.println("print array elements: "+s1[0]);
		System.out.println("print array elements: "+s1[1]);
		System.out.println("print array elements: "+s1[0][0]);
		System.out.println("print array elements: "+s1[0][1]);
		System.out.println("print array elements: "+s1[1][0]);
		System.out.println("print array elements: "+s1[1][1]);


	}

}
