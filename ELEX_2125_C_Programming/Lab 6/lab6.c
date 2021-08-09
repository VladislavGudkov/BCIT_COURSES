//Title: ELEX 2125 Lab 6
//Name : Vladislav Gudkov
//Student ID : A00921638
//Set : A
//Date : Feb. 26, 2018

//Preprocessor directives//
#include <stdio.h>
#include <stdlib.h>
#include "colors.h"
#include <conio.h>
#include <time.h>
#include <windows.h>
#define _CRT_SECURE_NO_DEPRECATE 1 
#define _CRT_NONSTDC_NO_DEPRECATE 1 
#define dot 254
#define nodot 32
HANDLE hConsoleOutput; //define handle for console output functions

int top(int row1); //function to generate top dice row prototype
int mid(int row2); //function to generate middle dice row prototype
int bot(int row3); //function to generate bottom dice row prototype

int main(void) //start program
{
	hConsoleOutput = GetStdHandle(STD_OUTPUT_HANDLE); //initialize handle for console output functions
	srand((unsigned int)time(NULL)); //seed a random time for the random generated rolled dice numbers bellow
	
	printf("Hello my name is Vladislav Gudkov.\n"); //intro
	printf("My student ID is A00912638 and I am in set A.\n\n"); //intro
	printf("This program rolls two dice.\n");
	printf("\nPress any key to continue..."); 
	
	while (1)  //start infinite loop where hourglass and dice rolling functions occur
	{
				char kp = _getch(); //initilaize variable for key pressed on keyboard
				printf("\n\nShaking dice now...  ");
				if (kp == 27) //exits program if ESC is pressed (27 is ASCII decimal for ESC key)
					exit(0);
				
				for (int i = 0; i < 100; i++) 
				{
						static int position = 0;
						char cursor[4] = { '|','-','\\','/' };
						SetConsoleTextAttribute(hConsoleOutput, DRED + YELLOW_BG);
						printf("\b%c", cursor[position]);
						fflush(stdout);
						position = (position + 1) % 4;
						Sleep(10);
									}  //endfor, spin hourglass, and wait for dice roll
				int d1 = (1 + rand() % 6); //initialize dice roll 1
				int d2 = (1 + rand() % 6); //initiliaze dice roll 2

				printf("\n\n");   
				top(d1) , top (d2);  //generate dice1 row 1 & dice2 row1
				printf("\n");
				mid(d1), mid(d2); //generate dice1 row 2 & dice2 row2
				printf("\n");
				bot(d1), bot(d2); //generate dice1 row 3 & dice2 row3
				printf("\n\nHit ESC to exit, any other key to roll again..."); //return to top of while or exit 
	}	//end infinite while
	return 0;
}	//endprogram

//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//### (1 indicates a dot on the die, 0 indicated no dot for all further cases below)
//For example case 2 OR 3 (001) is the result of when the random die roll from 1-6 lands on 2 or 3
int top(int row1)
	{
		switch (row1)
		{
		case 1: //000 (result of rolling die is 1)
	        SetConsoleTextAttribute(hConsoleOutput, BLACK + WHITE_BG);
			printf("%c%c%c", nodot, nodot, nodot); 
			SetConsoleTextAttribute(hConsoleOutput, WHITE + BLACK_BG);
			printf("  ");
			break;
		case 2: case 3://001 (result of rolling die is 2 or 3)
			SetConsoleTextAttribute(hConsoleOutput, BLACK + WHITE_BG);
			printf("%c%c%c", nodot, nodot, dot);
			SetConsoleTextAttribute(hConsoleOutput, WHITE + BLACK_BG);
			printf("  ");
			break;
		default: //101: (result of rolling die is 4, 5 or 6)
			SetConsoleTextAttribute(hConsoleOutput, BLACK + WHITE_BG);
			printf("%c%c%c", dot, nodot, dot); 
			SetConsoleTextAttribute(hConsoleOutput, WHITE + BLACK_BG);
			printf("  ");
			break;
		}
		return 0;
	} //top row of dice function
	
int mid(int row2)
	{
		switch (row2)
		{
		case 2: case 4://000 (result of rolling die is 2 or 4)
			SetConsoleTextAttribute(hConsoleOutput, BLACK + WHITE_BG);
			printf("%c%c%c", nodot, nodot, nodot); 
			SetConsoleTextAttribute(hConsoleOutput, WHITE + BLACK_BG);
			printf("  ");
			break;
		case 6://101 (result of rolling die is 6)
			SetConsoleTextAttribute(hConsoleOutput, BLACK + WHITE_BG);
			printf("%c%c%c", dot, nodot, dot);
			SetConsoleTextAttribute(hConsoleOutput, WHITE + BLACK_BG);
			printf("  ");
			break;
		default: //010: (result of rolling die is 1, 3 or 5)
			SetConsoleTextAttribute(hConsoleOutput, BLACK + WHITE_BG);
			printf("%c%c%c", nodot, dot, nodot);
			SetConsoleTextAttribute(hConsoleOutput, WHITE + BLACK_BG);
			printf("  ");
			break;
		}
		return 0;
	} //middle row of dice function

int bot(int row3)
	{
		switch (row3)
		{
		case 1: //000 (result of rolling die is 1)
			SetConsoleTextAttribute(hConsoleOutput, BLACK + WHITE_BG);
			printf("%c%c%c", nodot, nodot, nodot);
			SetConsoleTextAttribute(hConsoleOutput, WHITE + BLACK_BG);
			printf("  ");
			break;
		case 2: case 3: //100  (result of rolling die is 2 or 3)
			SetConsoleTextAttribute(hConsoleOutput, BLACK + WHITE_BG);
			printf("%c%c%c", dot, nodot, nodot);
			SetConsoleTextAttribute(hConsoleOutput, WHITE + BLACK_BG);
			printf("  ");
			break;
		default: //101: (result of rolling die is 4, 5 or 6)
			SetConsoleTextAttribute(hConsoleOutput, BLACK + WHITE_BG);
			printf("%c%c%c", dot, nodot, dot);
			SetConsoleTextAttribute(hConsoleOutput, WHITE + BLACK_BG);
			printf("  ");
			break;
		}
		return 0;
	} //bottom row of dice function