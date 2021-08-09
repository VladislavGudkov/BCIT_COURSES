/**
 * 
 */
package ca.bcit.comp1451.lab3A;

/**
 * @author Vladislav Gudkov A00921638
 *
 */
public class Driver
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
StudentDatabase studentDB = new StudentDatabase();
			
		studentDB.addStudent("Vlad");
		studentDB.addStudent("Nik");
		studentDB.addStudent("Ron");
		studentDB.displayQuizzes("Vlad");
		System.out.println("---------------");
		
		studentDB.changeQuizMark("Nik", 5, 6);
		studentDB.changeQuizMark("Ron", 3, 5);
		
		studentDB.showQuizMarks();

	}

}
