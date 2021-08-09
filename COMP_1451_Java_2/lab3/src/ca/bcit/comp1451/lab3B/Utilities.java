package ca.bcit.comp1451.lab3B;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Utilities
{
	//instance variables
	private HashMap<String, Integer> map;
	private Scanner input;
	
	//constructor
	public Utilities()
	{
		map = new HashMap<String, Integer>();
		input = new Scanner(System.in);
	}
	
	//Method to add the scanned word to lower case and into the hashmap
	public void populateHashMap() 
	{
		while(input.hasNext())
		{
			String word = input.next().toLowerCase();
			
			if (map.containsKey(word))
			{
				map.put(word, map.get(word) + 1);
			}
			else 
			{
				map.put(word, 1);
			}
		} 
	}
	
	
	//Method to display the contents of the hashmap
	public void displayCollection() 
	{
		for (Map.Entry<String, Integer> entrySet : map.entrySet())
		{
			String key = entrySet.getKey();
			Integer numberOfAppearances = entrySet.getValue();
			System.out.println("Word: " + key);
			System.out.println("Count: " + numberOfAppearances);
		}
	}
	
	//Method to get value associated with a string in the hashmap
	public void getCount(String word)
	{
		if (word != null && !word.isEmpty()) 
		{
			String lowerCaseWord = word.toLowerCase();
			for (Map.Entry<String, Integer> entrySet : map.entrySet()) 
			{
				if (entrySet.getKey().equals(lowerCaseWord)) 
				{
					Integer value = entrySet.getValue();
					System.out.println(lowerCaseWord + " appears " + value + " times.");
				}
			}
		}
	}
	
	//Method to display the number of the times a word appeared for a specific number in the hashmap
	public void displayTheWord(int number) 
	{
		if (number > 0)
		{
			for (Map.Entry<String, Integer> entrySet : map.entrySet()) 
			{
				if (entrySet.getValue().equals(number))
				{
					String key = entrySet.getKey();
					System.out.println(key + "has appeared " + number + " times.");
				}
			}
		}
	}
	
	//Method to remove a word from the hashmap
	public void removeWord(String word)
	{
		if (word != null && !word.isEmpty()) 
		{
			String lowerCaseWord = word.toLowerCase();
			if (map.containsKey(lowerCaseWord))
			{
				map.remove(lowerCaseWord);
			}
		}
		else
		{
			System.out.println("The given string was not found in the hash map");
		}
	}
	
	
	
	//Main method to test utilities class
	/**
	 * @param args main method
	 */
	public static void main(String[] args) 
	{
		
		Utilities utility = new Utilities();
		String testWord = "apple"; //sample word to test
		int number = 1; //start of hash map
		
		utility.populateHashMap();
		utility.displayCollection();
		utility.getCount(testWord);
		utility.displayTheWord(number);
		utility.removeWord(testWord);
		utility.displayCollection();
		
	}

}
