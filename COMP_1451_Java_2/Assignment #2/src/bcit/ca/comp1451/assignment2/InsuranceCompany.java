package bcit.ca.comp1451.assignment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InsuranceCompany
{

	//instance variables
	private String companyName;
	private ArrayList<ProjectInvoice> list;
	
	//Symbolic constants
	private static double LABOUR_INSURANCE = 0.05;
	private static double LABOUR_MATERIAL_INSURANCE = 0.07;
	private static double LABOUR_MATERIAL_EQUIPMENT_INSURANCE = 0.1;
	
	//constructor for class InsuranceCompany
	public InsuranceCompany(String companyName) 
	{
		setCompanyName(companyName);
		list = new ArrayList<ProjectInvoice>();
	}

	//get method for companyName
	public String getCompanyName()
	{
		return companyName;
	}

	//set method for companyName
	public void setCompanyName(String companyName)
	{
		if (companyName != null && !companyName.isEmpty()) 
		{
			this.companyName = companyName;
		} 
		else 
		{
			throw new IllegalArgumentException ("Name cannot be null or an empty string");
		}
	}
	
	//method to add project invoice object 
	public void addInvoice(ProjectInvoice object) 
	{
		if (object != null) {
			list.add(object);
		}
	}
	
	//method to display project invoice on invoice number

	public void displayProjectInvoice(String invoiceNumber) throws InvalidInvoiceNumberException 
	{
		if (invoiceNumber != null && !invoiceNumber.isEmpty() && (invoiceNumber.length() == 7) )
		{
			String invoiceNumFormatted = invoiceNumber.toUpperCase();
			
			for (ProjectInvoice item: list) 
			{
				if (item.getInvoiceNumber().equals(invoiceNumFormatted)) 
				{
					System.out.print(item.toString());
				}
			} 
		}
		else
		{
			throw new InvalidInvoiceNumberException("The value provide is incorrect");
		}
	}
	
	//method to calculate total insurance fees

	public double calculateTotalInsuranceFees() 
	{
		double result = 0.0;
		for (ProjectInvoice item: list) 
		{
			if (item instanceof Labour)
			{
				result = (item.calculateTotalCost() * LABOUR_INSURANCE );
			} 
			else if (item instanceof LabourAndMaterial) 
			{
				result = (item.calculateTotalCost() * LABOUR_MATERIAL_INSURANCE);
			}
			else if (item instanceof LabourAndMaterialAndEquipment) 
			{
				result = (item.calculateTotalCost() * LABOUR_MATERIAL_EQUIPMENT_INSURANCE);
			}
		} 
		return result;
	}
	
	//method to display sorted invoice projects

	public void displaySortedProjectInvoices() 
	{
		
		
		for (ProjectInvoice item: list) 
		{
			item.compareTo(item);
			System.out.println("======================");
			if (item instanceof Labour) 
			{
				System.out.println(item.toString());
				System.out.println("Total Cost including 5% tax : " + item.calculateTotalCost());
			}
			else if (item instanceof LabourAndMaterial) 
			{
				System.out.println(item.toString());
				System.out.println("Total Cost including 7% tax : " + item.calculateTotalCost());
			} 
			else if (item instanceof LabourAndMaterialAndEquipment)
			{
				System.out.println(item.toString());
				System.out.println("Total Cost including 10% tax : " + item.calculateTotalCost());
			}
			System.out.println("======================");
		}
		list.toString();
	}

	
	
	
	
	
}
