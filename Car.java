package Main;

public class Car extends Vehicle{
	//Attributes
	
	public String origin;

	//Constructors
	public Car() {
		super();
		System.out.println("This is a car!");
	}
	
	public Car(String origin) {
		super();
		this.origin = origin;
		
	}
	
	//Overloaded Constructor
	//price of repair
	public Car(String brand, int price, String origin) {
		super(brand, price);
		this.origin = origin;
	}
	
	//Method
	
}
