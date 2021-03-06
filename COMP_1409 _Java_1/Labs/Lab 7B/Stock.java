
/**
 * Write a description of class Stock here.
 *
 * @author (Vladislav Gudkov)
 * @version (oct 31 2019)
 */
public class Stock
{
    // instance variables - replace the example below with your own
    private String stockSymbol ;
    private double sharePrice ;

    /**
     * Constructor for objects of class Stock
     * @param inputStockSymbol is the input for setStockSymbol 
     * @param inputSharePrice   is the input for setSharePrice 
     */
    public Stock(String inputStockSymbol, double inputSharePrice  )
    {
     setStockSymbol (inputStockSymbol);
     setSharePrice (inputSharePrice  );
    }

    /**
     * No args constructor for class  Stock
     */
    public Stock()
    {
        sharePrice  = 0.0;
        stockSymbol  =("unknown ");
    }

    //accesor
    /**
     * @param getStockSymbol  is the accesor method for stockSymbol 
     * @return stockSymbol 
     */
    public String getStockSymbol ()
    {
        return stockSymbol ;
    }

    /**
     * @param getSharePrice  is the accesor method for sharePrice 
     * @return sharePrice 
     */
    public double getSharePrice ()
    {
        return sharePrice ;
    }

    //mutators
    /**
     * @param setStockSymbol  is the mutator method for stockSymbol 
     */
    public void setStockSymbol  (String inputStockSymbol )
    {
        if(inputStockSymbol  == null)
        {
            throw new IllegalArgumentException("stockSymbol cannot be null");
        }
        else
        {
            stockSymbol  = inputStockSymbol ;
        }
    }
    
    /**
     * @param setSharePrice  is the mutator method for sharePrice 
     */
    public void setSharePrice  (double inputSharePrice )
    {
        if(inputSharePrice   <= 0)
        {
            throw new IllegalArgumentException("sharePrice  must be a positive value");
        }
        else
        {
            sharePrice  = inputSharePrice  ;
        }
    }
    
    
    /**
     * Method displayStockInfo displays the Stock symbol and share price
     */
    public void displayStockInfo() 
    {
        System.out.println("Stock Symbol: " +stockSymbol);
        System.out.println("Share Price: $" +sharePrice);
    }
    
    

    
}
