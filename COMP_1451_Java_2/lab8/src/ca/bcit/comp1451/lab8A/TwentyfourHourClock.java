package ca.bcit.comp1451.lab8A;

public class TwentyfourHourClock extends Clock
{

	//instance variables
	private int hour;
	
	//Symbolic constants
	private static final int MAX_HOUR = 23;
	private static final String LEADING_ZERO = "0";
	private static final int END_DIGIT = 10;
	
	//constructor for class TwentyfourHourClock
	public TwentyfourHourClock(int hour, int minute, int second) 
	{
		super(minute, second);
		setHour(hour);
	}

	//Get method for hour
	@Override
	public int getHour()
	{
		return hour;
	}
	
	//Set method for hour
	@Override
	public void setHour(int hour)
	{
		if (hour >= 0 && hour <= MAX_HOUR)
		{
			this.hour = hour;
		} 
		else 
		{
			this.hour = 0;
		}
	}
	
	@Override
	public String getStringValue() 
	{
		String formattedTime;
		String secondString;
		String minuteString;
		String hourString;
		
		int second = getSecond();
		int minute = getMinute();
		int hour = getHour();
		
		if (second >= 0 && second < END_DIGIT)
		{
			secondString = Integer.toString(second);
			secondString = LEADING_ZERO + second;
		}
		else
		{
			secondString = Integer.toString(second);
		}
		
		if (minute > 0 && minute < END_DIGIT)
		{
			minuteString = Integer.toString(minute);
			minuteString = LEADING_ZERO + minute;
		} 
		else 
		{
			minuteString = Integer.toString(minute);
		}
		
		if (hour > 0 && hour < END_DIGIT) 
		{
			hourString = Integer.toString(hour);
			hourString = LEADING_ZERO + hour;
		} 
		else 
		{
			hourString = Integer.toString(hour);
		}
		
		formattedTime = hourString + ":" + minuteString + ":" + secondString; 
		return formattedTime;
	}
	
}
