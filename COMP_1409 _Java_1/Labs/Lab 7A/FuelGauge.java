
/**
 * @author (Vladislav Gudkov)
 * @version (Oct 31 2019)
 */
public class FuelGauge
{
    // instance variables - replace the example below with your own
    private int amoutOfFuelInLitres ;
    private  static final int MAX_AMOUNT_OF_FUEL_IN_LITRES = 15;
    private static final int FUEL_COUNTER = 1;

    /**
     * No args constructor for FuelGauge 
     */
    public FuelGauge()
    {
        amoutOfFuelInLitres  = 0;   
    }

    /**
     * FuelGauge Constructor
     * @param inputAmoutOfFuelInLitres  the parameter for this constructor
     */
    public FuelGauge(int inputAmoutOfFuelInLitres )
    {
        setAmountOfFuelInLitres(inputAmoutOfFuelInLitres );
    }

    /**
     * Method getAmoutOfFuelInLitres  accesor method for amoutOfFuelInLitres 
     * @return amoutOfFuelInLitres 
     */
    public  int getAmoutOfFuelInLitres ()
    {
        return amoutOfFuelInLitres ;
    }

    /**
     * Method setAmountOfFuelInLitres
     * @param inputAmoutOfFuelInLitres  the parameter used for the mutator method setAmountOfFuelInLitres
     */
    public void setAmountOfFuelInLitres(int inputAmoutOfFuelInLitres )
    {
        if (inputAmoutOfFuelInLitres  >= 0 && inputAmoutOfFuelInLitres  <= MAX_AMOUNT_OF_FUEL_IN_LITRES)
        {
            amoutOfFuelInLitres  = inputAmoutOfFuelInLitres ;
        }
        else 
        {
            throw new IllegalArgumentException("Fuel in litres must be greater than or equal to 0 AND less than or equal to 15");
        }
    }

    /**
     * Method useFuel 
     *This method decrements the fuel in litres by a counter of 1; if it reaches 0 , an empty tank message is displayed
     */
    public void  useFuel ()
    {
        if(amoutOfFuelInLitres  <= 0)
        {
            System.out.println("the tank is empty the fuel cannot go below 0 ");
        }
        else
        {
            amoutOfFuelInLitres  = amoutOfFuelInLitres  - FUEL_COUNTER;
        }
    }

    /**
     * Method useFuel 
     *This method increments the fuel in litres by a counter of 1; if it goes above 15 , a full tank message is displayed
     */
    public void addFuel ()
    {
        if(amoutOfFuelInLitres  >= MAX_AMOUNT_OF_FUEL_IN_LITRES )
        {
            System.out.println("tank is full  ");
        }
        else
        {
            amoutOfFuelInLitres  = amoutOfFuelInLitres  + FUEL_COUNTER;
        }
    }

}
