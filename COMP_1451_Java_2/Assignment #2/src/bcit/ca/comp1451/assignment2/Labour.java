package bcit.ca.comp1451.assignment2;

public class Labour extends ProjectInvoice
{
	//instance variables
	private int distanceTravelledInKilometers;
	private String hourlyRateCriteria;
	private String typeOfLabour;
	
	//Constants
	private static final String REGULAR = "regular";
	private static final String OVERTIME = "overtime";
	private static final String HOLIDAY = "holiday";
	private static final String EXPERIENCED = "experienced";
	private static final String INEXPERIENCED = "inexperienced";
	private static final double TRAVELLED_DISTANCE_LABOR = 1.2;
	private static final double OVERTIME_MULTIPLIER = 1.5;
	private static final double HOLIDAY_MULTIPLIER = 3.0;
	private static final double SALES_TAX = 1.05;
	
	
	//Constructor
	public Labour (String projectName,int numberOfWorkingHours, double hourlyRate, int distanceTravelledInKilometers, String hourlyRateCriteria,  String typeOfLabour)
	{
		super(projectName, numberOfWorkingHours, hourlyRate);
		setHourlyRateCriteria(hourlyRateCriteria);
		setTypeOfLabour(typeOfLabour);
	}
	
	
	//Get method for distanceTravelledInKilometers
	public int getDistanceTravelledInKilometers()
	{
		return distanceTravelledInKilometers;
	}
	
	//Set method for distanceTravelledInKilometers
	public void setDistanceTravelledInKilometers(int distanceTravelledInKilometers)
	{
		if (distanceTravelledInKilometers > 0)
		{
			this.distanceTravelledInKilometers = distanceTravelledInKilometers;
		}
		else
		{
			throw new IllegalArgumentException("The distance in kilometers travelled must be a positive value");
		}
	}

	//Get method for hourly rate
	public String getHourlyRateCriteria()
	{
		return hourlyRateCriteria;
	}

	public void setHourlyRateCriteria(String hourlyRateCriteria)
	{
		if(hourlyRateCriteria != null)
		{
		
			if(hourlyRateCriteria.equalsIgnoreCase(REGULAR))
			{
				this.hourlyRateCriteria = REGULAR;
			}
			
			else if(hourlyRateCriteria.equalsIgnoreCase(OVERTIME))
			{
				this.hourlyRateCriteria = OVERTIME;
			}
			else if(hourlyRateCriteria.equalsIgnoreCase(HOLIDAY))
			{
				this.hourlyRateCriteria = HOLIDAY;
			}
		}
		else
		{
			this.hourlyRateCriteria = REGULAR;
		}	
	}

	//Get method for typeofLabour
	public String getTypeOfLabour()
	{
		return typeOfLabour;
	}

	//Set method for typeOfLabor
	public void setTypeOfLabour(String typeOfLabour)
	{
		if(typeOfLabour != null)
		{
		
			if(typeOfLabour.equalsIgnoreCase(EXPERIENCED))
			{
				this.hourlyRateCriteria = EXPERIENCED;
			}
			
			else if(typeOfLabour.equalsIgnoreCase(INEXPERIENCED))
			{
				this.hourlyRateCriteria = INEXPERIENCED;
			}	
		}
		else
		{
			this.typeOfLabour = INEXPERIENCED;
		}	
	}
	
	//Method to calculate total cost for the travelled distance
	public double calculateTravelledDistanceCost()
	{
		double travelledDistanceCost;
		travelledDistanceCost = TRAVELLED_DISTANCE_LABOR * getDistanceTravelledInKilometers();
		return travelledDistanceCost;
	}
	
	public double calculateTotalCost()
	{
		double totalCost = 0.0;
		String rate = getHourlyRateCriteria();
		double hourlyRate = getHourlyRate();
		int numberOfWorkingHours = getNumberOfWorkingHours();
		if(rate == REGULAR)
		{
			totalCost = numberOfWorkingHours * hourlyRate;
		}
		else if(rate == OVERTIME)
		{
			totalCost = OVERTIME_MULTIPLIER * numberOfWorkingHours * hourlyRate;
					 
		}
		else if(rate == HOLIDAY)
		{
			totalCost = HOLIDAY_MULTIPLIER *numberOfWorkingHours * hourlyRate;		 
		}
		
		totalCost = totalCost + calculateTravelledDistanceCost();
		totalCost = totalCost * SALES_TAX;
		return totalCost;
	}
	
	
	//to string override
	
	@Override
	public String toString() 
	{
		String string = super.toString();
		string = string  + "Hourly Rate Criteria: " + getHourlyRateCriteria() + ",Labour Type: " + getTypeOfLabour()   + "Cost of Labour Transportation: " + calculateTotalCost();
		return string;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
