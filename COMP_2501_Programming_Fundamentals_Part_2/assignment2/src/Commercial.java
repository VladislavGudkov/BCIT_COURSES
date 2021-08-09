/**
 * @author Vladislav GUdkov(A00921638)
 */
public class Commercial extends Property
{
	
	//Instance Variables
	private boolean loadingDock;
	private boolean highwayAccess;
	
	//constructor
	public Commercial(String propertyId, String type, double priceUsd, Address address, boolean loadingDock,boolean highwayAccess) 
	{
		super(propertyId, type, priceUsd, address);
		this.loadingDock = loadingDock;
		this.highwayAccess = highwayAccess;
	}

	//Get Methods
	public boolean isLoadingDock() 
	{
		return loadingDock;
	}


	public boolean isHighwayAccess() 
	{
		return highwayAccess;
	}

	@Override
	public String toString() {
		return "Commercial [loadingDock=" + loadingDock + ", highwayAccess=" + highwayAccess + "]";
	}
	
	


}
