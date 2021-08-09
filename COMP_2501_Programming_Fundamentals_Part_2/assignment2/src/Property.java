/**
 * This file has been modified by Vladislav Gudkov (A00921638)
 * This file contains part of the solution to assignment 1
 */

public class Property
{
    private double priceUsd;
    private final Address address;
    private final String type; /* residence, commercial, or retail */
    private final String propertyId;

    public static final int MIN_BEDROOMS = 1;
    public static final int MAX_BEDROOMS = 20;

    public static final int MIN_PROPERTY_ID_LEN = 1;
    public static final int MAX_PROPERTY_ID_LEN = 6;

    public Property(String propertyId, String type, double priceUsd, Address address)
    {
        if(priceUsd < 0.0)
        {
            throw new IllegalArgumentException(String.format("Invalid price: " + priceUsd, "%.2f"));
        }
        if(address == null)
        {
            throw new NullPointerException("Invalid address: null");
        }

        if(type == null)
        {
            throw new NullPointerException("Invalid property type: null");
        }
        else
        {
            if(!type.equalsIgnoreCase("residence") &&
                    !type.equalsIgnoreCase("commercial") &&
                    !type.equalsIgnoreCase("retail"))
            {
                throw new IllegalArgumentException("Invalid property type: " + type);
            }
        }

        if(propertyId == null)
        {
            throw new NullPointerException("Invalid property id: null");
        }

        if(propertyId.length() < MIN_PROPERTY_ID_LEN || propertyId.length() > MAX_PROPERTY_ID_LEN)
        {
            throw new IllegalArgumentException("Invalid property id: " + propertyId);
        }

        this.priceUsd = priceUsd;
        this.address = address;
        this.type = type;
        this.propertyId = propertyId;
    }


    public double getPriceUsd()
    {
        return priceUsd;
    }

    public Address getAddress()
    {
        return address;
    }

    public String getType()
    {
        return type;
    }

    public String getPropertyId()
    {
        return propertyId;
    }

    public void setPriceUsd(double priceUsd)
    {
        if(priceUsd < 0.0)
        {
            throw new IllegalArgumentException(String.format("Invalid price: " + priceUsd, "%.2f"));
        }
        this.priceUsd = priceUsd;
    }
    
    public String getPropertyDetails() {
    	return String.format("Property ID: %s, Type: %s, Price: $%.2f, Address:%s", propertyId, type, priceUsd, address.getAddressDetails());
    }


	@Override
	public String toString() {
		return "Property [priceUsd=" + priceUsd + ", address=" + address +  ", type=" + type + ", propertyId=" + propertyId + "]";
	}
    
    
}

