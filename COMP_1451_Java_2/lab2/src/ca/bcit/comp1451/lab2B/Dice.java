package ca.bcit.comp1451.lab2B;

import java.util.Random;
public class Dice
{
	private int faceValue;
	private static Random random;
	
	//Constructor for class Dice
	public Dice()
	{
		random = new Random();
		roll();
	}
	
	//Accesor method for faceValue
	public int getFaceValue()
	{
		return faceValue;
	}
	
	//Method to roll a die, returns the die face value
	public int roll()
	{
		//generate number between 1 and 6 inclusive
		faceValue = random.nextInt(6) + 1 ;
		//that number assigned to instance variable face value
		return faceValue;
	}
	
}
