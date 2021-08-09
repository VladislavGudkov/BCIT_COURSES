//Title: ELEX 2125 Lab 9
//Name : Vladislav Gudkov
//Student ID : A00921638
//Set : A
//Date : apr. 9, 2018

#define _CRT_SECURE_NO_DEPRECATE 1	//suppress deprecation warnings
#define _CRT_NONSTDC_NO_DEPRECATE 1 //suppress deprecation warnings
#include <stdio.h> //printf(), scanf()
#include <conio.h> //getch()
#include <windows.h> //Sleep()
#include <time.h> //time()
#define MASK0 0x00000001
#define MASK31 0x80000000
#define ESC 27
void DisplayBits(int iValue);
int Rotate(int iVal);
int main(void) //start program
{
	int iVal, a = 0; //loop initialize
	int iFreqs[] = {294, 349, 415, 392};   //defined is d4,f4,g#4, g4 notes in order
	int iTime[] = { 117, 99, 83, 88 }; //duration of notes above in order
	int iPause[] = { 100, 100, 100, 200 };

	printf("Lab  - My name is Vladislav Gudkov (A00921638) set A.\n");	//intro
	printf("This program will play Smoke on the Water introduction sequence while moving in bits \n");	//intro
	printf("Enter a number: ");
	scanf("%d", &iVal); //getting number to rotate
	printf("\nPress ESC to exit.\n");

	while (1)//beginning of while
	{
		DisplayBits(iVal);//function call
		iVal = Rotate(iVal);//function call and variable reassignment
		Beep(iFreqs[a], iTime[a]); //play beep sound for on the x'th note for x'th time
		Sleep(iPause[a]); // sleep for x'th time
		a++; // increment the bit
		if (kbhit == ESC)
			break;
		if (a > 3) 
			a = 0; //if x is greater than length of array, restart sequence speeds and frequencies
	}//end of while 
	return 0;
} //end of main

//------------------------------------
//function definition:
void DisplayBits(int iValue) //masking function
{
	int iBitCount; //bit counter
	int iMask = 1 << 31; //bit mask
	for (iBitCount = 1; iBitCount <= 32; iBitCount++)
	{
		if (iValue & iMask)
			putchar('1');
		else
			putchar('0'); //endifelse
		iValue <<= 1; //shift value 1 bit to left
	} //endfor
	putchar('\r');
} //endDisplayBits

int Rotate(iVal)//function definition
{
	int rotate;
	rotate = iVal << 1; //shifts to the left
	if (iVal & MASK31) //are the two values equal
		return rotate | MASK0; //return the 1 to the beginning
	else
		return rotate; //return the 0 to the beginning
					   //end if-else
} // end Rotate