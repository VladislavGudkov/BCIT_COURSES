package ca.bcit.comp1451.lab5B;

import java.util.ArrayList;

public class Transportation
{
	//Instance Variables
	private ArrayList<Vehicle> listOfVehicles;
	
	//Constructor for class Transportation
	public Transportation()
	{
		listOfVehicles = new ArrayList <Vehicle>();
	}
	
	//Method to load objects into listOfVehicles arrayList
	public void loadCollection()
	{
		Vehicle car = new Car(1996,"Toyota","Corolla",100);
		Vehicle boat = new Boat(2000, "Plymouth", "Unsinkable 2", true);
		Vehicle plane = new Airplane(2008, "Boeing", "737", 80);
		listOfVehicles.add(car);
		listOfVehicles.add(boat);
		listOfVehicles.add(plane);
	}
	
	//Method to displayDetails of all objects in arrayList listOfVehicles
	public void displayAllDetails()
	{
		for (Vehicle vehicles : listOfVehicles)
		{
			if (vehicles instanceof Car)
			{
				((Car) vehicles).displayDetails();
				System.out.println("~~~~~~~~~~");
			} 
			else if (vehicles instanceof Boat) 
			{
				((Boat) vehicles).displayDetails();
				System.out.println("~~~~~~~~~~");
			} 
			else if (vehicles instanceof Airplane)
			{
				((Airplane) vehicles).displayDetails();
				System.out.println("~~~~~~~~~~");
			}
		}
	}
	
	//Method to displayDetails of airplanes only
	public void displayAirplanesDetails()
	{
		for (Vehicle vehicles : listOfVehicles) 
		{
			if (vehicles instanceof Airplane) 
			{
				((Airplane) vehicles).displayDetails();
				System.out.println("~~~~~~~~~~");
			}
		}
	}
	
	//Main Method
	public static void main(String[] args)
	{
		Transportation t1 = new Transportation();
		t1.loadCollection();
		t1.displayAirplanesDetails();
		t1.displayAllDetails();
	}

}
