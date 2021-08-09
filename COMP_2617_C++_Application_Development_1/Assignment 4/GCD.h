// Filename:  GCD.h
// Version:  1.0
// Author:  Vladislav Gudkov (A00921638)
// Date: 10/19/2020

const int MINIMUM_VALUE = 1;
const int START_VALUE = 0;

// template to find GCD
template<typename T>
T gcd(T numerator, T denominator)
{
	T gcd = MINIMUM_VALUE; // set GCD template value to min value

	if (numerator < START_VALUE)
	{
		numerator = -numerator;
	}  

	if (denominator < START_VALUE)
	{
		denominator = -denominator;
	} 

	// Loop from 1 till counter is less than or equal to of the two values
	for (int counter = MINIMUM_VALUE; counter <= numerator && counter <= denominator; counter++)
	{
		// check if counter is divisble by both firstValue and secondValue
		if (numerator % counter == START_VALUE && denominator % counter == START_VALUE)
		{
			gcd = counter; // set GCD to counter value given condition is true
		} 
	} // End for loop

	return gcd; // return GCD of numerator and denominator
} // End GCD template