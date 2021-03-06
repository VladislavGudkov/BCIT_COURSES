
/**
 * @author Vladislav Gudkov (A00921638)
 * @version October 6 2019
 */
public class ParkedCar
{
    // instance variables - replace the example below with your own
    private String ownerName ;
    private String carMake ;
    private String licensePlateNumber ;
    private int modelYear ;
    private int numberOfMinutesParked ;

    //Static variables were set to public in order to allow test class to access them

    public static final int CAR_MODEL_YEAR_LOWER_LIMIT = 1900;
    public static final int CURRENT_YEAR = 2019;

    //Constructor
    /**
     * @param ParkedCar takes the String inputs of owner name, car make, license plate number,  and int inputs model year, numberOfMinutesParked ,
     * an exception is thrown if any String input is null, or if any int input is not in range
     */
    public ParkedCar(String inputOwnerName, String inputCarMake, int inputModelYear,String inputLicensePlateNumber , int inputNumberOfMinutesParked )
    {
        if (inputOwnerName == null)
        {
            throw new IllegalArgumentException("Owner name cannot be null");
        }
        else 
        {
            ownerName   = inputOwnerName;
        }

        if (inputCarMake == null)
        {
            throw new IllegalArgumentException("Car make cannot be null");
        }
        else 
        {
            carMake   = inputCarMake;
        }

        if (inputLicensePlateNumber  == null)
        {
            throw new IllegalArgumentException("Car license plate number cannot be null ");
        }
        else 
        {
            licensePlateNumber    = inputLicensePlateNumber ;
        }

        if (inputModelYear < CAR_MODEL_YEAR_LOWER_LIMIT )
        {
            throw new IllegalArgumentException("year model cannot be earlier than 1900");
        }
        else if (inputModelYear > CURRENT_YEAR)
        {
            throw new IllegalArgumentException("year model cannot be later than 2019 ");
        }

        else
        {
            modelYear = inputModelYear;
        }

        if (inputNumberOfMinutesParked  <= 0)
        {
            throw new IllegalArgumentException("minutes parked should be greater than 0");
        }
        else
        {
            numberOfMinutesParked  = inputNumberOfMinutesParked ;
        }

    }

    //accesor Methods
    /**
     * @param getOwnerName  accesor method for owner name
     * @return ownerName 
     */
    public String getOwnerName ()
    {
        return ownerName ;
    }

    /**
     * @param getCarMake  accesor method for car make
     * @return carMake
     */
    public String getCarMake ()
    {
        return carMake;  
    }

    /**
     * @param getLicensePlateNumber  accesor nethod for license plate number
     * @return licensePlateNumber 
     */
    public String getLicensePlateNumber ()
    {
        return licensePlateNumber ;
    }

    /**
     * @param getModelYear  accesor method for model year
     * @return modelYear 
     */
    public int getModelYear ()
    {
        return modelYear ;
    }

    /**
     * @param getNumberOfMinutesParked  accesor method for number of minutes parked
     * @return numberOfMinutesParked 
     */
    public int getNumberOfMinutesParked ()
    {
        return numberOfMinutesParked ;
    }

    //mutator methods
    /**
     * @param setOwnerName  is the mutator method for ownerName
     */
    public void setOwnerName (String inputOwnerName)
    {
        if (inputOwnerName == null)
        {
            throw new IllegalArgumentException("Owner name cannot be null");
        }
        else 
        {
            ownerName   = inputOwnerName;
        }
    }

    /**
     * @param setCarMake  is the mutator method for carMake
     */
    public void setCarMake  (String inputCarMake)
    {
        if (inputCarMake == null)
        {
            throw new IllegalArgumentException("Car make cannot be null");
        }
        else 
        {
            carMake   = inputCarMake;
        }
    }

    /**
     * @param setLicensePlateNumber  is the mutator method for licensePlateNumber 
     */
    public void setLicensePlateNumber  (String inputLicensePlateNumber )
    {
        if (inputLicensePlateNumber  == null)
        {
            throw new IllegalArgumentException("Car license plate number cannot be null ");
        }
        else 
        {
            licensePlateNumber    = inputLicensePlateNumber ;
        }  
    }

    /**
     * @param setModelYear  is the mutator method for modelYear
     */
    public void setModelYear  (int inputModelYear )
    {
        if (inputModelYear < CAR_MODEL_YEAR_LOWER_LIMIT )
        {
            throw new IllegalArgumentException("year model cannot be earlier than 1900");
        }
        else if (inputModelYear > CURRENT_YEAR)
        {
            throw new IllegalArgumentException("year model cannot be later than 2019 ");
        }

        else
        {
            modelYear = inputModelYear;
        } 
    }

    /**
     * @param setNumberOfMinutesParked  is the mutator method for numberOfMinutesParked 
     */
    public void setNumberOfMinutesParked  (int inputNumberOfMinutesParked )
    {
        if (inputNumberOfMinutesParked  <= 0)
        {
            throw new IllegalArgumentException("minutes parked should be greater than 0");
        }
        else
        {
            numberOfMinutesParked  = inputNumberOfMinutesParked ;
        }  
    }

    /**
     * @param displayDetails is the method that displays the details of the ParkedCar  object
     */
    public void displayDetails()
    {
        System.out.println("Owner name:  "+ownerName);
        System.out.println("Car make: "+carMake );
        System.out.println("Car model year:  "+modelYear );
        System.out.println("Car license Plate number:  "+licensePlateNumber );
        System.out.println("Number of minutes parked:   "+numberOfMinutesParked );

    }

   
}

