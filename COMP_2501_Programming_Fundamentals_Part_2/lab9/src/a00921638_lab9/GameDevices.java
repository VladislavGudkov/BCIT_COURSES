package a00921638_lab9;

/**
* @author Vladislav Gudkov (A00921638)
 */
public class GameDevices extends ElectronicDevices
{
	//attributes 
	boolean hasInternetSupport;
	boolean isPortable;
	int numberOfGames;
	
	//constructor
	public GameDevices(String ManufacturerName, String deviceName, int yearPurchased, double price, boolean hasInternetSupport, boolean isPortable, int numberOfGames) 
	{
		super(ManufacturerName, deviceName, yearPurchased, price);
		this.hasInternetSupport = hasInternetSupport;
		this.isPortable = isPortable;
		this.numberOfGames = numberOfGames;
	}
	
	
	
	
	//getters and setters
	public boolean isHasInternetSupport() 
	{
		return hasInternetSupport;
	}
	
	public void setHasInternetSupport(boolean hasInternetSupport)
	{
		this.hasInternetSupport = hasInternetSupport;
	}
	
	public boolean isPortable()
	{
		return isPortable;
	}
	
	public void setPortable(boolean isPortable) 
	{
		this.isPortable = isPortable;
	}
	
	public int getNumberOfGames() 
	{
		return numberOfGames;
	}
	
	public void setNumberOfGames(int numberOfGames) 
	{
		this.numberOfGames = numberOfGames;
	}




	@Override
	public String toString() 
	{
		return "GameDevices [hasInternetSupport=" + hasInternetSupport + ", isPortable=" + isPortable
				+ ", numberOfGames=" + numberOfGames + ", deviceName=" + deviceName + ", ManufacturerName="
				+ ManufacturerName + ", yearPurchased=" + yearPurchased + ", price=" + price + "]";
	}
	
	
	
	
	
	
	
	
}
