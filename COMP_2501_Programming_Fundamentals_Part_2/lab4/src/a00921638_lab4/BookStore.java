package a00921638_lab4;

import java.util.ArrayList;

/**
 * @author Vladislav Gudkov (A00921638)
 */

public class BookStore 
{
	//Symbolic Constants
	static final int MIN_LENGTH = 0;
	static final String NULL = null;
	static final String BLANK = "";
	
	//instance variables
	private String name;
	private ArrayList <Novel> novels;
	
	//constructor for BookStore
	public BookStore(String name)
	{
		//validate name, if its Amazon change to Chapters, otherwise use parameter name
		if(name.equalsIgnoreCase("Amazon"))
		{
			this.name = "Chapters";
		}
		else	
		{
			this.name = name;
		}
		
		//create an empty arraylist of novels
		novels = new ArrayList<>();
		
		//populate the arraylist
		novels.add(null);
        novels.add(new Novel("The Adventures of Augie March", "Saul Bellow", 1953));
        novels.add(new Novel("All the King’s Men", "Robert Penn Warren", 1946));
        novels.add(new Novel("American Pastoral", "Philip Roth", 1997));
        novels.add(new Novel("An American Tragedy", "Theodore Dreiser", 1925));
        novels.add(new Novel("Animal Farm", "George Orwell", 1946));
        novels.add(new Novel("Appointment in Samarra", "John O'Hara", 1934));
        novels.add(new Novel(null, null, 1));
        novels.add(new Novel(null, "author name 1", 2));
        novels.add(new Novel("", null, 3));
        novels.add(new Novel(null, "", 4));
        novels.add(new Novel("title 1", null, 5));
        novels.add(new Novel("", "", 6));
        novels.add(new Novel("", "author name 2", 7));
        novels.add(new Novel("title", "", 8));
        novels.add(new Novel("Are You There God? It's Me, Margaret.", "Judy Blume", 1970));
        novels.add(new Novel("The Assistant", "Bernard Malamud", 1957));
        novels.add(new Novel("At Swim-Two-Birds", "Flann O'Brien", 1938));
        novels.add(new Novel("Atonement", "Ian McEwan", 2002));
        novels.add(new Novel("Beloved", "Toni Morrison", 1987));
        novels.add(new Novel("The Berlin Stories", "Christopher Isherwood", 1946));
        novels.add(new Novel("The Big Sleep", "Raymond Chandler", 1939));
        novels.add(new Novel("The Blind Assassin", "Margaret Atwood", 2000));
        novels.add(new Novel("Blood Meridian", "Cormac McCarthy", 1986));
        novels.add(new Novel("Brideshead Revisited", "Evelyn Waugh", 1946));
        novels.add(new Novel("The Bridge of San Luis Rey", "Thornton Wilder", 1927));
        novels.add(new Novel("Call It Sleep", "Henry Roth", 1935));
        novels.add(new Novel("Catch-22", "Joseph Heller", 1961));
        novels.add(new Novel("The Catcher in the Rye", "J.D. Salinger", 1951));
        novels.add(new Novel("A Clockwork Orange", "Anthony Burgess", 1963));
        novels.add(new Novel("The Confessions of Nat Turner", "William Styron", 1967));
        novels.add(new Novel("The Corrections", "Jonathan Franzen", 2001));
        novels.add(new Novel("The Crying of Lot 49", "Thomas Pynchon", 1966));
        novels.add(new Novel("A Dance to the Music of Time", "Anthony Powell", 1951));
        novels.add(new Novel("The Day of the Locust", "Nathanael West", 1939));
        novels.add(new Novel("Death Comes for the Archbishop", "Willa Cather", 1927));
        novels.add(new Novel("A Death in the Family", "James Agee", 1958));
        novels.add(new Novel("The Death of the Heart", "Elizabeth Bowen", 1958));
        novels.add(new Novel("Deliverance", "James Dickey", 1970));
        novels.add(new Novel("Dog Soldiers", "Robert Stone", 1974));
        novels.add(new Novel("Falconer", "John Cheever", 1977));
        novels.add(new Novel("The French Lieutenant's Woman", "John Fowles", 1969));
        novels.add(new Novel("The Golden Notebook", "Doris Lessing", 1962));
        novels.add(new Novel("Go Tell It on the Mountain", "James Baldwin", 1953));
        novels.add(new Novel("Gone with the Wind", "Margaret Mitchell", 1936));
        novels.add(new Novel("The Grapes of Wrath", "John Steinbeck", 1939));
        novels.add(new Novel("Gravity's Rainbow", "Thomas Pynchon", 1973));
        novels.add(new Novel("The Great Gatsby", "F. Scott Fitzgerald", 1925));
        novels.add(new Novel("A Handful of Dust", "Evelyn Waugh", 1934));
        novels.add(new Novel("The Heart Is a Lonely Hunter", "Carson McCullers", 1940));
        novels.add(new Novel("The Heart of the Matter", "Graham Greene", 1948));
        novels.add(new Novel("Herzog", "Saul Bellow", 1964));
        novels.add(new Novel("Housekeeping", "Marilynne Robinson", 1981));
        novels.add(new Novel("A House for Mr. Biswas", "V.S. Naipaul", 1962));
        novels.add(new Novel("I, Claudius", "Robert Graves", 1934));
        novels.add(new Novel("Infinite Jest", "David Foster Wallace", 1996));
        novels.add(new Novel("Invisible Man", "Ralph Ellison", 1952));
        novels.add(new Novel("Light in August", "William Faulkner", 1932));
        novels.add(new Novel("The Lion, The Witch and the Wardrobe", "C.S. Lewis", 1950));
        novels.add(new Novel("Lolita", "Vladimir Nabokov", 1955));
        novels.add(new Novel("Lord of the Flies", "William Golding", 1954));
        novels.add(new Novel("The Lord of the Rings", "J.R.R. Tolkien", 1954));
        novels.add(new Novel("Loving", "Henry Green", 1945));
        novels.add(new Novel("Lucky Jim", "Kingsley Amis", 1954));
        novels.add(new Novel("The Man Who Loved Children", "Christina Stead", 1940));
        novels.add(new Novel("Midnight's Children", "Salman Rushdie", 1981));
        novels.add(new Novel("Money", "Martin Amis", 1984));
        novels.add(new Novel("The Moviegoer", "Walker Percy", 1961));
        novels.add(new Novel("Mrs. Dalloway", "Virginia Woolf", 1925));
        novels.add(new Novel("Naked Lunch", "William Burroughs", 1959));
        novels.add(new Novel("Native Son", "Richard Wright", 1940));
        novels.add(new Novel("Neuromancer", "William Gibson", 1984));
        novels.add(new Novel("Never Let Me Go", "Kazuo Ishiguro", 2005));
        novels.add(new Novel("1984", "George Orwell", 1948));
        novels.add(new Novel("On the Road", "Jack Kerouac", 1957));
        novels.add(new Novel("One Flew Over the Cuckoo's Nest", "Ken Kesey", 1962));
        novels.add(new Novel("The Painted Bird", "Jerzy Kosinski", 1965));
        novels.add(new Novel("Pale Fire", "Vladimir Nabokov", 1962));
        novels.add(new Novel("A Passage to India", "E.M. Forster", 1924));
        novels.add(new Novel("Play It as It Lays", "Joan Didion", 1970));
        novels.add(new Novel("Portnoy's Complaint", "Philip Roth", 1969));
        novels.add(new Novel("Possession", "A.S. Byatt", 1990));
        novels.add(new Novel("The Power and the Glory", "Graham Greene", 1939));
        novels.add(new Novel("The Prime of Miss Jean Brodie", "Muriel Spark", 1961));
        novels.add(new Novel("Rabbit, Run", "John Updike", 1960));
        novels.add(new Novel("Ragtime", "E.L. Doctorow", 1975));
        novels.add(new Novel("The Recognitions", "William Gaddis", 1955));
        novels.add(new Novel("Red Harvest", "Dashiell Hammett", 1929));
        novels.add(new Novel("Revolutionary Road", "Richard Yates", 1961));
        novels.add(new Novel("The Sheltering Sky", "Paul Bowles", 1949));
        novels.add(new Novel("Slaughterhouse-Five", "Kurt Vonnegut", 1969));
        novels.add(new Novel("Snow Crash", "Neal Stephenson", 1992));
        novels.add(new Novel("The Sot-Weed Factor", "John Barth", 1960));
        novels.add(new Novel("The Sound and the Fury", "William Faulkner", 1929));
        novels.add(new Novel("The Sportswriter", "Richard Ford", 1986));
        novels.add(new Novel("The Spy Who Came in from the Cold", "John le Carre", 1964));
        novels.add(new Novel("The Sun Also Rises", "Ernest Hemingway", 1926));
        novels.add(new Novel("Their Eyes Were Watching God", "Zora Neale Hurston", 1937));
        novels.add(new Novel("Things Fall Apart", "Chinua Achebe", 1959));
        novels.add(new Novel("To Kill a Mockingbird", "Harper Lee", 1960));
        novels.add(new Novel("To the Lighthouse", "Virginia Woolf", 1929));
        novels.add(new Novel("Tropic of Cancer", "Henry Miller", 1934));
        novels.add(new Novel("Ubik", "Philip K. Dick", 1969));
        novels.add(new Novel("Under the Net", "Iris Murdoch", 1954));
        novels.add(new Novel("Under the Volcano", "Malcolm Lowry", 1947));
        novels.add(new Novel("Watchmen", "Alan Moore and Dave Gibbons", 1986));
        novels.add(new Novel("White Noise", "Don DeLillo", 1985));
        novels.add(new Novel("White Teeth", "Zadie Smith", 2000));
        novels.add(new Novel("Wide Sargasso Sea", "Jean Rhys", 1966));	
	}

	//PrintAllTitles method
	public void printAllTitles()
	{
		for (Novel novel:novels)
		{
			//if novel object is not null && novel object's title is not null && no blanks after title, print novel.title to uppercase
			if(novel != null && novel.getTitle() !=null && novel.getTitle().trim().length() > 0)
			{
				System.out.println(novel.getTitle().toUpperCase());
			}
		}
	}
	
	//printTitlesContaining method prints all titles that contain specified substring
	//boolean CaseSensetive filters whether to have substring search be case sensetive
	public void printTitlesContaining (String substring, boolean caseSensetive) throws NullPointerException, IllegalArgumentException
	{
		//if substring is null throw a null pointer exception saying null not allowed
		if(substring == null)
		{
			 throw new NullPointerException("null not allowed");
		}
		      
		//if substring parameter is blank throw IllegalArgumentException saying bad string
		if(substring.equals(""))
		{
			throw new IllegalArgumentException("bad string");
		}
		       
		
		//otherwise continue through looping of novel objects
		for (Novel novel:novels)
		{
			if(novel != null && novel.getTitle() !=null && novel.getTitle().trim().length() > 0)
			{
				if(caseSensetive)
				{
					if(novel.getTitle().contains(substring))
					{
						System.out.println(novel.getTitle());
					}
				}
				//if not case sensetive
				else 
				{
					if(novel.getTitle().toLowerCase().contains(substring.toLowerCase()))
					{
						System.out.println(novel.getTitle());
					}	
				}
			}			
		}
	}
	
	
	//printTitlesOfLength method prints titles that have String length equal to function int parameter length
	//throw a bad length exception if length is 0 or negative before loop starts
	public void printTitlesOfLength(int length) throws IllegalArgumentException
	{
		//if length is 0 or negative throw a bad length IllegalArgumentException
		if(length <= MIN_LENGTH)
		{
			 throw new IllegalArgumentException("bad length");
		}
		
		for (Novel novel:novels)      
		{
			//if novel object is not null && novel object's title is not null && no blanks after title
			if(novel != null && novel.getTitle() !=null && novel.getTitle().trim().length() > 0)
			{
				//if length parameter is less than or equal to MIN_LENGTH throw an exception
				if(novel.getTitle().length() == length)
				{
					System.out.println(novel.getTitle());
				}
			}
		}
	}
	
	//method that prints names that start or end with substring
	public void printNameStartsEndsWith(String substring) throws IllegalNameException
	{
		//if substring is null OR blank throw IllegalNameException saying bad name
		if(substring == NULL || substring == BLANK)
		{
			throw new IllegalNameException("bad name");
		}
		
		for (Novel novel:novels)
		{
			if(novel != null && novel.getAuthor_name() !=null && novel.getAuthor_name().trim().length() > 0)
			{
				if(novel.getAuthor_name().toLowerCase().startsWith(substring.toLowerCase()) || novel.getAuthor_name().toLowerCase().endsWith(substring.toLowerCase()))
				{
					//match is case insensetive so set all author names to lowercase
					System.out.println(novel.getAuthor_name().toLowerCase());
				}
			}
		}
	}
	
	//getLongest method to return string property with the longest author name or title name in any casing
	public String getLongest(String property) throws IllegalNovelPropertyException
	{
		//function variable
		String longestString = null; 
		
		//if property is not title or author in any case, throw a IllegalNovelPropertyException 
		if(!(property.equalsIgnoreCase("author")) && !(property.equalsIgnoreCase("title")))
		{
			throw new IllegalNovelPropertyException("bad property");
		}
		
		//if property argument is author in any letter casing
		else if(property.equalsIgnoreCase("author")) 
		{
			//go through novel objects
			for(Novel novel : novels)
			{
				if(novel != null && novel.getAuthor_name() != null && novel.getAuthor_name().trim().length() > 0)
				{
					if(longestString == null || longestString.length() < novel.getAuthor_name().length())
					{
						//return longest author name from a novel
						longestString = novel.getAuthor_name();
					}
				}
			}
		}
		
		//if property argument is title in any letter casing
		else if(property.equalsIgnoreCase("title")) // return longest title
		{
			//go through novel objects
			for(Novel novel : novels)
			{
				if(novel != null && novel.getTitle() != null && novel.getTitle().trim().length() > 0)
				{
					if(longestString == null || longestString.length() < novel.getTitle().length())
					{
						//return longest title name from a novel
						longestString = novel.getTitle();
					}
				}
			}
		}
		//else return null
		return longestString;
	}
	
	//main method
	public static void main(String[] args) throws Exception
	{
		BookStore bookstore = new BookStore(args[0]);
		bookstore.printAllTitles();
		try 
		{
			bookstore.printTitlesContaining("the", false);	  
		}
		catch(NullPointerException nullMessage) 
		{
			 System.out.println(nullMessage.getMessage());
			 
		}
		catch(IllegalArgumentException illegalMessage) 
		{
			System.out.println(illegalMessage.getMessage());
		}
		
		
		try 
		{
			bookstore.printTitlesContaining("the", true);  
		}
		
		catch(NullPointerException nullMessage) 
		{
			System.out.println(nullMessage.getMessage());
		}
		
		catch(IllegalArgumentException illegalMessage) 
		{
			System.out.println(illegalMessage.getMessage());
		}
		
		try 
		{
			bookstore.printTitlesOfLength(13);
		}
		catch(IllegalArgumentException illegalMessage)
		{
			System.out.println(illegalMessage.getMessage());
		}
		
		try
		{
			bookstore.printNameStartsEndsWith("An");
		}
		
		catch(IllegalNameException illegalName) 
		{
			System.out.println(illegalName.getMessage());
		}
		
		
		try
		{
			System.out.println(bookstore.getLongest("xyz"));			
		}
		
		catch(IllegalNovelPropertyException illegalNovel) 
		{
				System.out.println(illegalNovel.getMessage());
		}
		
		
		try
		{
			System.out.println(bookstore.getLongest("AutHor"));	
		}
		
		catch(IllegalNovelPropertyException illegalNovel) 
		{
				System.out.println(illegalNovel.getMessage());
		}
		
		try
		{
			System.out.println(bookstore.getLongest("titlE"));
		}
		
		catch(IllegalNovelPropertyException illegalNovel) 
		{
				System.out.println(illegalNovel.getMessage());
		}
	}
}