/*
Filename: Lab 5_A.c
Author: David Romalo
Date: Oct. 5, 2009
*/

/* This program traps key presses */

#define _CRT_SECURE_NO_DEPRECATE 1
#define _CRT_NONSTDC_NO_DEPRECATE 1
#include <stdio.h>
#include <conio.h>

int main(void)
   { 
   int iKeyCode;

   printf("This program traps key presses\n\n");
   printf("To exit loop, press Ctrl-Break\n\n");
   printf("Press any key...\n\n");

   while(1 == 1) //infinite loop
      {
      if(kbhit())
         {
         iKeyCode = getch();
         printf("The %c (%d) key was just pressed\n", iKeyCode, iKeyCode);
         } //endif
      } //endwhile

   return 0;
   } //end program
