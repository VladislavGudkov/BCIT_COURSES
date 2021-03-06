 
/**
 * Write a description of class CashRegister here.
 *
 * @author (Vladislav GUdkov)
 * @version (October 24 2019)
 */




public class CashRegister
{
    // instance variables - replace the example below with your own
    public static final double TAX_RATE = 0.06;
    private RetailItem item ;
    private int quantitySold ;
    

    /**
     * Constructor for objects of class CashRegister
     */
    public CashRegister(RetailItem inputItem, int inputQuantitySold )
    {
       setItem (inputItem);
       setQuantitySold  (inputQuantitySold );
        
    }
    
    
    //accesor methods
    /**
     * Method getItem
     * @return item
     */
    public RetailItem getItem()
    {
     return item;   
    }
    
    
    /**
     * Method getQuantitySold 
     * @return quantitySold 
     */
    public int getQuantitySold ()
    {
        return quantitySold ;
    }
    
    
    //mutators
    /**
     * Method setItem
     * @param setItem is the mutator method for item
     */
    public void setItem(RetailItem inputItem)
    {
      if (inputItem != null)
      {
          item = inputItem;
        }
        else 
        {
           item = new RetailItem(); 
        }
    }
    
    /**
     * Method setQuantitySold 
     * @param setQuantitySold  is the mutator method for quantitySold 
     */
    public void setQuantitySold (int inputQuantitySold )
    {
        if (inputQuantitySold  <= item.getNumberOfUnitsInStock() && inputQuantitySold  > 0)
        {
        quantitySold  = inputQuantitySold     ;
        }
       
    }
    
    
    /**
     * Method calculateSubtotal calculates the subtotal
     * @return subTotal
     */
    public double calculateSubtotal()
    {
    double subTotal;
    
    subTotal = quantitySold  * item.getItemPriceInCAD();
    return subTotal;
    }
    
    
    
    /**
     * Method calculateTax calculates the tax amount
     * @return taxAmount
     */
    public double calculateTax()
    {
    double taxAmount;
    
    taxAmount = calculateSubtotal() * TAX_RATE;
    return taxAmount;
    }
    
    
    /**
     * Method calculateTotal calculates the total
     * @return calculateTotal
     */
    public double calculateTotal()
    {
    double calculateTotal;
    calculateTotal = calculateSubtotal() + calculateTax();
    return calculateTotal;
    }
    
    
    /**
     * Method printSalesReceipt This method prints out the item description, unit price, quantity, subtotal, tax amount, and total
     */
    public void printSalesReceipt()
    {
    System.out.println("Item Description: "+item.getItemDescription());  
    System.out.println("Unit Price: "+item.getItemPriceInCAD());  
    System.out.println("Quantity: "+quantitySold );  
    System.out.println("Subtotal: $ "+calculateSubtotal());  
    System.out.println("Tax amount: $ "+calculateTax());  
    System.out.println("Total: $ "+calculateTotal()); 
    }

   
    }
