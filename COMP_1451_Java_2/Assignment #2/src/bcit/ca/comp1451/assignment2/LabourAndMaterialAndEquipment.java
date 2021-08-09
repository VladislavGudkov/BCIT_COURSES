package bcit.ca.comp1451.assignment2;

public class LabourAndMaterialAndEquipment extends LabourAndMaterial implements Transferable 
{

	//instance variables
	private double equipmentValueCAD;
	private int numberOfRentedHours;
	
	//symbolic constants
	private static final double RATE = 0.05; 
	private static final double EQUIPMENT_FEE = 0.02;
	
	//constructor for class LabourAndMaterialAndEquipment
	public LabourAndMaterialAndEquipment(String projectName, int numOfWorkingHours, double hourlyRate,
			int distanceOfTransportationKM, String hourlyRateCriteria, String typeOfLabour) 
	{
		super(projectName, numOfWorkingHours, hourlyRate, distanceOfTransportationKM, hourlyRateCriteria, typeOfLabour);
		setEquipmentValueCAD(equipmentValueCAD);
		setNumberOfRentedHours(numberOfRentedHours);
	}

	//get method for equipmentValueCAD
	public double getEquipmentValueCAD()
	{
		return equipmentValueCAD;
	}

	//set method for equipmentValueCAD
	public void setEquipmentValueCAD(double equipmentValueCAD)
	{
		if (equipmentValueCAD > 0) 
		{
			this.equipmentValueCAD = equipmentValueCAD;
		}
		else
		{
			throw new IllegalArgumentException("equipment value cannot be less than 0");
		}
	}

	// get method for numberOfRentedHours
	public int getNumberOfRentedHours()
	{
		return numberOfRentedHours;
	}

	//set method for numberOfRentedHours
	public void setNumberOfRentedHours(int numberOfRentedHours)
	{
		if (numberOfRentedHours > 0) 
		{
			this.numberOfRentedHours = numberOfRentedHours;
		}
		else
		{
			throw new IllegalArgumentException("number of rented hours cannot be less than 0");
		}
	}
	
	//method to calculate rental fees
	public double calculateTotalRentalFees()
	{
		double ratePerHour = RATE * equipmentValueCAD;
		return getNumberOfRentedHours() * ratePerHour;
	}
	
	//method to calculate training fees
	public double trainingFees()
	{
		double trainingFee = 0.0;
		String laborType = getTypeOfLabour();
		
		if (laborType == "inexperienced")
		{
			trainingFee = (equipmentValueCAD * EQUIPMENT_FEE);
			return trainingFee;
		}
		return trainingFee;
	}
	
	
	//override method total cost
	@Override
	public double calculateTotalCost() 
	{
		trainingFees();
		double result = super.calculateTotalCost();
		result = (trainingFees() + getEquipmentValueCAD() + (result * RATE));
		return result;
	}

	
	//override to string
	@Override
	public String toString() 
	{
		String string = super.toString();
		string = string  + "Equipment rented (hours): " + getNumberOfRentedHours()  + ",Equipment Rental Fees: " + getEquipmentValueCAD()  + "Training Fees: " + trainingFees();
		return string;
	}
	
	


}
