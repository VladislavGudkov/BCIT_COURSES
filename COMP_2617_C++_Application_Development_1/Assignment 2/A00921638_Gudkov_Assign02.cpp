// Filename:  A00921638_Gudkov_Assign02.cpp
// Description:  A roman to Hindu-Arabic numeral converter

// Version: 1.0
// Created:  October 04, 2020
// Author:  Vladislav Gudkov (A00921638)


#include <iostream>
#include <cctype> //toupper() Function implementation

using namespace std;

// Define constant values
const int NUMBER_OF_INPUTS = 10;
const int UPPER_LIMIT = 1000000000;

int main()
{
	cout << NUMBER_OF_INPUTS << " Roman numeral values will be input and converted into\n";
	cout << "their equivalent Hindu-Arabic numeric values.\n";

	char inputChar;  // stores the char for the input

	// Loop from 1 to the NUMBER_OF_INPUTS
	for (int i = 1; i <= NUMBER_OF_INPUTS; i++)
	{
		cout << "\nInput Roman numeral # " << i << ": ";  // output current index of loop associated to the NUMBER_OF_INPUTS

		//loop variable declarations
		int limitPlaceholder = UPPER_LIMIT; // last value added to sum
		int value = 0;  // Will be used to represent Hindu-Arabic numeric value
		bool checkValidity = true; // this is set to false when non-roman numeral is encountred
		int numericValue = 0; // numeric value of roman numeral

		inputChar = cin.get(); // Input a value of the roman numeral in char format
		inputChar = toupper(inputChar); // change the input char to uppercase if not already in uppercase

		//Begin do-while loop for input conversion of roman numerals
		while ((inputChar != '\n') && checkValidity) //while char is not null terminated and char is valid roman numeral equivalent
		{
			cout << inputChar; //output the roman numeral read

			// switch statement to create roman numeric value to hindu-arabic equivalents
			switch (inputChar)
			{

			case 'M':
				numericValue = 1000;
				break;

			case 'D':
				numericValue = 500;
				break;

			case 'C':
				numericValue = 100;
				break;

			case 'L':
				numericValue = 50;
				break;

			case 'X':
				numericValue = 10;
				break;

			case 'V':
				numericValue = 5;
				break;

			case 'I':
				numericValue = 1;
				break;

			default:
				checkValidity = false;

			}

			//check validity if numeric value is valid
			if (checkValidity)
			{
				//verify that numerical value is within upper bounds of checking 
				if (limitPlaceholder < numericValue)
				{
					value = value - (2 * limitPlaceholder); //shift to limit
				}

				value = value + numericValue; //add value to 
				limitPlaceholder = value; // value now becomes previous value for next iteration
				inputChar = cin.get(); // Input a value of the roman numeral in char format
				inputChar = toupper(inputChar); // change the input char to uppercase if not already in uppercase
			}
		} //end while loop

		// If end of input is valid
		if (checkValidity)
		{
			cout << " = " << value << endl; //return total value
		}
		else
		{
			cout << " Error - last character was not valid!!! " << endl;

			do 
			{
				inputChar = getchar();  // continue reading chars until input ends
			} 
			while (inputChar != '\n');  //end do while loop

		}

	} // end for loop 

	cout << "\nTHAT'S ALL FOLKS :)\n" << endl;
	system("pause");
}

