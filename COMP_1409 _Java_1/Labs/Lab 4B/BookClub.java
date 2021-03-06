
/**
 * Write a description of class BookClub here.
 *
 * @author Vlad Gudkov
 * @version October 3 2018
 */
public class BookClub
{
    // instance variables - replace the example below with your own
    private String clientName ;
    private int numberOfPurchasedBooksPerMonth ;
    private static int totalNumberOfSoldBooks ;

    private static int BOOK_PURCHASE_TIER_1 = 3; 
    private static int BOOK_PURCHASE_TIER_2 = 7; 
    private static int BOOK_PURCHASE_TIER_3 = 10; 
    private static int BOOK_PURCHASE_TIER_4 = 11; 

    private static int BOOK_POINTS_TIER_1 = 5;
    private static int BOOK_POINTS_TIER_2 = 15;
    private static int BOOK_POINTS_TIER_3 = 30;
    private static int BOOK_POINTS_TIER_4 = 60;

    /**
     * Constructor for objects of class BookClub
     */
    public BookClub(String inputClientName,int inputNumberOfPurchasedBooksPerMonth  )
    {

        if(inputClientName == null)
        {
            throw new IllegalArgumentException ("Please enter a client name");
        }
        else
        {
            clientName  = inputClientName;
        }

        if(inputNumberOfPurchasedBooksPerMonth   <= 0)
        {
            throw new IllegalArgumentException ("number of purchased books per month cannot be equal to or less than 0");  
        }
        else 
        {
            numberOfPurchasedBooksPerMonth     = inputNumberOfPurchasedBooksPerMonth  ;
        }

    }
    //accesor methods (get)
    /**
     * @param getClientName, returns client name 
     */
    public String getClientName()
    {
        return clientName;
    }

    /**
     * @param getNumberOfPurchasedBooksPerMonth, returns numberOfPurchasedBooksPerMonth
     */
    public int getNumberOfPurchasedBooksPerMonth()
    {
        return numberOfPurchasedBooksPerMonth;
    }

    /**
     * @param getTotalNumberOfSoldBooks  returns totalNumberOfSoldBooks 
     */
    public static int getTotalNumberOfSoldBooks ()
    {
        return totalNumberOfSoldBooks ;   
    }

    //mutator methods (set)
    /**
     * @param setClientName returns clientName unless input is null, then throws argument exception
     */
    public void setClientName (String inputClientName)
    {
        if(inputClientName == null)
        {
            throw new IllegalArgumentException ("Please enter a client name");
        }
        else
        {
            clientName  = inputClientName;
        }
    }

    /**
     * @param setNumberOfPurchasedBooksPerMonth returns numberOfPurchasedBooksPerMonth  unless inputNumberOfPurchasedBooksPerMonth   was less than 0
     */
    public void setNumberOfPurchasedBooksPerMonth (int inputNumberOfPurchasedBooksPerMonth  )
    {
        if(inputNumberOfPurchasedBooksPerMonth   <= 0)
        {
            throw new IllegalArgumentException ("number of purchased books per month cannot be equal to or less than 0");  
        }
        else 
        {
            numberOfPurchasedBooksPerMonth   = inputNumberOfPurchasedBooksPerMonth  ;
        }
    }

    public int calculateBookPoints ()
    {
        int bookPoints = 0;
        if (numberOfPurchasedBooksPerMonth  < BOOK_PURCHASE_TIER_1)
        {
            bookPoints = numberOfPurchasedBooksPerMonth  *BOOK_POINTS_TIER_1;
        }

        else if (numberOfPurchasedBooksPerMonth  < BOOK_PURCHASE_TIER_2 && numberOfPurchasedBooksPerMonth  >BOOK_PURCHASE_TIER_1)
        {
            bookPoints = numberOfPurchasedBooksPerMonth  *BOOK_POINTS_TIER_2;
        }

        else if (numberOfPurchasedBooksPerMonth  < BOOK_PURCHASE_TIER_3 && numberOfPurchasedBooksPerMonth  >BOOK_PURCHASE_TIER_2)
        {
            bookPoints = numberOfPurchasedBooksPerMonth  *BOOK_POINTS_TIER_3;
        }

        else if (numberOfPurchasedBooksPerMonth  > BOOK_PURCHASE_TIER_3)
        {
            bookPoints = numberOfPurchasedBooksPerMonth  *BOOK_POINTS_TIER_4;
        }

        return bookPoints;
    
    }
}
