/**
 * 
 */
package ca.bcit.comp1451.Session1LabA;

/**
 * @author Administrator
 *
 */
public class Driver
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		
		int year = Integer.parseInt(args[2]);
		Dog dog = new Dog(args[0], args[1], year);
		int secondYear = Integer.parseInt(args[5]);
		Dog secondDog = new Dog(args[3], args[4], secondYear);
		//Kennel newKennel = new Kennel();
		//newKennel.addDog(dog);
		//newKennel.addDog(secondDog);
		//newKennel.displayDogs();
		//newKennel.adopt("Vlad");
		//System.out.println("List after adoption : ");
		//newKennel.displayDogs();
	}

}
