
/**
 * @author (Vlad Gudkov)
 * @version (Nov 14 2019)
 */
import java.util.Random;

public class Play
{
    //static variables
    public static final int ROW_OR_COLUMN_OFFSET_VALUE = 1;
    public static final int MINIMUM_DIMENSION = 1;
    public static final int MAXIMUM_DIMENSION = 10;

    // instance variables
    private InputReader reader; 

    /**
     * Constructor for objects of class Play
     */
    public Play()
    {
        reader = new InputReader();
    }

    /**
     * Method stringPlay
     *This method takes a string input and formats it to first letter uppercase,
     *remaining letters lowercase, and print the string the amount its length in characters
     */
    public void stringPlay()
    {
        System.out.println("Please input a String");
        String promptString = reader.readString();
        String firstLetterToUppercase = promptString.substring(0, 1).toUpperCase();
        String restOfString = promptString.substring(1).toLowerCase();
        String formattedString = firstLetterToUppercase + restOfString;

        for (int index = 0; index < formattedString.length(); index++)
        {
            System.out.println(formattedString); 
        }
    }

    /**
     * Method checkValidTableInput
     * @param inputNumber is the integer input to check validity
     * @return True if if-statement is true
     * @return false if if-statement is false
     */
    private boolean checkValidTableInput (int inputNumber)
    {
        if((inputNumber >= MINIMUM_DIMENSION) && (inputNumber  <= MAXIMUM_DIMENSION))
        {
            return true;
        } 
        else
        {
            return false;
        }
    }

    /**
     * Method getMultiplicationTable
     *This method multiples two integers between 1 and 10 and prints the multiplication table
     */
    public void getMultiplicationTable()
    {
        int row;
        int column;
        boolean isRowValidInput;
        boolean isColumnValidInput;

        do {
            System.out.print("Enter first integer for the table: ");
            row = reader.readInt();
            isRowValidInput = checkValidTableInput(row);
            System.out.print("Enter Second integer for the table: ");
            column = reader.readInt();
            isColumnValidInput = checkValidTableInput(column);

            if(isRowValidInput && isColumnValidInput)
            {
                System.out.println("Valid iputs entered!");
            }
            else
            {
                System.out.println("Invalid inputs. Please enter two more integers!");
            }
        }while(!(isRowValidInput && isColumnValidInput));
        
        int[][] multiplicationTable = new int[row+ROW_OR_COLUMN_OFFSET_VALUE][column+ROW_OR_COLUMN_OFFSET_VALUE];
        System.out.println("Multiplication table:"); 
        
        for(int rowIndex = 0; rowIndex < multiplicationTable.length; rowIndex++) 
        {
            for(int columnIndex = 0; columnIndex < multiplicationTable[rowIndex].length; columnIndex++)
            {
                multiplicationTable[rowIndex][columnIndex] = columnIndex*rowIndex;
                System.out.print(multiplicationTable[rowIndex][columnIndex] + " ");
            }
            System.out.println();
        }
    }
    
    /**
     * Method guessTheNumber
     *This method generates a random number between 1 and 10, then prompts user input
     *for a number between 1 and 10, if the number is higher or lower than the generated 
     *number, it asks the user to guess again
     */
    public void guessTheNumber()
    {
        Random rand = new Random();
        int num = rand.nextInt(10)+ 1;
        int inputGuess = reader.readInt(); 
        int guessCount = 0;

        while (num != inputGuess)
        {
            System.out.print("Enter a guess for the random integer: ");
            inputGuess  = reader.readInt(); 
            guessCount++;

            if(inputGuess < num) {
                System.out.println("Your guess is too low.");
            } else if (inputGuess > num) {
                System.out.println("Your guess is too high.");
            }
        }
        System.out.println("Congratulations! You guessed correctly after " + guessCount + " tries.");
    }

    /**
     * Method main
     * @param args is the parameter of the main method
     */
    public static void main(String[] args) 
    {
        Play newGame = new Play();
        newGame.stringPlay();
        newGame.getMultiplicationTable();
        newGame.guessTheNumber();
    }

}
