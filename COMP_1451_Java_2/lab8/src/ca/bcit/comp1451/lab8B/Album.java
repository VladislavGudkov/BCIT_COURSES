package ca.bcit.comp1451.lab8B;

public class Album extends AudioMaterial 
{
	//instance variables
	private int  numberOfSongs;
	private String artistName;
	
	//Constructor for class
	public Album(String name, double playingTimeInMinutes, int numOfSongs, String artistName)
	{
		super(name, playingTimeInMinutes);
		setNumberOfSongs(numOfSongs);
		setArtistName(artistName);
	}
	
	
	//get method for numberOfSongs
	public int getNumberOfSongs()
	{
		return numberOfSongs;
	}
	
	//set method for numberOfSongs
	public void setNumberOfSongs(int numberOfSongs)
	{
		if (numberOfSongs > 0) 
		{
			this.numberOfSongs = numberOfSongs;
		} 
		else 
		{
			throw new IllegalArgumentException("please enter a positive value");
		}
	}

	//get method for artistName
	public String getArtistName()
	{
		return artistName;
	}
	
	//Set method for artistName
	public void setArtistName(String artistName)
	{
		if (artistName != null && !artistName.isEmpty()) 
		{
			this.artistName = artistName;
		}
		else
		{
			throw new IllegalArgumentException("artist name cannot be null or an empty string");
		}
	}
	
	
	
}
