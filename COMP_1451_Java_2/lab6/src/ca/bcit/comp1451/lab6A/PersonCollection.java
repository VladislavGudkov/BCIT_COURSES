package ca.bcit.comp1451.lab6A;
import java.util.ArrayList;

public class PersonCollection
{
	//Instance variables
	private ArrayList<Person> person;
	
	//Constructor for PersonCollection
	public PersonCollection()
	{
		person = new ArrayList<Person>();
	}
	
	//loadCollection methof
	public void loadCollection()
	{
		Person employee1 = new Employee("Adam Wong",35,40.0,41);
		Person student1 = new Student("Max Clark",27, false, 65.4);

		person.add(employee1);
		
		person.add(student1);
	}
	
	//DisplayDetails method
	public void displayAllDetails()
	{
		for (Person p : person) 
		{
			if (p instanceof Employee)
			{
				System.out.println(p.toString());
			} 
			else if (p instanceof Student) 
			{
				System.out.println(p);
			}
		}	
	}
	
	//Test equality method
	public void testEquality() {
		
	
		Person student1 = new Student("Bob Smith", 23, true, 50.0);
		Person student2 = new Student("Bob Smith", 18, false, 50.0);
		
		person.add(student1);
		person.add(student2);
		
		student1.equals(student2);
		
		Person employee1 = new Employee("Bob Smith", 25, 30.0, 50);
		Person employee2 = new Employee("Bob Smith", 18, 60.0, 50);
		
		person.add(employee1);
		person.add(employee2);
		
		employee1.equals(employee2);	
}

	
	
	
	
	
}
