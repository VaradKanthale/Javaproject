package A3;

abstract class A1 {

	abstract void main1();

	abstract void Sum(float c, int d);
}

class A2 {

	void main1() {
		System.out.println("main method");
	}

	void Sum(float e, int d) {
		System.out.println("Sum method: " + (e + d));
	}

}

public class Abstract2 {

	public static void main(String[] args) {
		A2 a = new A2();
		a.main1();
		a.Sum(24, 30);

	}

}
