package A2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Listarr {

	public static void main(String[] args) {

		List<String> arr = new ArrayList<>();
		arr = Arrays.asList("Varad", "Akash", "Sudhir", "Omkar");
		System.out.println(arr);
		for (String s11 : arr) {
			System.out.println(s11);
		}
		System.out.println(arr.size());
		arr.set(2, "om");
		System.out.println(arr);
		System.out.println(arr.get(3));

	/*	arr.add(1, "Gouri");
		System.out.println("After add: "+arr);
		arr.remove(2);
		System.out.println("After delete: "+arr);*/
	/*	Arrays. asList is mutable which means that you cannot add or remove elements from the list.
	  However, you can modify the existing elements in the list.
	 */
	}

}
