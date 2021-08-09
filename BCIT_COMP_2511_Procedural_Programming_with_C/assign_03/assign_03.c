// Assignment #3
// Exercise 6.15
// Name: Vladislav Gudkov (A00921638)
// Date:  June 12, 2020

#define _CRT_SECURE_NO_WARNINGS
#define SIZE 20

/* DESCRIPTION*/

#include <stdio.h>   // needed for the printf and scanf statements
#include <conio.h>   // needed for _getch() call at end of main()


int isUnique(int val, int array[]);

int main()

{
	int valid[20] = { 25, 25, 50, 23, 95, 55, 50, 85, 45, 25, 97, 56, 56, 33, 75, 95, 35, 86, 100, 25 }; //array of valid data
	int counter1, counter2, counter3; //loop counters
	isUnique( 100, valid);

	int size = SIZE;

	int input[SIZE];

	
	
	for (int counter1 = 0; counter1 < SIZE; ++counter1) {
		printf("enter # %d: ", counter1 +1);
		scanf("%d",&input[counter1]);

		while (input[counter1] < 10 || input[counter1] > 100) {
			printf("The number enetered is not in the valid range of 10 to 100\n");
			printf("\nenter # %d: ", counter1 + 1);
			scanf("%d", &input[counter1]);
		}
	}
	
	
	//search loop array
	for (int counter1 = 0; counter1 < size; counter1++)
	{
		for (counter2 = counter1 + 1; counter2 < size; counter2++)
		{
			//find duplicate
			if (input[counter1] == input[counter2])
			{

				//deletes duplicates
				for (int counter3 = counter2; counter2 < size; counter3++)
				{
					input[counter3] = input[counter3 + 1];
				}

				
				
			}
		}
	}

	//prints array after duplicates removed
	printf("\nArray: ");
	for (int i = 0; i < size; i++)
	{
		printf("%d\t", input[i]);
	}
	
	_getch();
	return 0;
}


//function to test uniqueness
int isUnique(int value, int array[])
{
	value = 0;
	//check size
	for (int counter1 = 0; counter1 < sizeof(array) / sizeof(array[0]); counter1++)
	{
		if (array[counter1] == value)
			printf("The number: %d is unique",&array[counter1]);
			return 1;
	}
	return 0;
}


