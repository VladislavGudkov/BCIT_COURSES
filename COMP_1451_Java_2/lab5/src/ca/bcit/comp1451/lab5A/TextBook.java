package ca.bcit.comp1451.lab5A;

public class TextBook extends ReadingMaterial
{
	//Instance variables
	private int editionNumber;
	private String authorName;
	private String subject;
	
	//Constructor for class TextBook
	public TextBook(String title, int numberOfPages, int editionNumber, String authorName, String subject)
	{ 
		super(title, numberOfPages);
		setEditionNumber(editionNumber);
		setAuthorName(authorName);
		setSubject(subject);
	}

	//Accesor method for editionNumber
	public int getEditionNumber()
	{
		return editionNumber;
	}

	//Mutator method for editionNumber
	public void setEditionNumber(int editionNumber)
	{
		if(editionNumber <= 0)
		{
			System.out.println("Edition number must be greater than or equal to 1");
		}
		else
		{
			this.editionNumber = editionNumber;
		}
	}

	//Accesor method for authorName
	public String getAuthorName()
	{
		return authorName;
	}

	//Mutator method for authorName
	public void setAuthorName(String authorName)
	{
		if (authorName != null && !authorName.isEmpty())
		{
			this.authorName = authorName;
		}
		else
		{
			this.authorName = "unknown";
		}
	}

	//Accesor method for subject
	public String getSubject()
	{
		return subject;
	}

	//Mutator method for subject
	public void setSubject(String subject)
	{
		if (subject != null && !subject.isEmpty())
		{
			this.subject = subject;
		}
		else
		{
			this.subject = "unknown";
		}
	}
	
	//Display details method
	public void displayDetails()
	{
		System.out.println("Title: "+ getTitle());
		System.out.println("Edition Number: "+ getEditionNumber());
		System.out.println("Author Name: "+ getAuthorName());
		System.out.println("Subject: "+ getSubject());
	}
	
	
	
	
	
	
}
