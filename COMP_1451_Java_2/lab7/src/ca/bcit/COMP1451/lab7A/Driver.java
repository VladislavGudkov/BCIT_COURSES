package ca.bcit.COMP1451.lab7A;

public class Driver
{
	//Main method
	public static void main(String[] args)
	{
		//Create an array of Electronics objects of size 3
		Electronics[] electronicList = new Electronics[3];
		
		//Create 3 new objects that inherit portions of the class Electronics
		Electronics phone = new Cellphone("Nokia TS200", 300.00, 18, 3.5);
		Electronics computer = new Computer("Dell D2100", 1000.00, 24, 2500, 512);
		Electronics laptop = new Laptop("HP N5170", 1500.00, 24, 1500, 256, 15.0);
		
		//Add the three objects to the Electronics array
		electronicList[0] = phone;
		electronicList[1] = computer;
		electronicList[2] = laptop;
		
		
		System.out.println("SPECIFICATIONS BEFORE PRICE INCREASE");
		
		for (int index = 0; index < electronicList.length; index++)
		{
			System.out.println(electronicList[index]);
		}
		
		for (int index = 0; index < electronicList.length; index++)
		{
			electronicList[index].increasePrice(5.0);
		}
		
		
		System.out.println();
		System.out.println("SPECIFICATIONS AFTER PRICE INCREASE");
		for (int index = 0; index < electronicList.length; index++)
		{
			System.out.println(electronicList[index]);
		}

	}

}
