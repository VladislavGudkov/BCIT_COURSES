/**
 * 
 */
package ca.bcit.comp1451.Session1LabA;

/**
 * @author Vlad Gudkov (A00921638)
 *
 */
import java.util.ArrayList;
import java.util.Iterator;
public class Kennel
{
	//instance variables
	private ArrayList <Dog> dogs;
	
	//Method to add dog objects to the Arraylist
	void addDog(Dog theDog)
	{
		if(theDog != null)
		{
			dogs.add(theDog);
		}
		else
		{
			throw new IllegalArgumentException("The value of the dog cannot be null");
		}
	}
	
	//Method to display dog objects in the arrayList dogs
	void displayDogs()
	{
		for (Dog dogs: dogs)
		{
			dogs.displayDetails();
		}
	}
	
	//Method to adopt a dog from the ArrayList dogs and subsequently remove it from the list
	void adopt(String name)
	{
		Iterator<Dog> it = dogs.iterator();
		while(it.hasNext())
		{
			Dog aDog = it.next();
			if(aDog.getName().equals(name))
			{
				System.out.println(aDog.getName());
				System.out.println(aDog.getBreed());
				System.out.println(aDog.getAgeInYears());
				it.remove();
			}
			else
			{
				throw new IllegalArgumentException("There are no dogs with the given name in the kennel");
			}
		}
	}
		
}
