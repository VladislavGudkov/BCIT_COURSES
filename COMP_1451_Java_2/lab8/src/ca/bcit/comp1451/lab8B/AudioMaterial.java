package ca.bcit.comp1451.lab8B;

public abstract class AudioMaterial implements Comparable <AudioMaterial>
{

	//instance variables
	private String name;
	private double playingTimeInMinutes;
	
	//Constructor for AudioMaterial
	public AudioMaterial(String name, double playingTimeInMinutes) 
	{
		setName(name);
		setPlayingTimeInMinutes(playingTimeInMinutes);
	}
	
	//get for name
	public String getName()
	{
		return name;
	}
	
	//set for name
	public void setName(String name)
	{
		if (name != null && !name.isEmpty())
		{
			this.name = name;
		} 
		else 
		{
			throw new IllegalArgumentException("name cannot be null or an empty string");
		}
	}

	//get for playingTimeInMinutes
	public double getPlayingTimeInMinutes()
	{
		return playingTimeInMinutes;
	}

	//set for playingTimeInMinutes
	public void setPlayingTimeInMinutes(double playingTimeInMinutes)
	{
		if (playingTimeInMinutes > 0) 
		{
			this.playingTimeInMinutes = playingTimeInMinutes;
		}
		else
		{
			throw new IllegalArgumentException("Please enter a positive value");
		}	
	}
	
	//compareTo method
	public int compareTo(AudioMaterial object)
	{
		return(int)(this.getPlayingTimeInMinutes() - object.getPlayingTimeInMinutes());
	}
	
	//String Override
	@Override
	public String toString()
	{
		return "Name: " + getName() + ", Play Time (minutes): " + getPlayingTimeInMinutes();
		
	}
	
}
