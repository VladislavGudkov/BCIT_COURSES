package ca.bcit.comp1451.lab5A;

public class Magazine extends ReadingMaterial
{
	//Instance variables
	private String scheduledPublications;
	private int numberOfSubscribers;
	
	//Constructor for class Magazine
	public Magazine(String title, int numberOfPages, String scheduledPublications, int numberOfSubscribers)
	{
		super(title, numberOfPages);
		setScheduledPublications(scheduledPublications);
		setNumberOfSubscribers(numberOfSubscribers);
	}

	//Accesor method for scheduledPublications
	public String getScheduledPublications()
	{
		return scheduledPublications;
	}

	//Mutator method for scheduledPublications
	public void setScheduledPublications(String scheduledPublications)
	{
		if (scheduledPublications != null && !scheduledPublications.isEmpty())
		{
			this.scheduledPublications = scheduledPublications;
		}
		else
		{
			this.scheduledPublications = "unknown";
		}
	}

	//Accesor method for numberOfSubscribers
	public int getNumberOfSubscribers()
	{
		return numberOfSubscribers;
	}

	//Mutator method for numberOfSubscribers
	public void setNumberOfSubscribers(int numberOfSubscribers)
	{
		if (numberOfSubscribers < 0)
		{
			System.out.println("Number of subscribers cannot be less than 0");
		}
		else
		{
			this.numberOfSubscribers = numberOfSubscribers;
		}
		
	}
	
	//Display details method
	public void displayDetails()
	{
		System.out.println("Title: "+ getTitle());
		System.out.println("Number of Subscribers: "+ getNumberOfSubscribers());
		System.out.println("Scheduled Publications: "+ getScheduledPublications());
	}
	
	
}
