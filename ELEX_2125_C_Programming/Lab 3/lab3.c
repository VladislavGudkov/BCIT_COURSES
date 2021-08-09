/* Program to practice using debugger
   including a function call */

#include "nodep.h"
#include <stdio.h>
#include <conio.h>

#define MAX 5
#define PI 3.1415926

double times9(double fIn);

int main(void)
   {
   char cChar1 = 'a', cChar2 = 'b', cChar3 = 'c';
   int iIndex;
   double fPi = PI, fDouble = 1.0, fInput, fOutput;

   printf("Start program to practice using debugger...\n\n");

   while(1==1)
      {
      for(iIndex = 0; iIndex < MAX; iIndex++)
         {
         fDouble *= 10.0;
         } //endfor

      cChar1 = 'x';
      cChar2 = 'y';
      cChar3 = 'z';

      printf("Enter floating-point number: ");
      scanf("%lf", &fInput);

      fOutput = times9(fInput);

      printf("Number times 9 = %f\n\n", fOutput);
      } //endwhile
   getch();
   return 0;
   } //endprogram

//--------------------------------------------------
double times9(double fIn) 
   {
   double fTemp, fOut;
 
   fTemp = 9.0;
   fOut = fTemp * fIn;

   return fOut;
   } //endtimes9()
