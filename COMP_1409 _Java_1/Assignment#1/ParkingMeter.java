
/**
 * Write a description of class ParkingMeter here.
 *
 * @author Vladislav Gudkov
 * @version October 10 2019
 */
public class ParkingMeter
{
    // instance variables - replace the example below with your own
    private String meterLocation ;
    private boolean hasACamera ;
    private double priceOfOneMinuteInCAD ;
    private int numberOfPurchasedMinutes ;
    private static int MAX_NUMBER_OF_PURCHASED_MINUTES = 180;

    /**
     * @param ParkingMeter takes the inputs of instance variables above; throws exceptions if null or less than static variables
     */
    public ParkingMeter(String inputMeterLocation, boolean inputHasACamera  , double inputPriceOfOneMinuteInCAD ,int inputNumberOfPurchasedMinutes )
    {
        if (inputMeterLocation == null)
        {
            throw new IllegalArgumentException ("meter location cannot be null");
        }
        else 
        {
            meterLocation   = inputMeterLocation;
        }

        hasACamera = inputHasACamera  ;

        if (inputPriceOfOneMinuteInCAD  < 0)
        {
            throw new IllegalArgumentException ("price of one minute should be greater than 0 ");   
        }
        else
        {
            priceOfOneMinuteInCAD  = inputPriceOfOneMinuteInCAD ;
        }

        if (inputNumberOfPurchasedMinutes  <= 0)
        {
            throw new IllegalArgumentException ("number of purchased minutes cannot be 0 or negative ");
        }
        else if (inputNumberOfPurchasedMinutes  >= MAX_NUMBER_OF_PURCHASED_MINUTES)
        {
            System.out.println("number of purchased minutes cannot be greater than 180");
            inputNumberOfPurchasedMinutes  = MAX_NUMBER_OF_PURCHASED_MINUTES;
            numberOfPurchasedMinutes  = MAX_NUMBER_OF_PURCHASED_MINUTES;

        }
    }

    //construcor methods
    /**
     * @param getMeterLocation  string to return meterLocation 
     * @return meterLocation 
     */
    public String getMeterLocation ()
    {
        return meterLocation ;
    }

    /**
     * @param getHasACamera  boolean to return hasACamera 
     * @return hasACamera 
     */
    public boolean getHasACamera  ()
    {
        return hasACamera ;
    }
    
    /**
     * @param getPriceOfOneMinuteInCAD  double to return priceOfOneMinuteInCAD 
     * @return priceOfOneMinuteInCAD 
     */
    public double getPriceOfOneMinuteInCAD  ()
    {
        return priceOfOneMinuteInCAD ;
    }
    
    /**
     * @param getNumberOfPurchasedMinutes  int to return numberOfPurchasedMinutes 
     * @return numberOfPurchasedMinutes 
     */
    public int getNumberOfPurchasedMinutes  ()
    {
        return numberOfPurchasedMinutes ;
    }

    //mutator methods
    /**
     * @param setMeterLocation , takes string input to set meterLocation , throws exception if String is null
     */
    public void setMeterLocation  (String inputMeterLocation)
    {
        if (inputMeterLocation == null)
        {
            throw new IllegalArgumentException ("meter location cannot be null");
        }
        else 
        {
            meterLocation   = inputMeterLocation;
        }
    }

    /**
     * @param setHasACamera , setter for hasACamera 
     */
    public void setHasACamera  (boolean inputHasACamera  )
    {
        hasACamera  = inputHasACamera  ;
    }

    /**
     * @param setPriceOfOneMinuteInCAD , takes double input inputPriceOfOneMinuteInCAD , throws exception if price is less than 0
     */
    public void setPriceOfOneMinuteInCAD  (double inputPriceOfOneMinuteInCAD )
    {
        if (inputPriceOfOneMinuteInCAD  > 0)
        {
            throw new IllegalArgumentException ("price of one minute should be greater than 0 ");   
        }
        else
        {
            priceOfOneMinuteInCAD  = inputPriceOfOneMinuteInCAD ;
        }  
    }

    /**
     * @param setNumberOfPurchasedMinutes . takes int input inputNumberOfPurchasedMinutes , throws exception if value is out of range
     */
    public void setNumberOfPurchasedMinutes  (int inputNumberOfPurchasedMinutes )
    {
        if (inputNumberOfPurchasedMinutes  <= MAX_NUMBER_OF_PURCHASED_MINUTES)
        {
            throw new IllegalArgumentException ("number of purchased minutes cannot be 0 or negative ");
        }
        else if (inputNumberOfPurchasedMinutes  > MAX_NUMBER_OF_PURCHASED_MINUTES)
        {
            System.out.println("number of purchased minutes cannot be greater than 180");
            inputNumberOfPurchasedMinutes  = MAX_NUMBER_OF_PURCHASED_MINUTES;
            numberOfPurchasedMinutes  = MAX_NUMBER_OF_PURCHASED_MINUTES;

        }
    }

    /**
     * @param displayDetails is a method to display the instance variables and their current set values
     */
    public void displayDetails()
    {
        System.out.println("metre location:  "+meterLocation );
        System.out.println("meter have a camera:  "+hasACamera );
        System.out.println("price of one minute in CAD:   "+priceOfOneMinuteInCAD );
        System.out.println("number of purchased minutes:  "+numberOfPurchasedMinutes );
    }

    

}

