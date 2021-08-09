// A00921638_Gudkov_Assign07.cpp
// Calculate gross pay, net pay, pension and deductions for employees of Rogers Hostpital Supplies Company.
// COMP 2617 Lab 07
// Author: Bob Langelaan
// Created: March 9, 2015
// Edited By: Vladislav Gudkov (A00921638)
// Edited On: November 16, 2020
// Version 1.0

#include <iostream>
#include <conio.h>  // Required for _getch() function
#include <fstream>  // Required for file input/output
#include <iomanip>

using namespace std;

//global constants
const int REGULAR_HOURS = 40;
const int OVERTIME_HOURS = 54;
const int MAX_EXEMPTION_HOURS = 20;
const double MIN_PAY = 25.00;
const double MAX_RATE = 99.99;
const int SIN_MIN = 99999999;
const int SIN_MAX = 1000000000;


//Function prototypes
double calculateGrossPay(const double&, const double&); // Calculates gross
double calculateDeductionsPay(const double&, const int&); // Calculates deductions
double calculatePensionPay(const double&); // Calculates pension
double calculateNetPay(const double&, const double&, const double&); // Calculates net
bool validateSin(const long&); // Validates Social insurance no.
bool validateHours(const double&); // Validates hours worked
bool validatePay(const double&); // Validates pay rate
bool validateExempt(const int&); // Validates number of exemptions


// One way to specify a file name:
const char* IN_FILE = "EmployeePayInput.txt";

// A second way to specify a file name:
#define OUT_FILE "EmployeePayOutput.txt"


int main()
{
	//Declare variables
	long socialInsuranceNum;  // Will store social security number of employee
	int numberOfExemptions;  // Will store number of excemptions for employee
	int numberOfEmployees = 0; //number of employees to store

	double payRate;			// Will store the pay rate for the employee
	double hoursWorked;		// Will store hours worked for the employee

	double grossPay = 0.0;
	double netPay = 0.0;
	double pension = 0.0;
	double deductions = 0.0;
	double totalGross = 0.0;
	double totalNet = 0.0;
	double totalWitheld = 0.0;
	double totalDeducted = 0.0;

	//Define ifstream object and open file
	ifstream ins;
	ins.open(IN_FILE);

	//Check that file opened without any issues
	if (ins.fail())
	{
		cerr << "ERROR--> Unable to open input file : " << IN_FILE << endl;
		cerr << '\n' << endl;
		_getch(); // causes execution to pause until a char is entered
		return -1; //error return code
	}

	//Define ofstream object and open file
	ofstream outs;
	outs.open(OUT_FILE);

	//Check that file opened without any issues
	if (outs.fail())
	{
		cerr << "ERROR--> Unable to open output file : " << OUT_FILE << endl;
		cerr << '\n' << endl;
		_getch(); // causes execution to pause until a char is entered
		return -2; //error return code
	}

	// Read in first social security number
	ins >> socialInsuranceNum;

	outs << "Rogers Hospital Supplies Company " << endl;
	outs << "-------------------------------- \n" << endl;
	outs << "Social insurance no.   gross pay    net pay    pension    deductions" << endl;
	outs << "--------------------------------------------------------------------" << endl;

	// Process data until end of file is reached
	while (!ins.eof()) 
	{
		// Read in other data for the employee
		ins >> payRate >> numberOfExemptions >> hoursWorked;

		// Validate data prior to writing to file
		if ((validateSin(socialInsuranceNum) && validatePay(payRate) && validateExempt(numberOfExemptions) && validateHours(hoursWorked)))
		{
			// Data calculations
			grossPay = calculateGrossPay(hoursWorked, payRate); 
			pension = calculatePensionPay(grossPay); 
			deductions = calculateDeductionsPay(grossPay, numberOfExemptions);
			netPay = calculateNetPay(grossPay, pension, deductions);

			// Write data to file
			outs << socialInsuranceNum << "\t" << fixed << showpoint <<
				setprecision(2) << setw(16) << grossPay << setw(12) <<
				netPay << setw(12) << pension << setw(12) << deductions << '\n';

			// Keep track of data totals for Summary
			numberOfEmployees++; 
			totalGross = totalGross + grossPay; //total gross 
			totalNet = totalNet + netPay; //total net 
			totalWitheld = totalWitheld + pension; //total withheld 
			totalDeducted = totalDeducted + deductions; //total deductions

		}


		// Display error for invalid SIN
		if (!validateSin(socialInsuranceNum))
		{
			cerr << "INVALID DATA ERROR : Invalid social security #";
			cout << "\n";
		} 

		// Pay rate error message
		if (!validatePay(payRate))
		{
			cerr << "INVALID DATA ERROR: Invalid hours worked: ";
			cout << "\n";
		}

		// Number of exemptions error
		if (!validateExempt(numberOfExemptions))
		{
			cerr << "INVALID DATA ERROR: Invalid number of exemptions: ";
			cout << "\n";
		} 

		// Hours worked error 
		if (!validateHours(hoursWorked))
		{
			cerr << "INVALID DATA ERROR : Invalid pay rate: ";
			cout << "\n";
		} 


		// Read in next social security number
		ins >> socialInsuranceNum;
	}

	// Close files
	ins.close();
	outs.close();

	// Open file to with append option to include summary
	outs.open(OUT_FILE, ios_base::app | ios_base::out);

	outs << "\n\n" << "Summary\n" << "------ -" << fixed << showpoint << setprecision(2) <<
		"\n" << "Number of employees processed: " << setw(27) << numberOfEmployees <<
		"\n" << "Total gross pay for all employees: " << setw(23) << totalGross <<
		"\n" << "Total net pay for all employees: " << setw(25) << totalNet <<
		"\n" << "Total pension withheld for all employees: " << setw(16) << totalWitheld <<
		"\n" << "Total deductions for all employees: " << setw(22) << totalDeducted << endl;

	outs.close(); // Close file after appending summary
	cout << '\n' << endl;
	_getch(); // causes execution to pause until char is entered
}// end main function


// validates SIN number
bool validateSin(const long& sinNumber)
{
	if ((sinNumber > SIN_MIN) && (sinNumber < SIN_MAX))
	return sinNumber;
} 

// Validates hours function
bool validateHours(const double &hours)
{
	if ((hours >= 0) && hours <= OVERTIME_HOURS)
	return hours;
} 

// Validates pay
bool validatePay(const double &pay)
{
	if ((pay >= 0) && (pay <= MAX_RATE))
	return pay;
} 

// Validate exemptions
bool validateExempt(const int &exempt)
{
	if ((exempt >= 0) && (exempt <= MAX_EXEMPTION_HOURS))
	return exempt;
} 

// calculate Gross Pay
double calculateGrossPay(const double &hours, const double &pay)
{
	//variable initialization
	double regularHours = 0.0;
	double extraHours = 0.0;
	double grossPay = 0.0;
	double overtimePayRate = 1.5;

	if (hours <= REGULAR_HOURS && hours >= 0)
	{
		regularHours = hours;
	}
	else
	{
		regularHours = REGULAR_HOURS;
		extraHours = hours - REGULAR_HOURS;
	} 

	grossPay = ((regularHours * pay) + (extraHours * (pay * overtimePayRate)));

	return grossPay;
} 



// Calculate pension pay
double calculatePensionPay(const double &grossPay)
{
	double pension = 0.0;
	double percent = 0.077;
	double rate = 16.50;
	pension = percent * grossPay ;

	if (rate < pension)
	{
		pension = rate;
	}
	return pension;
}

// calcualtes deductions
double calculateDeductionsPay(const double& gross, const int& exempt)
{
	double pension = calculatePensionPay(gross);
	double provincialTaxAmount = 0.35;
	double taxableAmount = 0.0;
	double federalTax = 0.0;
	double provincialTax = 0.0;
	double deductionAmount = 0.0;

	taxableAmount = gross - (14.00 * exempt) - 11.00;
	federalTax = taxableAmount * (0.14 + (0.00023 * taxableAmount));
	provincialTax = federalTax * provincialTaxAmount;

	if (gross > MIN_PAY)
	{
		deductionAmount = pension + federalTax + provincialTax;
	}
	else
	{
		deductionAmount = pension;
	} 

	return deductionAmount;
} // End calculateDeductions



// Calculate Net Payment 
double calculateNetPay(const double &gross, const double &pension, const double &deductions)
{
	double net = 0.0;

	if (gross < 0)
	{
		net = gross;
	}
	else
	{
		net = gross - deductions;
	} 

	return net;
} // End calculateNet