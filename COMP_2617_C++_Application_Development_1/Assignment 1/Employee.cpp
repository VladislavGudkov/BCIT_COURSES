// Employee.h
// Employee member-function definitions. This file contains
// implementations of the member functions prototyped in Employee.h
#include <iostream>
#include "Employee.h" // include definition of class Employee
using namespace std;

//Constants
const int ZERO_SALARY = 0;
const int MINIMUM_NAME_LENGTH = 2;


// constructor initializes firstName,LastName,monthlySalary supplied as arguments
Employee::Employee(string firstname, string lastname, int monthlysalary)
{
	setFirstName(firstname); // member initializer to initialize firstName 
	setLastName(lastname); // member initializer to initialize lastName 
	setMonthlySalary(monthlysalary); // member initializer to initialize monthlySalary 

	// empty body
} // end Employee constructor

// function to set the first name
void Employee::setFirstName(string firstname)
{
	//check length valid length 
	if (firstname.length() < MINIMUM_NAME_LENGTH)
	{
		// leave unchanged if length is invalid
		if (firstName.length() >= MINIMUM_NAME_LENGTH)
		{
			cerr << "\nERROR - invalid length string entered for first name in setFirstName(): " << firstname;
			cout << "\nThe first name was left unchanged: " << getFirstName() << endl;
		}
		else  
		{
			firstName = firstname; // keep first name stored in object

			cerr << "\nWarning - invalid length string entered for first name in ctor: " << firstname;
			cout << "\nThe string that was entered will be used for now." << endl;
		}
	}
	else
	{
		firstName = firstname; // store the first name in the object
	}
} // End function setFirstName

// function to set the last name
void Employee::setLastName(string lastname)
{
	//check length valid length
	if (lastname.length() < MINIMUM_NAME_LENGTH)
	{
		// leave unchanged if length is invalid
		if (lastname.length() >= MINIMUM_NAME_LENGTH)
		{
			cerr << "\nERROR - invalid length string entered for first name in setLastName(): " << lastname;
			cout << "\nThe first name was left unchanged: " << getLastName() << endl;
		}
		else
		{
			lastName = lastname; // keep first name stored in object

			cerr << "\nWarning - invalid length string entered for last name in ctor: " << lastname;
			cout << "\nThe string that was entered will be used for now." << endl;
		}
	}
	else
	{
		lastName = lastname; // store the last name in the object
	}
} // End function setLastName

// function to set the monthly salary
// If the monthly salary is not positive set it to 0
void Employee::setMonthlySalary(int monthlysalary)
{
	if (monthlysalary < ZERO_SALARY)
	{
		if (monthlySalary > ZERO_SALARY)
		{
			cerr << "\nERROR - Invalid salary amount specified : $" << monthlysalary;
			cout << "\nSalary was left unchanged at: $" << getMonthlySalary();
		}
		else 
		{
			monthlySalary = ZERO_SALARY; // Salary set to NO_SALARY

			cerr << "\nInvalid salary amount specified : $" << monthlysalary;
			cout << "\nSalary set to $" << getMonthlySalary() << " instead.";
		}	
	}
	else 
	{ 
		monthlySalary = monthlysalary; // store the mothly salary in the object
	}	
} // end function setMonthlySalary



// function to get the first name
string Employee::getFirstName() const
{
	return firstName; // return object's first name
} // end function getFirstName

// function to get the last name
string Employee::getLastName() const
{
	return lastName; // return object's last name
} // end function getLastName

// function to get the monthly salary
int Employee::getMonthlySalary() const
{
	return monthlySalary; // return object's monthly salary
} // end function getMonthlySalary



