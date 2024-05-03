package A3;

public class Encapsulation {

	private int a;
	private int b;
	private int c;
	private int d;
	private int y;
	private int z;
	private int m;
	private int n;

	void Sum1(int a, int b) {
		int c = a + b;
		System.out.println("Sum is: " + c);
	}

	void Sum2(int c, int d) {
		int e = c - d;
		System.out.println("Sum is: " + e);
	}

	void Sum3(int y, int z) {
		int x = y * z;
		System.out.println("Sum is: " + x);
	}

	void Sum(int m, int n) {
		int o = m / n;
		System.out.println("Sum is: " + o);
	}

	public static void main(String[] args) {

		Encapsulation dd = new Encapsulation();

		dd.Sum(15, 20);
		dd.Sum1(15, 30);
		dd.Sum2(45, 66);
		dd.Sum3(55, 56);

	}

}
