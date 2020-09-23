package Main;

public class Van extends Vehicle{
	//Attributes
	
	public Boolean big;

	//Constructors
	public Van() {
		super();
		System.out.println("This is a Van!");
	}
	
	public Van(Boolean big) {
		super();
		this.big = big;
	}
	
	//Overloaded Constructor
	public Van(String brand, int price, boolean big) {
		super(brand, price);
		this.big = big;
	}
	
	//Method
}