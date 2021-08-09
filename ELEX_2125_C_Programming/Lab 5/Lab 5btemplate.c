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

	while (1 == 1) // infinite loop
	{
		/* if a key is pressed */
		if (kbhit())
		{
			/* get first key code */
			iFirstKeyCode = getch();
			iSecondKeyCode = iFirstKeyCode;
			//printf("The %c (%d) key was just pressed\n", iFirstKeyCode, iSecondKeyCode);

			/* if character is from "0" group */
			if (iFirstKeyCode == 0)
			{
				iSecondKeyCode = getch();
				iFirstKeyCode = iSecondKeyCode;
				if (iSecondKeyCode == 59)
					printf("The F1 key was just pressed\n");
				if (iSecondKeyCode == 60)
					printf("The F2 key was just pressed\n");
			

			/* else, if character is from "224" group */
			else if (iFirstKeyCode == 224)
			{
				iSecondKeyCode = getch();
				iFirstKeyCode = iSecondKeyCode;

				if (iSecondKeyCode == 71)
					printf("The Home key was just pressed\n");
				else if (iSecondKeyCode == 79)
					printf("The End key was just pressed\n");

			}
				/*  else, character is ASCII*/
			else
				{
					
					printf("The %c (%d) key was just pressed\n", iFirstKeyCode, iFirstKeyCode);
					//if (iSecondKeyCode == 8)
				//	printf("The Backspace key was just pressed\n");
				}
				
			} //endif
			
		} //endwhile
	}
	return 0;
	
} //end program
