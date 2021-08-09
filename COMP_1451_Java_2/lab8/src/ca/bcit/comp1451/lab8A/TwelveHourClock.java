package ca.bcit.comp1451.lab8A;

public class TwelveHourClock extends Clock
{
	//instance variables
	private String meridiem;
	int hour;
	
	//symbolic constants
	private static final String LEADING_ZERO = "0";
	private static final int MAX_HOUR = 11;
	private static final int END_DIGIT = 10;
	
	//constructor
	public TwelveHourClock(int hour, int minute, int second, String meridiem)
	{
		super(minute, second);
		setHour(hour);
		setMeridiem(meridiem);
	}
	
	//get method for meridiem
	public String getMeridiem() 
	{
		return meridiem;
	}
	
	//set method for meridiem
	public void setMeridiem(String meridiem)
	{
		if (meridiem != null && !meridiem.isEmpty() && (meridiem.equalsIgnoreCase("AM") || meridiem.equalsIgnoreCase("PM")))
		{
			this.meridiem = meridiem;
		} 
		else 
		{
			this.meridiem = "AM";
		}
	}
	
	
	//get method for hour
	@Override 
	public int getHour()
	{
		return hour;
	}
	
	
	//set method for hour
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
		
		formattedTime = hourString + ":" + minuteString + ":" + secondString + " " + getMeridiem(); 
		return formattedTime;
	}
	
}
