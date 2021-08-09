//function definition:
void DisplayBits(int iValue)
   {
   int iBitCount; //bit counter
   int iMask = 1 << 31; //bit mask

   printf("%11d = ", iValue);

   for(iBitCount = 1; iBitCount <= 32; iBitCount++)
	    {
      if(iValue & iMask)
         putchar('1');
      else
         putchar('0'); //endifelse

      iValue <<= 1; //shift value 1 bit to left

      if(iBitCount % 8 == 0)
         putchar(' '); //endif
      } //endfor

   putchar('\n');
   } //endDisplayBits