/* Test StrLength function */

#include "nodep.h" //suppress deprecation warnings
#include <stdio.h> //printf(), scanf()
#include <conio.h> //getch()

//function prototype:
int StrLength(char sStr[]);

int main(void)
   {
   char sString[51]; //max 50 chars + null terminator

   printf("Test StrLength function...\n\n");

   while(1==1)
      {
      printf("\nEnter string: ");
      gets(sString);
      printf("\nString %s has %d characters\n", sString, StrLength(sString));
      } //endwhile

   return 0;
   } //end program

//----------------------------------------------------------------------
//function definition:
int StrLength(char sStr[])
   {
   int iIndex;

   for(iIndex = 0; sStr[iIndex] != '\0'; iIndex++)
      ;

   return iIndex;
   } //endStrLength
