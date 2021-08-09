/*
Filename: Lab 5_B.c template
Author:
ID:
Date:
*/

/* This program traps key presses,
   including special keys */

#define _CRT_SECURE_NO_DEPRECATE 1
#define _CRT_NONSTDC_NO_DEPRECATE 1
#include <stdio.h>
#include <conio.h>

int main(void)
   { 
   int iFirstKeyCode, iSecondKeyCode;

   printf("Hello, my name is \n\n");
   printf("This program traps key presses\n\n");
   printf("To exit loop, press Ctrl-Break\n\n");
   printf("Press any key...\n\n");

   while(1 == 1) // infinite loop
      {
      /* if a key is pressed */
      if(kbhit())
         {
         
         iFirstKeyCode = getch();

         
         if(iFirstKeyCode == 0)
            {
            
            }

       
         else
            {
          
            }

         } //endif
      } //endwhile

   return 0;
   } //end program
