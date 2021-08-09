import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

/**
 * @author Vladislav Gudkov (A00921638)
 */
public class Lab8Driver 
{
	//fields
	private static HashMap<String, Student> students = new HashMap<>();
	
	//methods
	
	//readFromPrompt method
	 private static void readFromPrompt() 
	 {
		 Scanner scanner = new Scanner(System.in);
		 boolean proceed = true;
		 do 
		 {
			 System.out.println("Do you wish to create a Student? (y/n): ");
			 String choice = scanner.next().toLowerCase();
			 if (choice.equals("y")) 
			 {
				 System.out.println("Enter first name");
			     String firstname = scanner.next();

			     System.out.println("Enter last name");
			     String lastname = scanner.next();

			     System.out.println("Enter id number");
			     String idNumber = scanner.next();

			     System.out.println("Enter age as a whole number:");
			     int age = scanner.nextInt();

			     System.out.println("Enter Grade as a decimal number");
			     double grade = scanner.nextDouble();

			     Student student = new Student(firstname, lastname, idNumber, age, grade);
			     students.put(firstname, student);
			 } 
			 else 
			 {
				 proceed = false;
				 System.out.println("Data entry finished!\n");
			 }
		 } while (proceed);
	 }
	 
	 private static void readFromFile() throws FileNotFoundException
	 {
		 File file = new File("src\\student_data.txt");
		 Scanner scanner = new Scanner(file);
		
		 while(scanner.hasNext())
		 {
			String line = scanner.nextLine();
			String[] input = line.split("\\|");
			Student student = new Student(input[0], input[1], input[2], Integer.parseInt(input[3]),Double.parseDouble(input[4]));
			students.put(input[0], student);
		 } 
		 scanner.close();
	 }
	 

	 //showStudents method iterates over the students HashMap
	 public static void showStudents()
	 {
		 Iterator it = students.entrySet().iterator();
		 while (it.hasNext()) 
		 {
			 System.out.println(it.next().toString()); 
		 }	 
	 }
	 

	 //Main method
	 public static void main(String[] args) throws FileNotFoundException 
	 {
		 //System.out.println("DEBUG: calling readFromPrompt");
		
		 //readFromPrompt();
		 //ySystem.out.println("DEBUG: calling readFromFile");
		 readFromFile();
		 System.out.println("List of Students created");
		 showStudents();
	 }


}
