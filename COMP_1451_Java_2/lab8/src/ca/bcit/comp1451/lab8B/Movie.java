package ca.bcit.comp1451.lab8B;

public class Movie extends AudioMaterial
{	
	//instance variables
	private String directorName;
	private int numberOfActors;
	
	//Constructor for Movie
	public Movie(String name, double playingTimeInMinutes, String directorName, int numOfActors)
	{
		super(name, playingTimeInMinutes);
		setDirectorName(directorName);
		setNumberOfActors(numOfActors);
	}

	//Get method for directorName
	public String getDirectorName()
	{
		return directorName;
	}

	//set method for directorName
	public void setDirectorName(String directorName)
	{
		if (directorName != null && !directorName.isEmpty())
		{
			this.directorName = directorName;
		} 
		else 
		{
			throw new IllegalArgumentException("Director name cannot be null or an empty string");
		}
	}

	//get method for numberOfActors
	public int getNumberOfActors()
	{
		return numberOfActors;
	}

	//set method for numberOfActors
	public void setNumberOfActors(int numberOfActors)
	{
		if (numberOfActors > 0) 
		{
			this.numberOfActors = numberOfActors;
		} 
		else 
		{
			throw new IllegalArgumentException("Number of actors must be a positive value");
		}
	}
	
	
	

}
