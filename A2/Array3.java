package A2;

public class Array3 {

	public static void main(String[] args) {

		String str = "Hello_old_java_Would_hii_old_java_varad_hi_old_java_Akash";
		String s1[] = str.split("_");
		int count = 0;
		int len = s1.length;

		for (int i = 0; i < s1.length; i++) {
			if (s1[i].equals("java")) {
				count++;
			}
			System.out.println(s1[i]);

		}
		System.out.println("origanel length: " + s1.length);
		System.out.println("Word java count is: " + count);


		/*
		 * for(String m:s1) { if(s1[i].equals("java")) { count++;
		 * System.out.println("Word java count is: "+count); }
		 * 
		 * }
		 */
	}

}
