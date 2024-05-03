package A2;

public class FabionaciSeries {

	public static void main(String[] args) {

		int num = 1;
		int num2 = 1;

		while (num <= 100) {

			int Result = num + num2;

			System.out.print(" " + num + ",");
			num = Result;
			num2 = Result;

		}
	}

}
