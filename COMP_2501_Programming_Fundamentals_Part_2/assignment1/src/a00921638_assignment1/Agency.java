package a00921638_assignment1;

/**
 * 
 * @author Vladislav Gudkov (A00921638)
 *
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Agency 
{
	//instance variables
	String name;
	HashMap<String,Property> properties = new HashMap<String, Property>();
	
	//Constants
	private static final int ONE = 1;
	private static final int ZERO = 1;
	private static final int THIRTY = 30;
	
	//Constructor
	public Agency(String name)
	{
	       if(name.length() >= ONE && name.length() <= THIRTY)
	       {
	    	   this.name = name;
	       }
	       else
	       {
	    	   throw new IllegalArgumentException("Agency Name must be between 1 and 30 characters");
	       }
	}
	
	//Methods
	
	//method to add non-null property to HashMap
	public void addProperty(Property property)
	{
		if(property != null)
		{
			properties.put(property.getPropertyId(), property);
		}	
	}
	
	
	//Method that removes the property whose ID matches the parameter, from the HashMap
	public void removeProperty(String propertyID)
	{
	
		for (Map.Entry< String,Property> property : properties.entrySet()) 
		{
			if(property.getKey().equalsIgnoreCase(propertyID) && property != null)
	        {
				properties.remove(property.equals(propertyID));  
	        }      
	    }
	}
	
	//method that returns the property whose ID matches the parameter, from the HashMap (or null if there is no match)
	public Property getProperty(String propertyID)
	{
		for (Map.Entry< String,Property> property : properties.entrySet()) 
		{
			if(property.getKey().equalsIgnoreCase(propertyID))
	        {
				return property.getValue();  
	        }      
	    }
		return null;
	}
	
	//method that returns the total amount in USD of all Properties
	public double getTotalPropertyValues()
	{
		double totalInUsd = 0;
		
		for (Map.Entry< String,Property> property : properties.entrySet())
		{
			totalInUsd = totalInUsd + property.getValue().getPriceUsd();
		}
		return totalInUsd;
	}
	
	
	//method that returns an ArrayList of such Properties…or null if there are none
	public ArrayList getPropertiesWithPools()
	{
		ArrayList<Property> propertiesWithPools = new ArrayList<Property>();
		for (Map.Entry< String,Property> property : properties.entrySet())
		{
			if(property.getValue().hasSwimmingPool())
			{
				propertiesWithPools.add(property.getValue());
			}
		}
		
		if(propertiesWithPools.size()> ZERO)
		{
			return propertiesWithPools;
		}
		else
		{
			return null;
		}
	}
	
	//method that returns an array of properties whose price falls in the range specified by the parameters…or null if there are none
	public Property[] getPropertiesBetween(int minUsd, int maxUsd)
	{
		//ArrayList<Property> propertiesInRange = new ArrayList<Property>();
		Property propertyArray[] = null;
		
		for (Map.Entry< String,Property> property : properties.entrySet()) 
		{
			if(property.getValue().getPriceUsd() >= minUsd && property.getValue().getPriceUsd() <= maxUsd)
			{
				return propertyArray;
			}    
			else if(propertyArray.length < ONE)
			{
				return null;
			}
		}
		return propertyArray;
	
	}
	
	//method that returns an ArrayList of addresses which are on the specified street…or null if there are none
	public ArrayList<Address> getPropertiesOn(String streetName)
	{
		 ArrayList<Address> propertiesOnList =new ArrayList<Address>();
		 
	       for (Map.Entry< String,Property> property : properties.entrySet()) 
	       {
	           if(property.getValue().getAddress().getStreetName().equalsIgnoreCase(streetName))
	        	   propertiesOnList.add(property.getValue().getAddress());
	       }
		
		if(propertiesOnList.size() > ZERO)
		{
			return propertiesOnList;
		}
		else
		{
			return null;
		}
	}
	
	//method that returns a HashMap of properties (key is property id, value is the Property) whose number of bedrooms falls in the range specified by the parameters…or null if there are none
	 public HashMap<String,Property> getPropertiesWithBedrooms(int minBedrooms, int maxBedrooms)
	 {
		 HashMap<String,Property> propertiesWithBedRoom = new HashMap<String, Property>();
	       
		 for (Map.Entry< String,Property> property : properties.entrySet()) 
		 {
			 if(property.getValue().getNumberOfBedrooms() >= minBedrooms && property.getValue().getNumberOfBedrooms() <= maxBedrooms)
	    	 {
	    		   propertiesWithBedRoom.put(property.getKey(),property.getValue());
	    	 }     
		 }
	       
		 if(propertiesWithBedRoom.size() > ZERO)
		 {
			 return propertiesWithBedRoom;
		 }
		 else
		 {
			 return null;
		 }		 
	 }
	
	 
	 //method that returns an ArrayList<Property>  with all the properties of the specified type that have swimming pools. 
	 public  ArrayList<Property> getPropertiesOfType(String propertyType)
	 {
		
		 ArrayList<Property> propertiesWithPool = new ArrayList<Property>();
		 
		 for (Map.Entry< String,Property> property : properties.entrySet()) 
		 {
			 if(property.getValue().getType().equalsIgnoreCase(propertyType))
			 {
				 if(property.getValue().hasSwimmingPool())
					{
						propertiesWithPool.add(property.getValue());
					}
				 else
				 {
					 //System.out.println("Type: RETAIL");
				 }
			 }
		 }
		return propertiesWithPool;
	   }
}
