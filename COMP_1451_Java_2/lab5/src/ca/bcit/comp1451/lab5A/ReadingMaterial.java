package ca.bcit.comp1451.lab5A;

public class ReadingMaterial
{
	//Instance variables
	private int numberOfPages;
	private String title;
	
	//Constructor for class ReadingMaterial
	public ReadingMaterial(String titlte, int numberOfPages)
	{
		setTitle(title);
		setNumberOfPages(numberOfPages);
	}

	//Accesor method for numberOfPages
	public int getNumberOfPages()
	{
		return numberOfPages;
	}
	
	//Mutator method for numberOfPages
	public void setNumberOfPages(int numberOfPages)
	{
		if(numberOfPages <= 0)
		{
			System.out.println("number of pages cannot be less than or equal to 0");
		}
		else
		{
			this.numberOfPages = numberOfPages;
		}	
	}

	//Accesor method for title
	public String getTitle()
	{
		return title;
	}

	//Mutator method for title
	public void setTitle(String title)
	{
		if (title != null && !title.isEmpty())
		{
			this.title = title;
		}
		else
		{
			this.title = "unknown";
		}
		
	}
	
	
	

}
