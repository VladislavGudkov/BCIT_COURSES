
/**

 * @author (Vladislav Gudkov)
 * @version (November 8 2019)
 */
public class PoliceOfficer
{
    // instance variables - replace the example below with your own
    private String officerName;
    private String officerBadgeNumber ;

    public static final int MINUTES_IN_HOUR  = 60;
    public static final double ONE_HOUR_FINE_AMOUNT  = 20.0;

    /**
     * Constructor for objects of class PoliceOfficer
     */
    public PoliceOfficer(String name, String badgeNumber)
    {
        setOfficerName (name);
        setOfficerBadgeNumber (badgeNumber);
    }

    //accesor methods
    /**
     * Method getOfficerName 
     * @return officerName
     */
    public String getOfficerName ()
    {
        return officerName;
    }

    /**
     * Method getOfficerBadgeNumber 
     * @return officerBadgeNumber 
     */
    public String getOfficerBadgeNumber ()
    {
        return officerBadgeNumber ;
    }

    /**
     * Method setOfficerName 
     * @param inputOfficerName  is the input parameter for method setOfficerName 
     */
    public void setOfficerName  (String inputOfficerName )
    {
        if(inputOfficerName  == null)
        {
            throw new IllegalArgumentException("officer name must not be null");
        }
        else if(inputOfficerName .isEmpty()) 
        {
            throw new IllegalArgumentException("officer name must not be an empty String"); 
        }
        else
        {
            officerName =  inputOfficerName ;
        }
    }

    /**
     * Method setOfficerBadgeNumber 
     * @param inputOfficerBadgeNumber  is the input parameter for method setOfficerBadgeNumber 
     */
    public void setOfficerBadgeNumber  (String inputOfficerBadgeNumber )
    {
        if(inputOfficerBadgeNumber  == null)
        {
            throw new IllegalArgumentException("badge number must not be null");
        }
        if(inputOfficerBadgeNumber .isEmpty()) 
        {
            throw new IllegalArgumentException("badge number must not be an empty String "); 
        }
        else
        {
            officerBadgeNumber  =  inputOfficerBadgeNumber ;
        }
    }

    /**
     * Method isParkingTimeExpired
     * @param car A parameter form class ParkedCar
     * @param meter A parameter from class ParkingMeter
     * @return true if parkingTimeOverlimit is greater than or equal to 0
     * @return false if parkingTimeOverlimit is less than 0
     */
    private boolean isParkingTimeExpired(ParkedCar car, ParkingMeter meter)   
    {
        int parkingTimeOverlimit;
        parkingTimeOverlimit = car.getNumberOfMinutesParked() - meter.getNumberOfPurchasedMinutes();

        if (parkingTimeOverlimit > 0)
        {
            return true;
        }
        else
        {
            return false; 
        }    
    }

    /**
     * Method calculateFine
     * @param car A parameter form class ParkedCar
     * @param meter A parameter from class ParkingMeter
     * @return The calculated fine which is the parkingTimeOverlimit divided by 60 multiplied by the one hour fine amount
     */
    private double calculateFine(ParkedCar car, ParkingMeter meter)
    {
        if (car.getNumberOfMinutesParked() > meter.getNumberOfPurchasedMinutes()){
            return ((car.getNumberOfMinutesParked() - meter.getNumberOfPurchasedMinutes()) / MINUTES_IN_HOUR ) * ONE_HOUR_FINE_AMOUNT ;

        }
        return 0.0;
    }

    /**
     * Method issueParkingTicket
     * @param car A parameter form class ParkedCar
     * @param meter A parameter from class ParkingMeter
     * @return null if parkingTimeOverlimit is less than 0
     */
    public ParkingTicket issueParkingTicket(ParkedCar car, ParkingMeter meter)
    {

        if (car.getNumberOfMinutesParked() > meter.getNumberOfPurchasedMinutes())
        {
          ParkingTicket ticket = new ParkingTicket("Bob Smith", "RCMP2251", "1A2B3C", 150.0);
           ticket.displayDetails();
           return ticket;
        }
        return null; 
    } 
}
