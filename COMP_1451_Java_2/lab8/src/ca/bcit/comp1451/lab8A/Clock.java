package ca.bcit.comp1451.lab8A;

public abstract class Clock implements Displayable
{
	//instance variables
	private int minute;
	private int second;
	
	//symbolic constants
	public static final int CLOCK_START = 0;
	public static final int CLOCK_END = 59;
	
	
	//Constructor for class Clock
	public Clock(int minute, int second)
	{
		setMinute(minute);
		setSecond(second);
	}
	
	
	//getter for minute
	public int getMinute()
	{
		return minute;
	}
	
	
	//getter for second
		public int getSecond()
		{
			return second;
		}


	//mutator for minute
	public void setMinute(int minute)
	{
		if(minute >= CLOCK_START && minute <= CLOCK_END)
		{
			this.minute = minute;
		}
		else
		{
			throw new IllegalArgumentException("please enter a valid number between 0 and 59 inclusive");
		}
	}

	//mutator for second
	public void setSecond(int second)
	{
		if(second >= CLOCK_START && second <= CLOCK_END)
		{
			this.second = second;
		}
		else
		{
			throw new IllegalArgumentException("please enter a valid number between 0 and 59 inclusive");
		}
		
	}
	
	public abstract void setHour(int hour);
	public abstract int getHour();
	
}
