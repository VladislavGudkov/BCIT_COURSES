
/**
 * Write a description of class StockPurchase here.
 *
 * @author (Vladislav Gudkov)
 * @version (oct 31 2019)
 */
public class StockPurchase
{
    // instance variables - replace the example below with your own
    private Stock stock ;
    private int numberOfShares ;

    /**
     * no args constructor for StockPurchase
     */
    public StockPurchase()
    {
        stock  = new Stock();
    }

    /**
     * StockPurchase Constructor
     *
     * @param inputStock is the input for setStock
     * @param inputNumberOfShares  is the input for setNumberOfShares
     */
    public StockPurchase(Stock inputStock, int inputNumberOfShares )
    {
        setStock(inputStock);  
        setNumberOfShares(inputNumberOfShares );
    }

    //Accesor
    /**
     * @param getStock is the accesor method for stock
     * @return stock
     */
    public Stock getStock()
    {
        return stock;  
    }

     /**
     * @param getNumberOfShares  is the accesor method for numberOfShares 
     * @return numberOfShares 
     */
    public int getNumberOfShares ()
    {
        return numberOfShares ;
    }

    //mutators

    /**
     * @param setStock is the mutator method for stock
     */
    public void setStock(Stock inputStock)
    {
        if(inputStock == null)
        {
            throw new IllegalArgumentException("Stock cannot be null");
        }
        stock = new Stock();
    }

    /**
     * @param setNumberOfShares is the mutator method for numberOfShares 
     */
    public void setNumberOfShares( int inputNumberOfShares)
    {
        if(inputNumberOfShares > 0 )
        {
            numberOfShares  = inputNumberOfShares;
        }
        else
        {
            throw new IllegalArgumentException("number of shares must be positive");
        }

    }

    /**
     * Method getTotalCost
     * @param getTotalCost is the method to calculate total cost by multiplying share price and number of shares
     * @return numberOfShares
     */
    public double getTotalCost() 
    {
        return numberOfShares * stock.getSharePrice ();
    }

    
    /**
     * Method displayStockDetails dispalys the stock info and total cost of shares
     */
    public void displayStockDetails() 
    {
        stock.displayStockInfo();
        System.out.println("Total Cost of shares: $" +getTotalCost());
    }

}
