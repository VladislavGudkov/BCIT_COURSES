package bcit.ca.comp1451.assignment2;

import java.util.Scanner;

public class Driver 
{
	private static Scanner input;

	
	//main method 
	public static void main(String[] args) 
	{
		input = new Scanner(System.in);
		InsuranceCompany insuranceCompany = new InsuranceCompany("Insurance Co");

		Labour labour1 = new Labour("first labour project", 100, 25.0, 20, "regular", "experienced");
		Labour labour2 = new Labour("second labour project", 60, 20.0, 40, "holiday", "inexperienced");
		
		LabourAndMaterial labourMaterial1 = new LabourAndMaterial("first labour and material project", 60, 20.0, 10, "regular", "experienced");
		LabourAndMaterial labourMaterial2 = new LabourAndMaterial("second labour and material project", 40, 20.0, 24, "holiday", "inexperienced");
		labourMaterial1.setMaterialPurchasePrice(500);
		labourMaterial1.setMaterialDistanceOfTransportationKM(55.0);
		labourMaterial2.setMaterialPurchasePrice(500);
		labourMaterial2.setMaterialDistanceOfTransportationKM(65.5);
		
		
		LabourAndMaterialAndEquipment labourMaterialEquipment1 = new LabourAndMaterialAndEquipment("first labour and material and equipment project", 80, 20.0, 44, "regular", "experienced");
		LabourAndMaterialAndEquipment labourMaterialEquipment2 = new LabourAndMaterialAndEquipment("second labour and material and equipment project", 80, 20.0, 24, "over time", "inexperienced");
		labourMaterialEquipment1.setMaterialPurchasePrice(500);
		labourMaterialEquipment1.setMaterialDistanceOfTransportationKM(50);
		labourMaterialEquipment1.setNumberOfRentedHours(20);
		labourMaterialEquipment1.setEquipmentValueCAD(5000);
		
		labourMaterialEquipment2.setMaterialPurchasePrice(500);
		labourMaterialEquipment2.setMaterialDistanceOfTransportationKM(33.5);
		labourMaterialEquipment2.setNumberOfRentedHours(20);
		labourMaterialEquipment2.setEquipmentValueCAD(5000);


		
		insuranceCompany.addInvoice(labour1);
		insuranceCompany.addInvoice(labour2);
		insuranceCompany.addInvoice(labourMaterial1);
		insuranceCompany.addInvoice(labourMaterial2);
		insuranceCompany.addInvoice(labourMaterialEquipment1);
		insuranceCompany.addInvoice(labourMaterialEquipment2);	
		
		/* insuranceCompany.displaySortedProjectInvoices(); */
	}
	}
