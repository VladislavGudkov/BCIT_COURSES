
/**

 * @author (Vladislav Gudkov)
 * @version (November 29 2019)
 */

import java.util.ArrayList;

public class PoliceOfficer
{
    // instance variables - replace the example below with your own
    private String officerName;
    private String officerBadgeNumber ;
    private ArrayList <ParkingTicket> ticketList ;
    public static final int MINUTES_IN_HOUR  = 60;
    public static final double ONE_HOUR_FINE_AMOUNT  = 20.0;

    /**
     * Constructor for objects of class PoliceOfficer
     */
    public PoliceOfficer(String name, String badgeNumber)
    {
        setOfficerName (name);
        setOfficerBadgeNumber (badgeNumber);
        ticketList  = new ArrayList<ParkingTicket>();
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
     * method getTicketList
     * @return ticketList
     */
    public ArrayList<ParkingTicket> getTicketList(){
        return ticketList;   
    }

    //mutator metthods

    /**
     * Method setOfficerName 
     * @param inputOfficerName  is the input parameter for method setOfficerName 
     */
    private void setOfficerName  (String inputOfficerName )
    {
        if(inputOfficerName  == null)
        {
            throw new IllegalArgumentException("officer name must not be null ");
        }
        else if(inputOfficerName .isEmpty()) 
        {
            throw new IllegalArgumentException("officer name must not be an empty String "); 
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
    private void setOfficerBadgeNumber  (String inputOfficerBadgeNumber )
    {
        if(inputOfficerBadgeNumber  == null)
        {
            throw new IllegalArgumentException("badge number must not be null");
        }
        else if(inputOfficerBadgeNumber .isEmpty()) 
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

        if (parkingTimeOverlimit >= 0)
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
        // if (car.getNumberOfMinutesParked() > meter.getNumberOfPurchasedMinutes())
        //  return ((car.getNumberOfMinutesParked() - meter.getNumberOfPurchasedMinutes()) / MINUTES_IN_HOUR ) * ONE_HOUR_FINE_AMOUNT ;
        // return 0.0;
        double fine = 0;
        double hours = 0;
        if(isParkingTimeExpired(car,meter)== true){
            double expiredMinutes = car.getNumberOfMinutesParked() - meter.getNumberOfPurchasedMinutes();
            hours = expiredMinutes /MINUTES_IN_HOUR ;
            if(expiredMinutes % MINUTES_IN_HOUR  > 0){
                hours++;  
            }
        }
        fine = hours * ONE_HOUR_FINE_AMOUNT ;
        return fine;
    }

    /**
     * Method issueParkingTicket
     * @param car A parameter form class ParkedCar
     * @param meter A parameter from class ParkingMeter
     * @return null if parkingTimeOverlimit is less than 0
     */
    public void issueParkingTicket(ParkedCar car, ParkingMeter meter)
    {

        if(isParkingTimeExpired(car,meter)== true)
        {
            ParkingTicket ticket = new ParkingTicket(getOfficerName(),getOfficerBadgeNumber(),car.getLicensePlateNumber(),calculateFine(car,meter));
            ticketList .add(ticket);
        }   
    }  

    /**
     * Method sumAllfines  to get the sum of all fines for tickets in the ParkingTicket arraylist
     * @return sum
     */
    public double sumAllfines ()
    {  
        double sum = 0;
        for(ParkingTicket tickets : ticketList)
        {
            sum = sum + tickets.getFineAmountInCAD();     
        }
        return sum ;
    }

    /**
     * Method getParkingTicketsCountForACar gets the number of parking tickets for a specific car
     * @param licensePlateNumber is the input parameter for this method
     * @return count
     */
    public int getParkingTicketsCountForACar(String licensePlateNumber)
    {
        int count = 0;
        double sum = 0;
        if(licensePlateNumber != null && !licensePlateNumber.isEmpty())
        {
            for(ParkingTicket tickets : ticketList)
            {
                if(tickets.getCarLicensePlateNumber().equalsIgnoreCase(licensePlateNumber))
                {
                    count++;
                }
            }
        }
        return count;
    }

    public void getTicketArrayByLicenseNumber (String licensePlateNumber)
    {
        for(ParkingTicket tickets : ticketList)
        {
            if(tickets.getCarLicensePlateNumber().equalsIgnoreCase(licensePlateNumber))
            {
                //could not figure out how to return an Array for this method
            }
        }
    }

    /**
     * Method getSumOfFinesByCar gets the sum of all parking tickets for a specific car
     * @param licensePlateNumber is the input parameter for this method
     * @return sum
     */
    public double getSumOfFinesByCar(String licensePlateNumber)
    {
        double sum = 0;
        if(licensePlateNumber != null && !licensePlateNumber.isEmpty())
        {
            for(ParkingTicket tickets : ticketList)
            {
                if(tickets.getCarLicensePlateNumber().equalsIgnoreCase(licensePlateNumber))
                {
                    sum = sum + tickets.getFineAmountInCAD();
                }
            }
        }
        return sum;
    }

    /**
     * Method displayticketsDetails displays the ticket list details
     */
    public void displayticketsDetails()
    {
        for(ParkingTicket tickets : ticketList)
        {
            tickets.displayDetails();
        }
    }

    
}
