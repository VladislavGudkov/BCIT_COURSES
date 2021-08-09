package a00921638_lab5;

/**
 * 
 * @author Vladislav Gudkov(A00921638)
 *
 */

public class Main 
{

	public static void main(String[] args) 
	{
		Person p1 = new Person("Tiger", "Woods", "divorced",1975, 200, "undergraduate");
		p1.printDetails();
		p1.printDetails(true);
		p1.printDetails(true, true);
		p1.printDetails(true, false);
		p1.printDetails(false, true);
		p1.printDetails(false, false);

		Person p2 = new Person("Jason", "Harrison", "no", 2000, 180, "graduate");
		p2.printDetails();
		p2.printDetails(true);
		p2.printDetails(true, true);
		p2.printDetails(true, false);
		p2.printDetails(false, true);
		p2.printDetails(false, false);

		Person p3 = new Person("Santa", "Claus", "yes", 1000, 280, "high school");
		p3.printDetails();
		p3.printDetails(true);
		p3.printDetails(true, true);
		p3.printDetails(true, false);
		p3.printDetails(false, true);
		p3.printDetails(false, false);

	}

}
