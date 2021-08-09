// Filename: A00921638_Gudkov_Assign05.cpp
// Description: Asssignment 05 Excercise 7.13 Duplicate Elimination with Array
// Version: 1.0
// Created: 10/21/2020
// Author: Vladislav Gudkov

#include <iostream>
#include <array>
#include <iomanip> // use of setw

using namespace std;

//Constants
const int MAX_ARRAY_SIZE = 20;
const int INPUT_MINIMUM = 10;
const int INPUT_MAXIMUM = 100;
const int LOOP_COUNTER = 1;
const int LOOP_START = 0;

bool isUnique(const int&, const array<int, MAX_ARRAY_SIZE>); // Function to confirm unique user input


int main()
{
    array<int, MAX_ARRAY_SIZE> numbers = {}; // Array number storage
    int inputValue = 0; //user input value
    int arrayPosition = -1;

    //loop from 1 to 20 and prompts user input
    for (size_t counter = LOOP_COUNTER; counter <= MAX_ARRAY_SIZE; counter++)
    {
        cout << "\nEnter # " << counter << " : ";
        cin >> inputValue;

        // While user input is not valid display error message
        while (cin.rdstate() || inputValue > INPUT_MAXIMUM || inputValue < INPUT_MINIMUM)
        {
            cin.clear();
            cin.ignore(INT_MAX, '\n');

            cerr << "The number entered is not in the valid range of " << INPUT_MINIMUM << " to " << INPUT_MAXIMUM << endl;
            cout << "\nEnter # " << counter << " : ";
            cin >> inputValue;
        } //end while loop

        // If user input is unique display unique message
        if (isUnique(inputValue, numbers))
        {
            numbers[++arrayPosition] = inputValue;

            cout << "The number: " << inputValue << " is unique" << endl;
        }

   
    } // end for loop


    cout << "\n\nThe unique numbers are:\n\n";

    for (auto index =0; index <arrayPosition; index++)
    {
        cout  << setw(5) << numbers[index];
            {
                if (index % 5 == 4);
                cout << '\n';
            }
    }//end for loop display unqiues

    cout << '\n' << endl;
    system("pause");
}

bool isUnique(const int& value, const array<int, MAX_ARRAY_SIZE> values)
{
    // Loops from 0 to 19 confirming non unique user input
    for (auto index = LOOP_START; index < MAX_ARRAY_SIZE; index++)
    {
        // If given value equals stored value return false
        if (value == values[index])
        {
            return false;
        } 
    } // End for loop

    return true;
} //end isUnqiue function