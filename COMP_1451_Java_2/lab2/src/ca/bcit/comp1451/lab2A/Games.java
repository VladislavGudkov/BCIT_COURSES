package ca.bcit.comp1451.lab2A;

//Import statements for java utils
import java.util.Scanner;
import ca.bcit.comp1451.lab2B.Dice;
import java.util.ArrayList;
public class Games
{
	//Instance variables
	private static final int MAX_NUMBER_OF_ROUNDS = 11;
	private Scanner input;
	Dice die = new Dice();
	
	//No-args constructor for Games class
	public Games()
	{
		input = new Scanner (System.in);
	}
	
	//Text-Parser function
	//This function takes an input as a line of texts and returns the number of ints, doubles and strings
	//of the line of text input
	public void textParser()
	{	
		System.out.println("Enter a line of text: ");
		ArrayList<Integer> ints = new ArrayList<Integer>();
		ArrayList<Double> doubles = new ArrayList<Double>();
		ArrayList<String> strings = new ArrayList<String>(); 
		
		while(input.hasNext())
		{
			if(input.hasNextInt())
			{
				Integer numberOfInt = input.nextInt();
				ints.add(numberOfInt);
			}
			else if(input.hasNextDouble())
			{
				double numberOfDoubles = input.nextDouble();
				doubles.add(numberOfDoubles);
			}
			else 
			{
				String NumberOfStrings = input.next();
				strings.add(NumberOfStrings);
			}
		}
		System.out.println("Number of integers: " + ints.size());
		System.out.println("List of integers: " + ints);
		System.out.println("Number of doubles: " + doubles.size());
		System.out.println("List of doubles: " + doubles);
		System.out.println("Number of words: " + strings.size());
		System.out.println("List of words: " + strings);		
	}	
	//Play Chicago function
	public void playChicago()
	{   
		int numberOfPoints = 0;
		int roundNumber = 1;
		while (roundNumber <= MAX_NUMBER_OF_ROUNDS)
		{
			int dice1 = die.roll();
			int dice2 = die.roll();
					
			System.out.println("Round Number: "+ roundNumber);
			System.out.println("First die roll result: "+ dice1);
			System.out.println("Second dice roll result: "+ dice2);
			
			if ((dice1 + dice2) == roundNumber)
			{
				System.out.println("Points earned this game : ");
				numberOfPoints++;
			}
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
			roundNumber++;		
		}
		System.out.println("Final score: "+numberOfPoints);
	}	
}
	
	

