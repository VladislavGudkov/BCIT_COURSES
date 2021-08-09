import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 * This file has been modified by Vladislav Gudkov (A00921638)
 * This file contains part of the solution to assignment 1
 */

public class Agency
{
    @SuppressWarnings("unused")
	private final String name;
    private static HashMap<String, Property> properties;

    public static final int MIN_NAME_LEN = 1;
    public static final int MAX_NAME_LEN = 30;


    public Agency(final String name)
    {
        if(name == null)
        {
            throw new NullPointerException("Invalid name: null");
        }

        if(name.length() < MIN_NAME_LEN || name.length() > MAX_NAME_LEN)
        {
            throw new IllegalArgumentException("Invalid name: " + name);
        }
        this.name = name;

        properties = new HashMap<>();
    }

    public void addProperty(final Property property)
    {
        if(property == null)
        {
            throw new NullPointerException("Invalid property: null");
        }

        properties.put(property.getPropertyId(), property);
    }

    public Property getProperty(final String propertyId)
    {
        if(properties.containsKey(propertyId))
        {
            return(properties.get(propertyId));
        }
        else
        {
            return null;
        }
    }

    public void removeProperty(final String propertyId)
    {
        if(properties.containsKey(propertyId))
        {
            properties.remove(propertyId);
        }
    }

    public double getTotalPropertyValues()
    {
        double totalUsd = 0.0;
        Set<String> propertyIds = properties.keySet();

        for(String propertyId: propertyIds)
        {
            totalUsd +=  properties.get(propertyId).getPriceUsd();
        }

        return totalUsd;
    }

    public ArrayList<Residence> getPropertiesWithPools()
    {
        ArrayList<Residence> matches = new ArrayList<>();

        Set<String> propertyIds = properties.keySet();

        for(String propertyId: propertyIds)
        {
            Residence residence =  (Residence) properties.get(propertyId);

            if(residence.hasSwimmingPool())
            {
                matches.add(residence);
            }
        }

        if(matches.size() == 0)
        {
            return null;
        }

        return matches;
    }


    public Property[] getPropertiesBetween(final double minUsd, final double maxUsd)
    {
        int numberOfMatches = 0;
        int i = 0;

        Set<String> propertyIds = properties.keySet();

        for(String propertyId: propertyIds)
        {
            Property property =  properties.get(propertyId);

            if(property.getPriceUsd() >= minUsd && property.getPriceUsd() <= maxUsd)
            {
                numberOfMatches++;
            }
        }

        if(numberOfMatches == 0)
        {
            return null;
        }

        Property[] matches = new Property[numberOfMatches];

        for(String propertyId: propertyIds)
        {
            Property property =  properties.get(propertyId);

            if(property.getPriceUsd() >= minUsd && property.getPriceUsd() <= maxUsd)
            {
                matches[i] = property;
                i++;

            }
        }
        return matches;
    }

    public ArrayList<Address> getPropertiesOn(final String streetName)
    {
        ArrayList<Address> matches = new ArrayList<>();

        Set<String> propertyIds = properties.keySet();

        for(String propertyId: propertyIds)
        {
            Property property =  properties.get(propertyId);

            if(property.getAddress().getStreetName().equalsIgnoreCase(streetName))
            {
                matches.add(property.getAddress());
            }
        }

        if(matches.size() == 0)
        {
            return new ArrayList<Address>();
        }

        return matches;
    }

    public HashMap<String, Residence> getPropertiesWithBedrooms(final int minBedrooms, final int maxBedrooms)
    {
        HashMap<String, Residence> matches = new HashMap<>();

        Set<String> propertyIds = properties.keySet();

        for(String propertyId: propertyIds)
        {
            Residence residence =  (Residence) properties.get(propertyId);

            if(residence.getNumberOfBedrooms() >= minBedrooms && residence.getNumberOfBedrooms() <= maxBedrooms)
            {
                matches.put(residence.getPropertyId(), residence);
            }
        }

        if(matches.size() == 0)
        {
            return null;
        }

        return matches;
    }


    /*public ArrayList<String> getPropertiesOfType (final String propertyType)
    {
        String data = "";
        boolean found = false;
        int index = 1;

        ArrayList<String> strings = new ArrayList<>();


        Set<String> propertyIds = properties.keySet();

        for(String propertyId: propertyIds)
        {
            data = "";

            Property property =  properties.get(propertyId);
            Address address = property.getAddress();

            if(property.getType().equalsIgnoreCase(propertyType))
            {
                if(!found)
                {
                    found = true;
                    strings.add("Type: " + propertyType.toUpperCase() + "\n");
                }
               data += index + ") Property " + property.getPropertyId() + ": ";
               index++;



                if(address.getUnitNumber() != null)
                {
                    data += "unit #" + address.getUnitNumber() + " at ";
                }

                data += address.getStreetNumber() + " " + toTitleCase(address.getStreetName() + " ");
                data += address.getPostalCode().toUpperCase() + " in " + toTitleCase(address.getCity());
                data += " (" + property.getNumberOfBedrooms() + " bedroom";

                if(property.getNumberOfBedrooms() > 1)
                {
                    data += "s";
                }

                if(property.hasSwimmingPool())
                {
                    data += " plus pool";
                }

                data += "): $" + Math.round(property.getPriceUsd()) + ".\n";
                strings.add(data);
            }
        }

        if(!found)
        {
            strings.add("Type: " + propertyType.toUpperCase() + "\n");
            strings.add("<none found>");
        }


        return strings;
    }*/
    
    public ArrayList<Property> getPropertiesOfType(final String propertyType) {
		ArrayList<Property> results = new ArrayList<>();

		for (String key : properties.keySet()) {

			Property prop = properties.get(key);

			if (prop.getType().equalsIgnoreCase(propertyType)) {

				results.add(prop);
			}

		}

		return results;
	}

    public ArrayList<Commercial> getPropertiesWithLoadingDock()
    {
    	ArrayList<Commercial> loadingDock = new ArrayList<>();
    	
    	 Set<String> propertyIds = properties.keySet();

         for(String propertyId: propertyIds)
         {
             Commercial commercial =  (Commercial) properties.get(propertyId);

             if(commercial.isLoadingDock())
             {
                 loadingDock.add(commercial);
             }
         }
         return loadingDock;
    }
    
    public ArrayList<Commercial> getPropertiesWithHighwayAccess()
    {
    	ArrayList<Commercial> highwayAccess = new ArrayList<>();
    	
    	 Set<String> propertyIds = properties.keySet();

         for(String propertyId: propertyIds)
         {
             Commercial commercial =  (Commercial) properties.get(propertyId);

             if(commercial.isHighwayAccess())
             {
            	 highwayAccess.add(commercial);
             }
         }
         return highwayAccess;
    }
    
    public ArrayList<Retail> getPropertiesWithSquareFootage(int squareFootage)
    {
    	ArrayList<Retail> squareFootageList = new ArrayList<>();
    	
    	 Set<String> propertyIds = properties.keySet();

         for(String propertyId: propertyIds)
         {
        	 Retail retail =  (Retail) properties.get(propertyId);

             if(squareFootage <= retail.getSquareFootage())
             {
            	 squareFootageList.add(retail);
             }
         }
         return squareFootageList;
    }
    
    public ArrayList<Retail> getPropertiesWithCustomerParking()
    {
    	ArrayList<Retail> customerParking = new ArrayList<>();
    	
    	 Set<String> propertyIds = properties.keySet();

         for(String propertyId: propertyIds)
         {
        	 Retail retail =  (Retail) properties.get(propertyId);

             if(retail.isCustomerParking())
             {
            	 customerParking.add(retail);
             }
         }
         return customerParking;
    }
    
    public ArrayList<Residence> getPropertiesWithStrata()
    {
    	ArrayList<Residence> strata = new ArrayList<>();
    	
    	 Set<String> propertyIds = properties.keySet();

         for(String propertyId: propertyIds)
         {
        	 Residence residence =  (Residence) properties.get(propertyId);

             if(residence.hasStrata())
             {
            	 strata.add(residence);
             }
         }
         return strata;
    }
   
    public int getNumberOfProperties() {
    	
    	return properties.size();
    }
}
