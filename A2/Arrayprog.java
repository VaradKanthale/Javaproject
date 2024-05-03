package A2;

public class Arrayprog {

	public int arrays(String str) {
		String str1 = str.toLowerCase();
		String arr[] = str1.split("_");
		int length = arr.length;
		int count = 0;
		for (int i = 0; i <arr.length; i++) {
			count = count + 1;
			System.out.println(arr[i]);
		}
		return count;

	}

	public static void main(String[] args) {
		Arrayprog Ai = new Arrayprog();
		int Result = Ai.arrays("Hello_Would_hii_varad_hi_Akash");
		System.out.println("Total elements is: " + Result);
	}
}
