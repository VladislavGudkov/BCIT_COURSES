//Title: ELEX 2125 Lab 7A
//Name: Vladislav Gudkov
//Student ID: A00921638
//Set: A
//Date: Mar. 5, 2018

/*Description:
This program takes the input and changes a lowercase letter input to an uppercase, if its already uppercase it returns the lowercase equivalent, else it returns "THAT IS NOT A LETTER!"
It does not take into account some double ascii codes.
*/

/* Test change_case function. */

#define _CRT_SECURE_NO_DEPRECATE 1 
#define _CRT_NONSTDC_NO_DEPRECATE 1 
#include <stdio.h> //printf(), scanf()
#include <conio.h> //getch()

#define ESC 27
#define LETTER_a 97
#define LETTER_z 122
#define LETTER_A 65
#define LETTER_Z 90

//function prototype:
char change_case(char cIn);

int main(void)
{
	char cInput, cOutput;

	printf("Test change_case function...\n\n");
	printf("(Press ESC to exit, any other key to keep testing)\n");

	do
	{
		printf("\n\nEnter letter: ");
		cInput = _getche();
		cOutput = change_case(cInput);
		if (cOutput >= LETTER_A && cOutput <= LETTER_Z || cOutput >= LETTER_a && cOutput <= LETTER_z)
			printf("\nLetter with case changed = %c\n", cOutput); //endif
		else
			printf("\nTHAT IS NOT A LETTER!");
	} while (cInput != ESC);
	//enddowhile

	return 0;
} //end program


  //----------------------------------------------------------------------
  //function definition:
char change_case(char cIn)
{
	if (cIn >= LETTER_A && cIn <= LETTER_Z)
		return (cIn + 32);
	else if (cIn >= LETTER_a && cIn <= LETTER_z)
		return (cIn - 32);
	return 0;
}