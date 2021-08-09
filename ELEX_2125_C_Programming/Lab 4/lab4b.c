//Title: ELEX 2125 Lab 4B
//Name : Vladislav Gudkov
//Student ID : A00921638
//Set : A
//Date : Jan. 29, 2018





#define _CRT_SECURE_NO_DEPRECATE 1
#define _CRT_NONSTDC_NO_DEPRECATE 1

#include <stdio.h>
#include <conio.h>

int main(void) //start program
{
	/*
	int b, x, val = 1;
			printf("Enter a base: ");
			scanf("%d", &b);
			printf("\nenter an integer for the exponent: ");
			scanf("%d", &x);
			while (x != 0)
			{
				val *= b;
				--x;
			}
			printf("%d", val); //power fn //power fn
	*/


	int n, i, f;
	f = i = 1;
	printf("Enter a number: ");
	scanf("%d", &n);
	while (i <= n)
	{
		f *= i;
		i++;
	}
	printf("%d", f); //factorial fn
	


	printf("\n\nPress any key to exit...");
	getch();

	return 0;
} //end program






