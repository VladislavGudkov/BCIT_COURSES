
/**
 * @author (Vladislav Gudkov)
 * @version (October 24 2019)
 */
public class Room
{
    //instance varuabkes
    private double lengthInFeet;
    private double widthInFeet ;

    
    /**
     * Room Constructor with no-args
     */
    public Room()
    {
        lengthInFeet = 0;
        widthInFeet  = 0;   
    }

    
    /**
     * Room Constructor
     *
     * @param inputLengthInFeet is the input for constructor Room
     * @param inputWidthInFeet  is the input for constructor Room
     */
    public Room(double inputLengthInFeet , double inputWidthInFeet )
    {
        setLengthInFeet(inputLengthInFeet);
        setWidthInFeet (inputWidthInFeet);
    }

    //accesor
    
    /**
     * Method getLengthInFeet
     * @return lengthInFeet accesor method for lengthInFeet
     */
    public double getLengthInFeet()
    {
        return lengthInFeet;
    }

    
    /**
     * Method getWidthInFeet
     * @return widthInFeet  accesor method for widthInFeet 
     */
    public double getWidthInFeet()
    {
        return widthInFeet ;
    }

    //mutators
    
    /**
     * Method setLengthInFeet
     * @param setLengthInFeet is the mutator method for lengthInFeet
     */
    public void setLengthInFeet(double inputLengthInFeet)
    {
        if (inputLengthInFeet < 0)
        {
            throw new IllegalArgumentException ("input length cannot be less than 0");
        }
        else
        {
            lengthInFeet = inputLengthInFeet ; 
        }
    }

    
     /**
     * Method setWidthInFeet 
     * @param setWidthInFeet  is the mutator method for widthInFeet 
     */
    public void setWidthInFeet (double inputWidthInFeet)
    {
        if (inputWidthInFeet < 0)
        {
            throw new IllegalArgumentException ("input length cannot be less than 0");
        }
        else
        {
            widthInFeet  = inputWidthInFeet ; 
        }
    }
    
    
    /**
     * Method calculateArea 
     * @return area which is the product of lengthInFeet  and widthInFeet 
     */
    public double calculateArea ()
    {
        double area;
        area = lengthInFeet  * widthInFeet ;  
        return area;
    }


}


