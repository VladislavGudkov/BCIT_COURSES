package a00921638_lab9;

/**
* @author Vladislav Gudkov (A00921638)
 */

public class VideoDevices extends ElectronicDevices
{
	
	//attributes 
	boolean hasVGA;
	boolean hasHDMI;
	double supportedHDMIVersion;
	
	//constructor
	public VideoDevices(String ManufacturerName, String deviceName, int yearPurchased, double price, boolean hasVGA, boolean hasHDMI, double supportedHDMIVersion)
	{
		super(ManufacturerName, deviceName, yearPurchased, price);
		this.hasVGA = hasVGA;
		this.hasHDMI = hasHDMI;
		this.supportedHDMIVersion = supportedHDMIVersion;
	}

	
	
	//getters and setters
	public boolean isHasVGA() 
	{
		return hasVGA;
	}
	public void setHasVGA(boolean hasVGA) 
	{
		this.hasVGA = hasVGA;
	}
	
	public boolean isHasHDMI() 
	{
		return hasHDMI;
	}
	
	public void setHasHDMI(boolean hasHDMI) 
	{
		this.hasHDMI = hasHDMI;
	}
	
	public double getSupportedHDMIVersion() 
	{
		return supportedHDMIVersion;
	}
	
	public void setSupportedHDMIVersion(double supportedHDMIVersion) 
	{
		this.supportedHDMIVersion = supportedHDMIVersion;
	}



	@Override
	public String toString() 
	{
		return "VideoDevices [hasVGA=" + hasVGA + ", hasHDMI=" + hasHDMI + ", supportedHDMIVersion="
				+ supportedHDMIVersion + ", deviceName=" + deviceName + ", ManufacturerName=" + ManufacturerName
				+ ", yearPurchased=" + yearPurchased + ", price=" + price + "]";
	}
	
	
	

}
