/**
 * @author (Vladislav Gudkov)
 * @version (November 29 2019)
 */

import java.util.ArrayList;

public class PoliceDepartment
{
    // instance variables
    private String address;
    private ArrayList<PoliceOfficer> officersList;

    /**
     * Constructor for objects of class PoliceDepartment
     */
    public PoliceDepartment(String address)
    {
        officersList = new ArrayList<PoliceOfficer>();
        setAddress(address);
    }

    //accesor methods
    /**
     * Method getOfficerList
     * @return officersList
     */
    public ArrayList<PoliceOfficer> getOfficerList()
    {
        return officersList;
    }

    /**
     * Method getAddress
     * @return address
     */
    public String getAddress()
    {
        return address;
    }

    //mutators
    /**
     * Method setAddress
     * @param newAddress is the input parameter for setAddress
     */
    public void setAddress(String inputAddress)
    {
        if(inputAddress != null)
        {
            address = inputAddress;
        }
        else
        {
            throw new IllegalArgumentException("address cannot be null");
        }
        if(!inputAddress.isEmpty())
        {
            address = inputAddress;
        }
        else
        {
            throw new IllegalArgumentException("address cannot be an empty String");
        }
    }

    /**
     * Method addPoliceOfficer
     * @param officer is the input paramter, it adds it to the arraylist if officer is not null
     */
    public void addPoliceOfficer(PoliceOfficer officer)
    {
        if(officer != null)
        {
            officersList.add(officer);
        }
    }

    /**
     * Method displayTicketsByOfficer will display the tickets issued by a specific officer
     * @param officerName is the input paremeter
     */
    public void displayTicketsByOfficer(String officerName)
    {
        if(officerName != null)
        {
            for(PoliceOfficer policeOfficer: officersList)
            {
                if(policeOfficer.getOfficerName().equalsIgnoreCase(officerName))
                {
                    System.out.println(policeOfficer.getTicketList());
                }
            }
        }
    }

    /**
     * Method calculateSumOfAllTicketsOfAllOfficers will calculate and return the sum of all tickets issued by all officers in the arraylist
     * @return sum
     */
    public double calculateSumOfAllTicketsOfAllOfficers()
    {
        int sum = 0;
        //officersList.sumAllFines();
        for(PoliceOfficer policeOfficer : officersList)
        {
            // sum = sum + PoliceOfficer.sumAllfines ();
        }
        return sum;
    }

    public void deleteTicketsByCarLicense(String licensePlateNumber)
    {

    }

    /**
     * Method totalParkingTicketCountOfACar will return the number of parking tickets associated with a specific license plater number
     * @param licensePlateNumber is an input parameter for this method
     * @return counter
     */
    public int totalParkingTicketCountOfACar(String licensePlateNumber)
    {
        int counter = 0;
        if(licensePlateNumber != null && !licensePlateNumber.isEmpty())
        {
            for(PoliceOfficer policeofficer: officersList)
            {
                //if(ParkingTicket.getCarLicensePlateNumber().equalsIgnoreCase(licensePlateNumber))
                {
                    counter ++;
                }
            }
        }
        return counter;
    }



}
