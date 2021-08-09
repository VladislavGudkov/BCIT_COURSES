package a00921638_lab9;

/**
* @author Vladislav Gudkov (A00921638)
 */

public class ElectronicDevices 
{
	
	//common attributes
	String deviceName;
	String ManufacturerName;
	int yearPurchased;
	double price;
	
	//constructor
	public ElectronicDevices(String deviceName, String manufacturerName, int yearPurchased, double price) 
	{
		super();
		this.deviceName = deviceName;
		ManufacturerName = manufacturerName;
		this.yearPurchased = yearPurchased;
		this.price = price;
	}
	
	
	

	//getters and setters 
	public String getDeviceName() {
		return deviceName;
	}
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	public String getManufacturerName() {
		return ManufacturerName;
	}
	public void setManufacturerName(String manufacturerName) {
		ManufacturerName = manufacturerName;
	}
	public int getYearPurchased() {
		return yearPurchased;
	}
	public void setYearPurchased(int yearPurchased) {
		this.yearPurchased = yearPurchased;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
