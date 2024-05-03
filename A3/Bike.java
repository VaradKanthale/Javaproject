package A3;

public class Bike {
	private String Name;
	private int Price;

	public Bike(String Name, int Price) {
		this.Name = Name;
		this.Price = Price;
	}

	public Bike() {
		Name = "Hero";
		Price = 50000;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public String getName() {
		return Name;
	}

	public void setPrice(int Price) {
		this.Price = Price;
	}

	public int getPrice() {
		return Price;
	}
	
	void Display() {
		System.out.println(Name+":"+Price);
	}

	
	public static void main(String[] args) {
		Bike b1= new Bike("Honda",20000);
		System.out.println(b1);

		System.out.println(b1.Name="Neno");
		System.out.println(b1.Price=10000);

		b1.Display();
		Bike b2= new Bike();
       b2.Display();
	}

}
