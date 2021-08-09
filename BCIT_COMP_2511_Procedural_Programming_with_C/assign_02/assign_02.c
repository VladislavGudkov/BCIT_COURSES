// Assignment #2
// Exercise 5.23
// Name: Bob Langelaan
// Date: June 23, 2018

// Modified by: Vladislav Gudkov (A00921638)
// Date:  June 06, 2020

#define _CRT_SECURE_NO_WARNINGS

/* This application has a C function called SecondsSinceMidnight()
   that has 3 long parametes: "hours", "minutes" and "seconds".
   The function uses the 3 arguements passed to it to calculate
   and return (as a long) the number of seconds since the clock
   "struck midnight". The "hours" value passed to the function is in
   military time.

   The main() program receives as input from the user two sets of
   time values. The main() program outputs the two sets of input
   times. The SecondsSinceMidnight() function is used to calculate the
   "difference in seconds" between the two sets of input times.
   The main() program then outputs the two results returned by
   the function and the calculated "difference in seconds" between
   them. The "difference in seconds" is always output as a
   positive number.
*/

#include <stdio.h>   // needed for the printf and scanf statements
#include <math.h>    // needed for abs() library function
#include <conio.h>   // needed for _getch() call at end of main()

// Function prototypes (I have provided first, you need to provide the 2nd prototype)
long getInput(long lowValue, long highValue);

//2nd function prototype
long SecondsSinceMidnight(long hours, long minutes, long seconds);


/* The main program performs all input and output in this application.
   It also computes the "difference in seconds" between the 2 input
   times.
*/

#define SECONDS_IN_A_MINUTE 60
#define SECONDS_IN_A_HOUR 3600

int main()
{

	// Initialize 

	long hour,     // used to store hour value input from user
		minute,   // used to store minute value input from user
		second,   // used to store second value input from user

		secs1,      // used to store output from function call for first input time
		secs2,      // used to store output from function call for second input time

		diff_in_secs; // used to store calculated difference in seconds;

	long h = 50, m = 0, s = 0, s1 = 0, s2 = 0;

	    // Get inputs for the first time

	
	    printf("Enter the first hour value (0-23): ");
		hour = getInput(0, 23);
	    
		printf("\nEnter the first minute value (0-59): ");
		scanf("%u", &minute);
	
		printf("\nEnter the first second value (0-59): ");
		scanf("%u", &second);
		secs1 = SecondsSinceMidnight(hour, minute, second);

	    // Get inputs for the second time
		printf("\nEnter the second hour value (0-23): ");
		hour = getInput(0, 23);
		printf("\nEnter the second minute value (0-59): ");
		scanf("%u", &minute);
		printf("\nEnter the second second value (0-59): ");
		scanf("%u", &second);
		secs2 = SecondsSinceMidnight(hour, minute, second);

		printf("\nThe first input time converted into seconds is : %d", secs1);
		printf("\nThe second input time converted into seconds is : %d\n", secs2);
		diff_in_secs = abs(secs1 - secs2);
		printf("\nThe difference in seconds between the two input times is : %d\n", diff_in_secs);


		
	
	
	//
	//printf("Enter a valid first hour value (0-23): ");
	
	
	

	// Student provides remainder of solution here ...

	// Time to go home

	_getch();
	return 0;
}

//  Function continues to prompt for value until a valid value entered
//  The valid value is then returned.

//  low - lowest value allowed
//  high - highest value allowed

long getInput(long low, long high)
{
	long hours;
	long h = 100;
	

	
	while (h < low || h > high)
	{
		scanf("%u", &h);
		if (low <= h <= high)
		{
			hours = h;
		}
		else
		{
		}
		if (h < low || h > high)
		{
			printf("invalid value entered, Enter a valid first hour value (0-23): ");
		}
		else
		{
		}
	}

	// Student provides implementation of this function
}


//function to calculate seconds since midnight in military time
long SecondsSinceMidnight(long hours, long minutes, long seconds)
{
	long SecondsSinceMidnight = (hours * SECONDS_IN_A_HOUR) + (minutes * SECONDS_IN_A_MINUTE) + seconds;
	return abs(SecondsSinceMidnight);
}




