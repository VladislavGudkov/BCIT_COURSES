// Assignment 4: Fraction.cpp
// Version 1.0
// Author:  Vladislav Gudkov (A00921638)
// Date: 10/19/2020

#include "Fraction.h"
#include "GCD.h"
#include <iostream>
using namespace std;

// Default constructor
Fraction::Fraction(void)
{
	numerator = START_VALUE;
	denominator = MINIMUM_VALUE;
} // End default constructor

// non-default constructor
Fraction::Fraction(long long num, long long denom) : numerator(num), denominator(denom)
{
	simplify(); //invoke simplify function
} // End non-default constructor 

//Adds RHS to the Fraction object invoked with this method
//  (thereby modifying the Fraction object) and returns the result
const Fraction& Fraction::plusEq(const Fraction& op)
{
	numerator = numerator * op.denominator;
	numerator = numerator + (op.numerator * denominator);
	denominator = denominator * op.denominator;

	simplify(); //invoke simplify function

	return (*this); // Returns the object which invoked the method
} // End plusEq function

//Subtracts RHS from the Fraction object invoked with this method
//  (thereby modifying the Fraction object) and returns the result
const Fraction& Fraction::minusEq(const Fraction& op)
{
	numerator = numerator * op.denominator;
	numerator = numerator - (op.numerator * denominator);
	denominator = denominator * op.denominator;

	simplify(); //invoke simplify function

	return (*this); // Returns the object which invoked the method
} // End minusEq function

//Multiplies RHS by the Fraction object invoked with this method
//  (thereby modifying the Fraction object) and returns the result
const Fraction& Fraction::timesEq(const Fraction& op)
{
	numerator = numerator * op.numerator;
	denominator = denominator * op.denominator;

	simplify(); //invoke simplify function

	return (*this); // Returns the object which invoked the method
} // End timesEq function

//Divides RHS into the Fraction object invoked with this method
//  (thereby modifying the Fraction object) and returns the result
const Fraction& Fraction::divideEq(const Fraction& op)
{
	numerator = numerator * op.denominator;
	denominator = denominator * op.numerator;

	simplify(); //invoke simplify function

	return (*this); // Returns the object which invoked the method
} // End divideEq function

// Returns the negation of the Fraction object invoked with the method 
// but must NOT modify the actual Fraction object invoked with the method.
Fraction Fraction::negate(void) const
{
	// Creates a new fraction object
	Fraction negativeFraction = Fraction(-numerator, denominator);

	return negativeFraction; // returns the negated fraction object
} // End negate

// Accesor method for numerator 
long long Fraction::getNum(void) const
{
	return numerator;
} // End getNum function

// Accesor method for denominator 
long long Fraction::getDenom(void) const
{
	return denominator;
} // End getDenom function

//Display function to output fraction object in the form of numerator/denominator
void Fraction::display(void) const
{
	cout << numerator << "/" << denominator;
} // End display display function

//Function to simplify the fraction to the most reduced form
void Fraction::simplify(void)
{
	//Call GCD template to reduce fraction
	long long divisor = gcd(numerator, denominator);
	numerator = numerator / divisor;
	denominator = denominator / divisor;

	//If denominator is less than 0 set it to its negative value
	if (denominator < START_VALUE)
	{
		denominator = -denominator;
		numerator = -numerator;
	}
} // End simplify function