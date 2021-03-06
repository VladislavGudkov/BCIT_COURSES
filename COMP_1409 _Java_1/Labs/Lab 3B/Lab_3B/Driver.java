
/**
 * This class takes user inputs for a name, driver license number, and speed in kilometers, it outputs to
 * the console the user entered values, and returns them to the output console for the user, all entries are
 * verfied and will throw an illegal argument except if data entry is null
 * @author (Gudkov Vladislav)
 * @version (26 September 2019)
 */
public class Driver
{

    private String name;
    private String driverLicenseNumber ;
    private int speedInKilometerPerHour;
    private String driverStanding;


    public Driver(String inputName, String inputDriverLicenseNumber , int inputSpeedInKilometerPerHour )
    {
        /**
         * @param inputName takes a String input for the driver's name.
         * @param inputDriverLicenseNumber  takes a String input for the driver's license number.
         * @param inputSpeedInKilometerPerHour takes an int input of how fast the driver was driving.

         */
        if(inputSpeedInKilometerPerHour <= 0)
        {
            throw new IllegalArgumentException ("speed cannot be less than or equal 0 kilometers per hour");      
        }
        else 
        {
            speedInKilometerPerHour = inputSpeedInKilometerPerHour;
        }

        if(inputName == null)
        {
            throw new IllegalArgumentException ("name cannot be null");
        }
        else
        {
            name = inputName;
        }
        if(inputDriverLicenseNumber  == null)
        {
            throw new IllegalArgumentException ("Driver license number cannot be null");
        }
        else
        {
            driverLicenseNumber  = inputDriverLicenseNumber ;
        }

        driverStanding = "unknown";
    }
    //accesors
    /**
     * @param getName returns the current String state of what name is set to
     */
    public String getName()
    {
        return name;
    }

    /**
     * @param getDriverLicenseNumber  returns the current String state  of what driverLicenseNumber  is set to
     */
    public String getDriverLicenseNumber  ()
    {
        return driverLicenseNumber ;
    }

    /**
     * @param getSpeedInKilometerPerHour returns the current int state of what speedInKilometerPerHour is set to
     */
    public int getSpeedInKilometerPerHour()
    {
        return speedInKilometerPerHour;
    }

    /**
     * @param getDriverStanding returns the current boolean state of what driverStanding is set to
     */
    public String getDriverStanding ()
    {
        return driverStanding;
    }

    //mutators
    /**
     * @param setSpeedInKilometerPerHour is a mutator for instance variable speedInKilometerPerHour
     */
    public void setSpeedInKilometerPerHour (int inputSpeedInKilometerPerHour)
    {
        if(speedInKilometerPerHour > 0)
        {
            speedInKilometerPerHour = inputSpeedInKilometerPerHour;
        }
        else
        {
            throw new IllegalArgumentException ("speed cannot be less than or equal 0 kilometers per hour");
        }
    }

    /**
     * @param driverStanding is a mutator for instance variable speedInKilometerPerHour
     */
    public void driverStanding ()
    {
        if(speedInKilometerPerHour < 60)
        {
            driverStanding = "no ticket" ;
        }
        else if (speedInKilometerPerHour <= 80)
        {
            driverStanding = "small ticket" ;
        }
        else if (speedInKilometerPerHour > 80)
        {
            driverStanding = "big ticket" ;
        }
    }

    /**
     * @param setName is a mutator for instance variable name
     */
    public void setName(String inputName)
    {
        if(inputName == null)
        {
            throw new IllegalArgumentException ("Please enter a name");
        }
        else 
        {
            name = inputName;
        }   
    }

    /**
     * @param setDriverLicenseNumber is a mutator for instance variable driverLicenseNumber
     */
    public void setDriverLicenseNumber(String inputDriverLicenseNumber)
    {
        if(inputDriverLicenseNumber == null)
        {
            throw new IllegalArgumentException ("Please enter a driver's license numver");
        }
        else 
        {
            driverLicenseNumber = inputDriverLicenseNumber;
        }   
    }

    /**
     * @param driverDetails is the method to print out to the console the instance variables and their current set values
     */
    public void driverDetails()
    {
        System.out.println("Driver name:  :  "+name);
        System.out.println("Driver License Number:  "+driverLicenseNumber);
        System.out.println("Speed:   "+speedInKilometerPerHour + "K/H");
        System.out.println("Driver Standing:  "+driverStanding);
    }

}
