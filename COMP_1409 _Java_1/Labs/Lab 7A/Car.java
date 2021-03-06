
/**

 * @author (Vladislav Gudkov)
 * @version (oct 31 2019)
 */
public class Car
{
    // instance variables - replace the example below with your own
    private String carMake ;
    private String carColour ;
    private FuelGauge fuelGauge;

    /**
     * Constructor for objects of class Car
     */
    public Car(String  inputMake, String inputColour, int fuelAmount )
    {
        setCarColour  (inputColour);
        setCarMake (inputMake);
        setFuelGauge(new FuelGauge(fuelAmount ));
    }

    /**
     * Car Constructor no arfs
     *@param fuelGauge creates a new object from the default constructor of FuelGauge
     */ 
    public Car()
    {
        carMake  = ("unknown"); 
        carColour  = ("unknown"); 
        fuelGauge = new FuelGauge();
    }

    //accesor methods
    /**
     * @param getCarMake  is the accesor method for carMake 
     */
    public String getCarMake ()
    {
        return carMake ;
    }

    /**
     * @param getCarColour  is the accesor method for car
     */
    public String getCarColour ()
    {
        return carColour ;
    }

    /**
     * @param getFuelGauge is the accesor method for fuelGauge
     */
    public FuelGauge getFuelGauge()
    {
        return fuelGauge;
    }

    //mutator methods
    /**
     * @param setCarMake  is the mutator method for carMake 
     */
    public void setCarMake (String inputMake)
    {
        if (inputMake == null)
        {
            throw new IllegalArgumentException("Car make cannot be null");
        }
        else
        {
            carMake    = inputMake;
        }
    }

    /**
     * @param setCarColour    is the mutator method for carColour 
     */
    public void setCarColour  (String inputColour)
    {
        if (inputColour == null)
        {
            throw new IllegalArgumentException("Car color cannot be null");
        }
        else
        {
            carColour    = inputColour;
        }
    }

    /**
     * @param setFuelGauge is the mutator method for fuelGauge
     */
    public void setFuelGauge(FuelGauge inputFuelGauge)
    {
        if ( inputFuelGauge == null)
        {
            throw new IllegalArgumentException("Fuel gauge cannot be null");
        }
        else 
        {
            fuelGauge = inputFuelGauge;

        }
    }

    /**
     * Method drive decrements the fuel by a counter of 1
     */
    public void drive() 
    {
        fuelGauge.useFuel();
    }

    /**
     * Method drive increments the fuel by a counter of 1
     */
    public void fillTank() 
    {
        fuelGauge.addFuel();
    }

}
