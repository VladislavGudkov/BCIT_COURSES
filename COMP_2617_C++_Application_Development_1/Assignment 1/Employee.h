// Employee class definition. This file presents the Employee class public 
// interface without revealing the implementations of Employee's member
// functions, which are defined in Employee.cpp.

#include <string> // class Employee uses C++ standard string class

//Employee Class Definition
class Employee
{
public:
	// constructor initializes courseName with string supplied as argument
	explicit Employee(std::string, std::string, int); // constructor initialize Emmployee
	void setFirstName(std::string); // sets the first name
	void setLastName(std::string); // sets the last name
	void setMonthlySalary(int); // sets the monthly salary
	
	std::string getFirstName() const; // gets the first name
	std::string getLastName() const; // gets the last name
	int getMonthlySalary() const;	 // gets the monthly name


private:
	std::string firstName; // first name for this Employee
	std::string lastName;  // last name for this Employee
	int monthlySalary = 0;	   // monthly salary for this Employee
}; //End class Employee

