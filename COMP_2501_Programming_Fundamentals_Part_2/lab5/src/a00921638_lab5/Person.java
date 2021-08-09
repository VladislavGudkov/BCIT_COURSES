package a00921638_lab5;

/**
 * 
 * @author Vladislav Gudkov(A00921638)
 *
 */

public class Person 
{
	//instance variables
	private String firstName;
	private String lastName;
	private int birthYear;
	private String married;
	private double weightInPounds;
	private String highestEducationLevel;
	
	//constants
	public static final int CURRENT_YEAR = 2021;
	
	//constructors
	
	//constructor that takes all six instance variables above as parameters
	public Person(String firstName, String lastName, String married,int birthYear, double weightInPounds, String highestEducationLevel)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthYear = birthYear;
		
		if(isValidMarriageStatus(married))
		{
			this.married = married;
		}
		else
		{
			this.married = married;
		}

		this.weightInPounds = weightInPounds;
		
		if(isValidEducationLevel(highestEducationLevel))
		{
			this.highestEducationLevel = highestEducationLevel;
		}
	
	}
	
	//constructor takes 5 instance variables as parameters but sets birthYear to current year which is 2021
	public Person(String firstName, String lastName, String married, double weightInPounds, String highestEducationLevel)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		
		if(isValidMarriageStatus(married))
		{
			this.married = married;
		}

		this.weightInPounds = weightInPounds;
		
		if(isValidEducationLevel(highestEducationLevel))
		{
			this.highestEducationLevel = highestEducationLevel;
		}
		
		this.weightInPounds = weightInPounds;
		this.birthYear = CURRENT_YEAR;
	}
	
	//constructor takes three values as paramters but sets birth year to urrentYear, married status to no and highest education level to highschool
	public Person(String firstName, String lastName,double weightInPounds)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.weightInPounds = weightInPounds;
		
		this.married = "no";
		this.birthYear = CURRENT_YEAR;
		this.highestEducationLevel = "high school";
	}
	
	//method to validate highest education level
	private boolean isValidEducationLevel(String educationLevelToVerify)
	{
		if(educationLevelToVerify.equals("high school") ||educationLevelToVerify.equals("undergraduate") || educationLevelToVerify.equals("graduate") )
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//method to vaidate marriage status
	private boolean isValidMarriageStatus(String marriageStatusToVerify)
	{
		if(marriageStatusToVerify.equals("yes") || marriageStatusToVerify.equals("no") || marriageStatusToVerify.equals("Divorced") )
		{
			return true;
	    }
	    else
	    {
	    	return false;
	    }
	}
	
	//getter for firstName
	public String getFirstName() 
	{
		return firstName;
	}
	
	//setter for firstName
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	//getter for lastName
	public String getLastName() 
	{
		return lastName;
	}
	
	//setter for lastName
	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}
	
	//setter for birthYear
	public int getBirthYear() 
	{
		return birthYear;
	}
	
	//getter for birthYear
	public void setBirthYear(int birthYear) 
	{
		this.birthYear = birthYear;
	}
	
	//getter for married
	public String getMarried() 
	{
		return married;
	}
	
	//setter for married
	public void setMarried(String married) 
	{
		this.married = married;
	}
	
	//getter for weightInPounds
	public double getWeightInPounds() 
	{
		return weightInPounds;
	}
	
	//setter for weightInPounds
	public void setWeightInPounds(double weightInPounds) 
	{
		this.weightInPounds = weightInPounds;
	}
	
	//getter fir highestEducationLevel
	public String getHighestEducationLevel()
	{
		return highestEducationLevel;
	}
	
	//setter for highestEducationLevel
	public void setHighestEducationLevel(String highestEducationLevel) 
	{
		this.highestEducationLevel = highestEducationLevel;
	}
	
	public void printDetails()
	{
		//placeholder variable for status
		String marriedStatus = "";
	    
		if(this.married.equals("no"))
	    {
			marriedStatus="single";
	    }
	       
	    else if(this.married.equals("yes"))
	    {
	    	marriedStatus="married";
	    }
	       
	    else
	    {
	    	marriedStatus= this.married;
	    }
	       
		System.out.println(firstName+" "+lastName+"("+ marriedStatus +") "+" was born in "+birthYear+","+" weighs "+weightInPounds+" pounds, and has an "+ highestEducationLevel +" degree!");	
	}
	
	//print details method with one overloaded constructor
	public void printDetails(boolean kilogram)
	{
		//placeholder variable for status
		String marriedStatus="";
		double weightInKilogram;
		
		if(married.equals("no"))
	    {
			marriedStatus="single";
	    }
		
		else if(married.equals("yes"))
		{
			marriedStatus="married";
		}
		
		else
		{
			marriedStatus= this.married;
		}
		
		//if boolean parameter is true
		//weight in kilograms to pounds is 90.9/200 which is 0.4545
		if(kilogram)
		{
			weightInKilogram = weightInPounds* 0.4545;
	       
	       System.out.println(firstName +" "+lastName + "("+ marriedStatus +") "+" was born in "+ birthYear +","+" weighs "+ weightInKilogram +" kilogram, and has an "+ highestEducationLevel +" degree!");
		}
		
		//if parameter is false keep in pounds
		else
		{
			System.out.println(firstName +" "+ lastName +"("+ marriedStatus +") "+" was born in "+ birthYear +","+" weighs "+ weightInPounds +" pounds, and has an "+ highestEducationLevel +" degree!");
		}
	}
	
	//print details method with two overloaded constructors
	public void printDetails(boolean kilogram,boolean isUpperCase)
	{
		 String marriedStatus="";
		 double weightInKilogram;
	       
		 if(married.equals("no"))
	     {
			 marriedStatus= "single";
	     }
		 else if(married.equals("yes"))
	     {
			 marriedStatus = "married";
	     }
		 else
	     {
			 marriedStatus= this.married;
	     }
	       
	       //if both boolean conditions true
		 if(kilogram && isUpperCase)
	     {
			 String name=firstName.toUpperCase() +" "+ lastName.toUpperCase();
			 weightInKilogram=weightInPounds * 0.4545;
	         System.out.println(name+"("+marriedStatus+") "+" was born in "+birthYear+","+" weighs "+weightInKilogram+" kilogram, and has an "+highestEducationLevel+" degree!");
	     }
	       
	       //if first boolean true only
		 else if(kilogram)
	     {
			 weightInKilogram=weightInPounds * 0.4545;
			 System.out.println(firstName.toLowerCase()+" "+lastName.toLowerCase()+"("+marriedStatus+") "+" was born in "+birthYear+","+" weighs "+weightInKilogram+" kilogram, and has an "+highestEducationLevel+" degree!");
	     }
	       
	       //if second boolean is true only
		 else if(isUpperCase)
	     {
			 String name=firstName.toUpperCase()+" "+lastName.toUpperCase();
			 System.out.println(name+"("+marriedStatus+") "+" was born in "+birthYear+","+" weighs "+weightInPounds+" pounds, and has an "+highestEducationLevel+" degree!");
	     }
	       
	       //if both false
		 else
	     {
			 System.out.println(firstName.toLowerCase()+" "+lastName.toLowerCase()+"("+marriedStatus+") "+" was born in "+birthYear+","+" weighs "+weightInPounds+" pounds, and has an "+highestEducationLevel+" degree!");

	     }
	}
}
