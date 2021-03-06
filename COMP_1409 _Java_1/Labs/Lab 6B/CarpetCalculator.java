
/**
 * @author (Vladislav Gudkov)
 * @version (October 24 2019)
 */
public class CarpetCalculator
{
    // instance variables - replace the example below with your own
    private double pricePerSquareFoot ;
    private Room room;

    //constructor
    /**
     * CarpetCalculator Constructor
     * @param inputPricePerSquareFoot  is a parameter for CarpetCalculator
     * @param inputRoom is a parameter for CarpetCalculator
     */
    public CarpetCalculator(double inputPricePerSquareFoot , Room inputRoom)
    {
        setPricePerSquareFoot (inputPricePerSquareFoot );
        setRoom(inputRoom);

    }

    //accesor methods
    /**
     * Method getPricePerSquareFoot  
     * @param getPricePerSquareFoot  is the accesor method for pricePerSquareFoot 
     * @return pricePerSquareFoot 
     */
    public double getPricePerSquareFoot ()
    {
        return pricePerSquareFoot ;
    }

    /**
     * Method getRoom
     * @param getRoom is the accesor method for room
     * @return room
     */
    public Room getRoom()
    {
        return room;
    }

    //mutator methods
    /**
     * Method setPricePerSquareFoot 
     * @param setPricePerSquareFoot is the mutator method for pricePerSquareFoot 
     */
    public void setPricePerSquareFoot (double inputPricePerSquareFoot )
    {
        if (inputPricePerSquareFoot  > 0)
        {
            pricePerSquareFoot   = inputPricePerSquareFoot ;
        }
    }

    /**
     * Method setRoom
     * @param setRoom is the mutator method for room; if null it uses the no args room constructor
     */
    public void setRoom (Room inputRoom)
    {
        if (inputRoom != null)
        {
            room = inputRoom;
        }
        else 
        {
            room = new Room(); 
        }
    }

    /**
     * Method calculateTotalCost 
     * @return totalCost
     */
    public double calculateTotalCost ()
    {
        double totalCost;
        totalCost = room.getLengthInFeet() * room.getWidthInFeet() * pricePerSquareFoot ;
        return totalCost;
    }

    /**
     * Method displayTotalCost
     */
    public void displayTotalCost()
    {
    System.out.println("Length of room: "+room.getLengthInFeet());  
    System.out.println("Width of room: "+room.getWidthInFeet()); 
    System.out.println("Price per square foot of carpet: "+pricePerSquareFoot );  
    System.out.println("total cost of the carpet: "+calculateTotalCost());
    }

}
