package A3;

class Varad {
	String name = "varad";

	void main() {
		System.out.println("main method");
	}
	void main1() {
		System.out.println("Parent method");
	}

}

public class Inhertance  {

	void main() {
		System.out.println("Child method");
	}
	void main1() {
		System.out.println("Child method");
	}
	
	public static void main(String[] args) {

		Inhertance mn = new Inhertance();
		mn.main();
		mn.main1();
		Varad v = new Varad();
		v.main();
		v.main1();

	}

}
