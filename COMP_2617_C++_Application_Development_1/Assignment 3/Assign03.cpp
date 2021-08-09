// Filename:  A00921638_Gudkov_Assign03.cpp
// Description:  Random number multiplier and verifier

// Version: 1.0
// Created:  October 11, 2020
// Author:  Vladislav Gudkov (A00921638)

#include <iostream>
#include <cstdlib>  //prototypes for functions rand and srand
#include <ctime>

using namespace std;

void multiplication(); // function prototype
void correctMessage(); // function prototype
void incorrectMessage(); // function prototype

const int EXIT_VALUE = -1;
const int MESSAGE_OPTIONS = 4;
const int RAND_RANGE = 10;


int main()
{
	multiplication();
	system("pause");
}

void multiplication()
{
	cout << "Enter -1 to End." << endl;

	srand(static_cast<unsigned int>(time(NULL))); //generate seed from time()
	
	//local variables
	int randomValue1 = rand() % RAND_RANGE;
	int randomValue2 = rand() % RAND_RANGE;
	int inputAswer;
	int outputSolution = randomValue1 * randomValue2;

	cout << "\nHow much is " << randomValue1 << " times " << randomValue2 << " (-1 to End)? ";
	cin >> inputAswer;
	

	//loop until -1 is entered as input
	while (inputAswer != EXIT_VALUE)
	{
		//if input equals answer prompt correct message and ask question again
		if (inputAswer == outputSolution)
		{
			correctMessage();

			srand(static_cast<unsigned int>(time(NULL))); //generate seed from time()
			randomValue1 = rand() % RAND_RANGE;
			randomValue2 = rand() % RAND_RANGE;
			outputSolution = randomValue1 * randomValue2;

			cout << "\nHow much is " << randomValue1 << " times " << randomValue2 << " (-1 to End)? " ;
			cin >> inputAswer;
		}

		else if (cin.fail()) // if input is not an integer
		{
			cin.clear(); //clears input stream
			cin.ignore(); //ignores rest of stream
			cout << "Invalid input entered - try again: ";
			cin >> inputAswer; // prompt input again
		}

		else // invoke 	incorrectMessage() 
		{
			incorrectMessage();
			cout << "? ";
			cin >> inputAswer;
		}
	}
	cout << "\nThat's all for now. Bye." << endl;
} // end multiplication()

void correctMessage()
{
	unsigned int correctMessage = rand() % MESSAGE_OPTIONS;

	switch (correctMessage)
	{
	case 0:
		cout << "Very Good!" << endl;
		break;
	case 1:
		cout << "Excellent!" << endl;
		break;
	case 2:
		cout << "Nice work!" << endl;
		break;
	case 3:
		cout << "Keep up the good work!" << endl;
		break;
	default:
		break;
	} // End switch statement
} // end correctMessage()

void incorrectMessage()
{
	unsigned int incorrectMessage = rand() % MESSAGE_OPTIONS;

	switch (incorrectMessage)
	{
	case 0:
		cout << "No. Please try again." << endl;
		break;
	case 1:
		cout << "Wrong. Try once more." << endl;
		break;
	case 2:
		cout << "Don't give up!" << endl;
		break;
	case 3:
		cout << "No. Keep trying." << endl;
		break;
	default:
		break;
	} // End switch statement
} //end incorrectMessage()
