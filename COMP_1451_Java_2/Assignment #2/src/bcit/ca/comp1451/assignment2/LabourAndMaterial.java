package bcit.ca.comp1451.assignment2;

public class LabourAndMaterial extends Labour implements Transferable 
{

	//Instance variables
	private double materialPurchasePrice;
	private double materialVolumeInCubicFoot;
	private double materialDistanceOfTransportationKM;
	
	//symbolic constants
	private static double VOLUME_RATE_UNDER = 1.5;
	private static double VOLUME_RATE_OVER = 2.0;
	private static double SALES_TAX = 1.05;
	private static double MARK_UP = 1.15;
	
	//constructor for LabourAndMaterial
	
	public LabourAndMaterial(String projectName, int numOfWorkingHours, double hourlyRate,
			int distanceOfTransportationKM, String hourlyRateCriteria, String typeOfLabour) 
	{
		super(projectName, numOfWorkingHours, hourlyRate, distanceOfTransportationKM, hourlyRateCriteria, typeOfLabour);
		setMaterialPurchasePrice(materialPurchasePrice);
		setMaterialVolumeInCubicFoot(materialVolumeInCubicFoot);
		setMaterialDistanceOfTransportationKM(materialDistanceOfTransportationKM);
	}

	//get method for getMaterialPurchasePrice
	public double getMaterialPurchasePrice()
	{
		return materialPurchasePrice;
	}

	//set method for getMaterialPurchasePrice
	public void setMaterialPurchasePrice(double materialPurchasePrice)
	{
		if (materialPurchasePrice > 0)
		{
			this.materialPurchasePrice = materialPurchasePrice;
		}
		else
		{
			throw new IllegalArgumentException("materialPurchasePrice must be a positive value");
		}
	}

	//get method for getMaterialVolumeInCubicFoot
	public double getMaterialVolumeInCubicFoot()
	{
		return materialVolumeInCubicFoot;
	}

	//set method for setMaterialVolumeInCubicFoot
	public void setMaterialVolumeInCubicFoot(double materialVolumeInCubicFoot)
	{
		if (materialVolumeInCubicFoot > 0)
		{
			this.materialVolumeInCubicFoot = materialVolumeInCubicFoot;
		}
		else
		{
			throw new IllegalArgumentException("materialVolumeInCubicFoot must be a positive value");
		}
	}

	//get method for getMaterialDistanceOfTransportationKM
	public double getMaterialDistanceOfTransportationKM()
	{
		return materialDistanceOfTransportationKM;
	}

	//set method for getMaterialDistanceOfTransportationKM
	public void setMaterialDistanceOfTransportationKM(double materialDistanceOfTransportationKM)
	{
		if (materialDistanceOfTransportationKM > 0)
		{
			this.materialDistanceOfTransportationKM = materialDistanceOfTransportationKM;
		}
		else
		{
			throw new IllegalArgumentException("materialDistanceOfTransportationKM must be a positive value");
		}
	}
	
	
	//method to calculate total cost
	public double totalMaterialCost()
	{
		double totalMaterialCost = getMaterialPurchasePrice() * MARK_UP;
		return totalMaterialCost;
	}
	
	
	//method to calculate conveying fees
	@Override
	public double calculateConveyingFees() {
		double transportationCost = super.calculateTotalCost();
		if (materialVolumeInCubicFoot >= 10)
		{
			transportationCost = materialDistanceOfTransportationKM * VOLUME_RATE_OVER;
		}
		
		if (materialVolumeInCubicFoot < 10) 
		{
			transportationCost = materialDistanceOfTransportationKM * VOLUME_RATE_UNDER;
		}
		return transportationCost;
	}
	
	//method to calculateTotalCost
	public double calculateTotalCost()
	{
		double result = super.calculateTotalCost();
		result = result + ((totalMaterialCost() + calculateConveyingFees()) * SALES_TAX);
		return result;
	}
	
	
	//TO STRING OVERRIDE
	@Override
	public String toString() 
	{
		String string = super.toString();
		string = string + "Material Cost: " + totalMaterialCost()  + ", Transportation Fees: " + calculateConveyingFees();
		return string;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
