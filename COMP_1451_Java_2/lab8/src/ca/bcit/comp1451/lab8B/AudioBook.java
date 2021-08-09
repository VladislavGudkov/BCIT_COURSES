package ca.bcit.comp1451.lab8B;

public class AudioBook extends AudioMaterial
{

	private int totalNumberOfPages;
	private String authorName;
	
	//Constructor for class AudioBook
	public AudioBook(String name, double playingTimeInMinutes, int totalNumberOfPages, String authorName)
	{
		super(name, playingTimeInMinutes);
		setTotalNumberOfPages(totalNumberOfPages);
		setAuthorName(authorName);
	}

	//get method for numberOfPages
	public int getTotalNumberOfPages()
	{
		return totalNumberOfPages;
	}

	//set method for numberOfPages
	public void setTotalNumberOfPages(int totalNumberOfPages)
	{
		if (totalNumberOfPages > 0)
		{
			this.totalNumberOfPages = totalNumberOfPages;
		} 
		else 
		{
			throw new IllegalArgumentException("please enter a postive value");
		}
	}

	//Get method for authorName
	public String getAuthorName()
	{
		return authorName;
	}

	//Set method for authorName
	public void setAuthorName(String authorName)
	{
		if (authorName != null && !authorName.isEmpty()) 
		{
			this.authorName = authorName;
		} 
		else 
		{
			throw new IllegalArgumentException("Author name cannot be null or an empty string");
		}	
	}
	
	
	
	
}
