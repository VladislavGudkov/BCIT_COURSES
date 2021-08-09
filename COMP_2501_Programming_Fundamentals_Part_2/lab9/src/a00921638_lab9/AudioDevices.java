package a00921638_lab9;

/**
 * @author Vladislav Gudkov (A00921638)
 */

public class AudioDevices extends ElectronicDevices
{
	
	//attributes 
	int numberOfInputsSupported;
	int NumberOfOutputsSupported;
	boolean hasUSBInput;
	
	//constructor
	
	public AudioDevices(String ManufacturerName, String deviceName, int yearPurchased, double price, int numberOfInputsSupported, int numberOfOutputsSupported, boolean hasUSBInput) 
	{
		super(ManufacturerName, deviceName, yearPurchased, price);
		this.numberOfInputsSupported = numberOfInputsSupported;
		NumberOfOutputsSupported = numberOfOutputsSupported;
		this.hasUSBInput = hasUSBInput;
	}

	



	//getters and setters
	public int getNumberOfInputsSupported()
	{
		return numberOfInputsSupported;
	}
	
	public void setNumberOfInputsSupported(int numberOfInputsSupported) 
	{
		this.numberOfInputsSupported = numberOfInputsSupported;
	}
	
	public int getNumberOfOutputsSupported() 
	{
		return NumberOfOutputsSupported;
	}
	
	public void setNumberOfOutputsSupported(int numberOfOutputsSupported) {
		
		NumberOfOutputsSupported = numberOfOutputsSupported;
	}
	
	public boolean isHasUSBInput() {
		return hasUSBInput;
	}
	
	public void setHasUSBInput(boolean hasUSBInput) 
	{
		this.hasUSBInput = hasUSBInput;
	}




	@Override
	public String toString() 
	{
		return "AudioDevices [numberOfInputsSupported=" + numberOfInputsSupported + ", NumberOfOutputsSupported="
				+ NumberOfOutputsSupported + ", hasUSBInput=" + hasUSBInput + ", deviceName=" + deviceName
				+ ", ManufacturerName=" + ManufacturerName + ", yearPurchased=" + yearPurchased + ", price=" + price
				+ "]";
	}
	
	
	
	
	
}
