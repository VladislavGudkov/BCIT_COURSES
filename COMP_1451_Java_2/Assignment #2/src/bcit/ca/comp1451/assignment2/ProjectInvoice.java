package bcit.ca.comp1451.assignment2;

public abstract class ProjectInvoice
{
	//instance variables
	private String InvoiceNumber;
	private String projectName;
	private int numberOfWorkingHours;
	private double hourlyRate;
	
	//Static variables and symbolic Constants
	private static final String invoiceNumberPrefix = "INVC";
	private static int invoiceNumberCounter = 100;

	public ProjectInvoice(String projectName,int numberOfWorkingHours, double hourlyRate )
	{
		setProjectName(projectName);
		setNumberOfWorkingHours(numberOfWorkingHours);
		setHourlyRate(hourlyRate);
		InvoiceNumber = createInvoiceNumber();
	}

	//Get method for projectName
	public String getProjectName()
	{
		return projectName;
	}

	//Set method for projectName
	public void setProjectName(String projectName)
	{
		if(projectName != null && !projectName.isEmpty())
		{
			this.projectName = projectName;
		}
		else
		{
			throw new IllegalArgumentException("project name cannot be null or an empty string");
		}
	}

	//Get method for numberOfWorkingHours
	public int getNumberOfWorkingHours()
	{
		return numberOfWorkingHours;
	}

	//Set method for numberOfWorkingHours
	public void setNumberOfWorkingHours(int numberOfWorkingHours)
	{
		if(numberOfWorkingHours > 0)
		{
			this.numberOfWorkingHours = numberOfWorkingHours;
		}
		else
		{
			throw new IllegalArgumentException("number of working hours must be greater than 0");
		}
		
	}

	//Get method for getHourlyRate
	public double getHourlyRate()
	{
		return hourlyRate;
	}

	//Set method for getHourlyRate
	public void setHourlyRate(double hourlyRate)
	{
		if(hourlyRate > 0)
		{
			this.hourlyRate = hourlyRate;
		}
		else
		{
			throw new IllegalArgumentException("hourly rate must be a must be greater than 0");
		}
		
	}

	//Get method for InvoiceNumber
	public String getInvoiceNumber()
	{
		return InvoiceNumber;
	}
	
	//Method to create a new invoice number
	private String createInvoiceNumber()
	{
		String uniqueInvoiceNumber;
		invoiceNumberCounter++;
		Integer.toString(invoiceNumberCounter);
		uniqueInvoiceNumber = invoiceNumberPrefix + invoiceNumberCounter;
		return uniqueInvoiceNumber;
	}
	
	public abstract double calculateTotalCost();
	
	
	//CompareTo method
	public int compareTo(ProjectInvoice projectInvoiceObject) 
	{
		return(int)(this.calculateTotalCost() - projectInvoiceObject.calculateTotalCost());
	}
	
	
	@Override
	public String toString()
	{
		String s = "";
		s = "The invoice number is : " +getInvoiceNumber() +
		    ", the project name is : " + getProjectName() +
		    ", the number of working hours is : " + getNumberOfWorkingHours() +
		    ", and the hourly rate is :" + getHourlyRate();
		return s;
	}
	
	
	
	
	
	
	
	
}
