// Assign_01 (Exercise 3.16)
// Name: Vladislav Gudkov (A00921638)
// Date: May 31, 2020

#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h>
#include <conio.h>

const float EXIT_VALUE = -1.0f;

int main(void)
{
	float gallons; // gallons used
	float milesDriven; // amonut of miles driven
	float milesPerGallon; //  miles per gallon
	float averageMilesPerGallon; // Average miles per gallon
	int totalNumberOfMilesDriven = 0; //counter for the number of total miles
	float totalNumberOfMiles = 0;
	

	// get gallons
	printf("%s%.1f%s", "Enter the gallons used (", EXIT_VALUE, " to end): ");
	scanf("%f", &gallons);

	// loop until EXIT_VALUE  is read from user
	while (gallons != EXIT_VALUE) 
	{
		printf("%s", "Enter the miles driven: "); // get milesDriven
		scanf("%f", &milesDriven);

		
		//Calculates average miles per gallon to 6 decimal places as per example
		milesPerGallon = milesDriven / gallons;
		printf("The miles/gallon for this tank was %.6f\n\n", milesPerGallon);
		totalNumberOfMilesDriven++;
		totalNumberOfMiles = totalNumberOfMiles + milesPerGallon;


		//continues while loop again if EXIT_VALUE was not enetered
		printf("%s%.1f%s", "Enter the gallons used (", EXIT_VALUE, " to end): ");
		scanf("%f", &gallons);

	} // end while

	averageMilesPerGallon = totalNumberOfMiles / totalNumberOfMilesDriven;
	printf("\nThe averall average miles/galon was %.6f\n\n", averageMilesPerGallon);
	
	_getch();
	return 0;

} // end main

