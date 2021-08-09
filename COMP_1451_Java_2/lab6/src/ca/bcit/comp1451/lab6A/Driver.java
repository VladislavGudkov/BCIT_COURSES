package ca.bcit.comp1451.lab6A;

public class Driver
{
	//Driver method
	public static void main(String[] args)
	{
		PersonCollection people = new PersonCollection();
		people.loadCollection();
		people.displayAllDetails();
		people.testEquality();
	}
}
