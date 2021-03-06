
/**
 * Write a description of class RetailItem here.
 *
 * @author (Vladislav Gudkov)
 * @studentID (A00921638)
 * @Class COMP 1409 Lab 2-B (Saturday Morning)
 */
public class RetailItem
{
    // instance variables - replace the example below with your own
    private String itemDescription ;
    private int itemPriceInCAD ;
    private boolean isInDemand ;
    private int numberOfUnitsInStock ;
    

    /**
     * Default constructor for objects of class RetailItem
     * @param itemDescription  is assigned a default string of "unknown"
     * @param itemPriceInCAD  is assigned a default value of 1
     * @param isInDemand is assigned a default value of false
     * @param numberOfUnitsInStock  is assigned a default value of 1
     */
    public RetailItem()
    {
    itemDescription  = "unknown";
    itemPriceInCAD  = 1;
    isInDemand = false;
    numberOfUnitsInStock =1;
    }
    
    /**
     * Constructor 2 (user input) for objects of class RetailItem
     * @param inputItemDescription takes user input string for variable itemDescription , if string is null, throws an IllegalArgumentException
     * @param inputPriceInCad takes user input int for variable itemPriceInCAD , if less than 0, throws an IllegalArgumentException
     * @param inputRetailItemDemandStatus takes user input for boolean variable isInDemand
     * @param inputUnitsInStock takes user input int for variable numberOfUnitsInStock, if less than 0, throws an IllegalArgumentException
     */
    public RetailItem(String inputItemDescription, int inputPriceInCad, boolean inputRetailItemDemandStatus, int inputUnitsInStock)
    {
    if (inputItemDescription == null)
    {
   throw new IllegalArgumentException("please enter a description of the item");
    } else {
    itemDescription  = inputItemDescription;
    }
    
    if (inputPriceInCad < 0)
    {
    throw new IllegalArgumentException("unit price cannot be less than 0");
    } else {
    itemPriceInCAD  = inputPriceInCad;
    }
    
   isInDemand = inputRetailItemDemandStatus;
   
   if (inputUnitsInStock < 0)
   {
   throw new IllegalArgumentException("quantity in stock cannot be less than 0"); 
   } else {
   numberOfUnitsInStock= inputUnitsInStock ;
   }
    }
}

public int add(int number1, int number2){
    return number1 + number2;
}
