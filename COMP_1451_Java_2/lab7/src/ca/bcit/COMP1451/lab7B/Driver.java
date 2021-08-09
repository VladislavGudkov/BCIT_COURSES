package ca.bcit.COMP1451.lab7B;

import java.util.ArrayList;

public class Driver
{
	//Main method
	public static void main(String[] args)
	{
		//Create two sales employees
		SalesEmployee sales1 = new SalesEmployee("Bob", 12, 30.0);
		SalesEmployee sales2 = new SalesEmployee("John", 23, 15.0);
		//Create two hourly employees
		HourlyEmployee hourly1 = new HourlyEmployee("Jordan", 40, 15.0);
		HourlyEmployee hourly2 = new HourlyEmployee("Mark", 37, 20.0);
		
		//Create an arrayList of employee objects
		ArrayList<Employee> employeeList= new ArrayList<Employee>();
		
		//Add the two sales employees and the two hourly employees to the arrayList
		employeeList.add(sales1);
		employeeList.add(sales2);
		employeeList.add(hourly1);
		employeeList.add(hourly2);
		
		//Loop through the arrayList
		for (Employee employee: employeeList) 
		{
			System.out.println(employee);
		}
	}
}
