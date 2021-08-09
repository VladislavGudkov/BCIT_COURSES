
/**
 * Class RetailItem Lab 2B solution
 * 
 * @author (Rana Alsammarraie) 
 * @version (2014-01-20)
 */
public class RetailItem
{

    private String itemDescription;
    private double itemPriceInCAD;
    private boolean isOnDemand;
    private int numberOfUnitsInStock;

    /**
     * RetailItem defaul Constructor
     *
     */
    public RetailItem(){
        itemDescription = "unknown";
        itemPriceInCAD = 0.0;
        isOnDemand = false;
        numberOfUnitsInStock = 0;
    }

    /**
     * RetailItem non-default constructor
     *
     * @param newItemDescription A parameter
     * @param newItemPriceInCAD A parameter
     * @param newIsOnDemand A parameter
     * @param newNumberOfUnitsInStock A parameter
     */
    public RetailItem(String newItemDescription, double newItemPriceInCAD,
    boolean newIsOnDemand, int newNumberOfUnitsInStock) {
        if(newItemDescription != null){
            itemDescription = newItemDescription;
        } else{
            throw new IllegalArgumentException("item description cannot be null");
        }

        if(newItemPriceInCAD >= 0){
            itemPriceInCAD = newItemPriceInCAD;
        }
        else{
            throw new IllegalArgumentException("item price cannot be negative");
        }

        isOnDemand = newIsOnDemand;
        if(newNumberOfUnitsInStock >= 0){
            numberOfUnitsInStock = newNumberOfUnitsInStock;
        }
        else{
            throw new IllegalArgumentException("number of units in stock cannot be negative");
        }
    }

    /**
     * Method getItemDescription
     *
     * @return The itemDescription value
     */
    public String getItemDescription(){
        return itemDescription;
    }

    /**
     * Method getItemPriceInCAD
     *
     * @return The itemPriceInCAD value
     */
    public double getItemPriceInCAD(){
        return itemPriceInCAD;
    }

    /**
     * Method getIsOnDemand
     *
     * @return The isOnDemand value
     */
    public boolean getIsOnDemand(){
        return isOnDemand;
    }

    /**
     * Method getNumberOfUnitsInStock
     *
     * @return The numberOfUnitsInStock value
     */
    public int getNumberOfUnitsInStock (){
        return numberOfUnitsInStock;
    }

    /**
     * Method setItemDescription
     *
     * @param description A parameter
     */
    public void setItemDescription(String description){
        if(description != null){
            itemDescription = description;
        }
        else{
            throw new IllegalArgumentException("item description cannot be null");
        }

    }
    
     /**
      * Method setItemPriceInCAD
      *
      * @param newPrice A parameter
      */
     public void setItemPriceInCAD(double newPrice){
        if(newPrice >=0){
         itemPriceInCAD = newPrice;
        }
        else{
            throw new IllegalArgumentException("item price cannot be negative");
        }
    }
    
    /**
     * Method setIsOnDemand
     *
     * @param inputDemand A parameter
     */
    public void setIsOnDemand(boolean inputDemand){
        isOnDemand = inputDemand;
    }
    
    
    /**
     * Method setNumberOfUnitsInStock
     *
     * @param unitInStock A parameter
     */
    public void setNumberOfUnitsInStock(int unitInStock){
        if(unitInStock >= 0){
            numberOfUnitsInStock = unitInStock;
        }
        else{
             throw new IllegalArgumentException("item number of units in stock cannot be negative");
        }
    }
    
    /**
     * Method displayDetails
     *
     */
    public void displayDetails(){
        System.out.println(" Unit Description "+ itemDescription);
        System.out.println(" Unit Price In CAD "+ itemPriceInCAD);
        System.out.println(" Is On Demand "+ isOnDemand);
        System.out.println("Number Of Units IN Stock "+ numberOfUnitsInStock);
    }
}
    
    
    
