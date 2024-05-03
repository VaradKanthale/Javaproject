package A3;

public class Starpattern {
	private void star() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {

				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		Starpattern st = new Starpattern();
		st.star();

		for (int i = 0; i < 4; i++) {
			for (int j = 4; j > i; j--) {

				System.out.print("*");
			}
			System.out.println();

		}

	}
}
