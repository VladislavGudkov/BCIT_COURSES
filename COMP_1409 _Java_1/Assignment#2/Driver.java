
/**
 * @author (Vladislav Gudkov)
 * @version (November 8 2019)
 */
public class Driver
{

    /**
     * Method main
     *
     * @param args A parameter of the main method
     */
    public static void main(String[] args)
    {
        ParkedCar newParkedCar = new  ParkedCar("OwnerName", "make", 2000, "license", 125);
        ParkingMeter newParkingMeter = new ParkingMeter("location",true,1,60);
        PoliceOfficer newPoliceOfficer = new PoliceOfficer("officerName","officerBadgeNumber");
        //PoliceOfficer.issueParkingTicket(this.parkedCar.getNumberOfMinutesParked(), ParkingMeter.getNumberOfPurchasedMinutes());
    }
}
