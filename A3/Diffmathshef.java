package A3;

public class Diffmathshef {

	void Square(int size) {
		System.out.println("Area of square is: " + (size * size));

	}

	void Circle(int radius) {
		System.out.println("Area of circle is: " + (3.14 * radius * radius));

	}

	void Rectangle(int hight, int width) {
		System.out.println("Area of rectangle is: " + (hight * width));

	}
	void Trangle(int length, int base) {
		System.out.println("Area of trangle is: " + (0.5*length * base));

	}


	public static void main(String[] args) {
		Diffmathshef sh = new Diffmathshef();
		sh.Square(25);
		sh.Circle(45);
		sh.Rectangle(40, 55);
		sh.Trangle(15, 20);

	}

}
