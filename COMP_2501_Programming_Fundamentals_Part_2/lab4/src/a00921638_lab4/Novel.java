package a00921638_lab4;
/**
 * @author Vladislav Gudkov (A00921638)
 */

public class Novel 
{
	//instance variables
	private String title;
	private String author_name;
	private int year_published;
	
	//constructor
	public Novel(String title, String author_name, int year_published)
	{
		this.title = title;
		this.author_name = author_name;
		this.year_published = year_published;
	}

	//accesor method for title
	public String getTitle() 
	{
		return title;
	}

	//accesor method for author_name
	public String getAuthor_name() 
	{
		return author_name;
	}

	//accesor method for year_published
	public int getYear_published() 
	{
		return year_published;
	}
}
