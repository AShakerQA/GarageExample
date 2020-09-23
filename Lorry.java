package Main;

public class Lorry extends Vehicle{
	//Attributes
	
	public int wheels;

	//Constructors
	public Lorry() {
		super();
		System.out.println("This is a Lorry!");
	}
	
	public Lorry(int wheels) {
		super();
		this.wheels = wheels;
	}
	
	//Overloaded Constructor
	public Lorry(String brand, int price, int wheels) {
		super(brand, price);
		this.wheels = wheels;
	}
	
	//Method
}