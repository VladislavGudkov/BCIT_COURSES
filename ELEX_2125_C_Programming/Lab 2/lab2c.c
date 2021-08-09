
//Lab 2_C
//Modified by: Vladislav Gudkov
//ID: A00921638
//Set: B
//Date: Jan. 15, 2018


#define _CRT_SECURE_NO_DEPRECATE 1
#define _CRT_NONSTDC_NO_DEPRECATE 1

#include <stdio.h>
#include <conio.h>

int main(void)
   {
   int num;

   printf("Lab2_C...\n\n");

   num = 1; //initialize num

   while(num <= 10)
      {
      if((num % 2) == 0)
         {
         printf("%5d   He likes even numbers\n\n", num);
         }
      else
         {
         if(num == 7)
            {
            printf("%5d   EXCEPT HE LIKES THIS ODD ONE!!\n\n", num);
            }
         else
            {
            printf("*****   Yuk, he doesn't like odd numbers!\n\n");
            } //endifelse
         } //endifelse
      num = num + 1;
      } //endwhile
  
   printf("\nPress any key to exit...\n");
   getch();

   return 0;
   } //end program