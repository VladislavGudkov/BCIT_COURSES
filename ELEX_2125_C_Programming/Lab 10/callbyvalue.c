/* Illustrate call-by-value */

#include "nodep.h"
#include <stdio.h>
#include <conio.h>

/* function prototype */
void swap(int iX, int iY);

int main(void)
   {
   int iNum1 = 123, iNum2 = 456;

   printf("ELEX 2125 Lab 10 Call-By-Value...\n\n");
	
   printf("In caller before swap:\t\tiNum1 =\t%d,\tiNum2 =\t%d\n\n", iNum1, iNum2);
   swap(iNum1, iNum2);
   printf("In caller after swap:\t\tiNum1 =\t%d,\tiNum2 =\t%d\n\n", iNum1, iNum2);

   printf("\nPress any key to exit...\n");
   getch();
  
   return 0;
   } //end program

//----------------------------------------------------
/* Try to swap values */
void swap(int iX, int iY)
   {
   int iTemp;

   printf("In function before swap:\tiX =\t%d,\tiY =\t%d\n\n", iX, iY);
   iTemp = iX;
   iX = iY;
   iY = iTemp;
   printf("In function after swap:\t\tiX =\t%d,\tiY =\t%d\n\n", iX, iY);
   } //endswap