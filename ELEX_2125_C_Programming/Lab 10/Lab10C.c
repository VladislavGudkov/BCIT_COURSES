/* Look at pointers and arrays in Debugger */

#include "nodep.h"
#include <stdio.h>
#include <conio.h>

int main(void)
   {
   char cArray[] = "Santa Claus", *pChar;
   int iArray[] = {2, 4, 6, 8}, *pInt, iIndex, iX, iTemp;
   double fArray[] = {1.23, 2.34, 3.45, 4.56, 5.67}, *pDouble, fX = 0.0;

   pChar = cArray; //point to first element in character array
   pInt = iArray; //point to first element in integer array
   pDouble = fArray; //point to first element in double array

   //process string ...
   for(iIndex = 0; *(pChar + iIndex) != '\0'; iIndex++)
      ; //endfor
   iX = iIndex;

   //manipulate integer array...
   iTemp = *pInt;
   *pInt = *(pInt + 3);
   *(pInt + 3) = iTemp;
   iTemp = *(pInt + 1);
   *(pInt + 1) = *(pInt + 2);
   *(pInt + 2) = iTemp;

   //process double array...
   for(iIndex = 0; iIndex < sizeof(fArray) / sizeof(double); iIndex++)
      fX += *(pDouble + iIndex);
      //endfor

   //increment char pointer to see address steps in char array
   pChar++;
   pChar++;
   pChar++;

   //increment int pointer to see address steps in int array
   pInt++;
   pInt++;
   pInt++;

   //increment double pointer to see address steps in double array
   pDouble++;
   pDouble++;
   pDouble++;

   return 0;
   } //end program
