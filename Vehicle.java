package Main;

import java.util.ArrayList;


public class Vehicle {
	
	//Attributes
	protected String brand;
	protected int price;
	
	//Constructors
	public Vehicle() {
		this("???", 0);
	}
	
	//Overloaded Constructor
	public Vehicle(String brand, int price) {
		this.brand = brand;
		this.price = price;
	}
	
	//Methods
	public int getPrice() {
		return price;
	}
	
	public String getBrand() {
		return brand;
	}
	
	
//	public int getBrand() {
//		return Brand;
//	}
//	
	@Override
	public String toString() {
		return "Class: "+ this.getClass().getName();
	}
	
	public static void main(String[] args) {
		//functionality
		
		Vehicle car1 = new Car("Ford", 1400, "Germany");
		Vehicle van1 = new Van("Ford", 2000, true);
		Vehicle lorry1 = new Lorry("Volvo", 800, 18);
		Vehicle car2 = new Car("Merc", 2800, "UK");
		
		ArrayList<Vehicle> Garage = new ArrayList<>();
		//create a new temporary list
		ArrayList<Vehicle> modList = new ArrayList<>();
		Garage.add(car1);
		Garage.add(van1);
		Garage.add(lorry1);
		Garage.add(car2);
		
		float sum = 0f;
		for(Vehicle obj : Garage) {
			//System.out.println(obj.getPrice());
			if(obj.brand != "Ford") {
				//if the brand of does not match Ford add it to the new temp list
				modList.add(obj);
			}
			sum += obj.getPrice();
			}
		//replace the new list with the temp list to remove all String "Ford"
		Garage = modList;
		System.out.println(Garage.toString());
		
		System.out.println("Total repair cost : " + sum);
		//Garage.remove(0);//remove index 0
		//Garage.clear();//clear whole ArrayList
		}
}
