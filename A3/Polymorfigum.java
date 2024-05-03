package A3;

public class Polymorfigum {

	 void sum(int a , int b) {
		int c= a+b;
		System.out.println("Sum is: "+c);
	}
	 void sum(float c , int d) {
		int e= (int) (c-d);
		System.out.println("Sum is: "+e);
	}
	 void sum(int y , float z) {
		int x= (int) (y*z);
		System.out.println("Sum is: "+x);
	}
	 
	 void sum(float m , float n) {
		int o= (int) (m/n);
		System.out.println("Sum is: "+o);
	}
	public static void main(String[] args) {
		Polymorfigum nw = new Polymorfigum();
		nw.sum(12, 15);
		nw.sum(15, 20);
		

	}

}
