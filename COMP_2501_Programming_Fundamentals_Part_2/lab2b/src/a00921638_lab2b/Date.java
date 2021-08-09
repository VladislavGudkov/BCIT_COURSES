package a00921638_lab2b;

/**
 * @author Vladislav Gudkov (a00921638)
 */

//class Date
public class Date 
{
	//instance variables
	private int year;
	private String month;
	private int day;
	
	//constructor for class Date
	public Date( int year, String month, int day)
	{
		this.year = year;
		this.month = month;
		this.day = day;
		
	}
	
	//get year method
	public int getYear()
	{
		return year;
	}
	
	//get month method
	public String getMonth() 
	{
		return month;
	}
	
	//get day method
	public int getDay() 
	{
		return day;
	}
	
	//getDate method
	public String getDate()
	
	{
		return "" + month + " " + day + ", " + year;
	}
}