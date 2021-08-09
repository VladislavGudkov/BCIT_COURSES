//Title: ELEX 2125 Lab 8A
//Name : Vladislav Gudkov
//Student ID : A00921638
//Set : A
//Date : Mar. 26, 2018
#include "nodep.h" //remove deprecation warnings
#include <stdio.h> //include standard io
#include <conio.h> //include console io
int main(void) //start program
{
#include "Lab8AdataSetA.h"
printf("Lab 7A - My name is Vladislav Gudkov, set A.\n\n");	//intro 
printf("This program takes an array and counts the number of occurences of the number 6.0\n"); //intro
printf("it then prints the total number of elements in the array, and then the number of values that are 6.0. \n"); //intro
printf("it also computes the average value of all the elements to 7 decimal places.\n\n");	//intro
int length = sizeof(fArray)/sizeof(fArray[0]), count = 0, i = 0; ; //initliaze the length of the array using the "sizeof" function, and the for loop variables count, i
double total = 0, average; //initialize variables total, average
for (i = 0; i <= length; i++) //start for loop to count the number of occurences of 6.0 in the array
{
	if (fArray[i] == 6.0) count++; //if an indexed element of the array is 6.0 , then increment the count of the number of occurences of 6.0 by 1
} //end for loop
printf("The number of elements in the array is %d\n", length); //prints the number of elements in array
printf("The number of values that are 6.0 is %d\n", count); //prints number of values that are 6.0 in the array
for (count = 0, i = 0; count <= length; count++, i++) // set count and index back to 0 and start for loop loop to count the number of array elements
total += fArray[i]; //end single line for loop statement
average = total / length; //initialize variable(average) as the average value of the elements in the array
printf("The average is %.7f \n\nPress any key to exit....", average); //print average to 7 decimal places and then the exit statement
	getch();
	return 0;
} //end program