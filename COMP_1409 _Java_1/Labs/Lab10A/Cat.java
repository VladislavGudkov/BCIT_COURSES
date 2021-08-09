
/**
 * @author (Vladislav Gudkov)
 * @version (November 18 2019)
 */
public class Cat
{
    // instance variables - replace the example below with your own
    private String catName;
    private int yearOfBirth;
    private int weightInKilos;

    /**
     * Constructor for objects of class Cat
     */
    public Cat(String name, int yearOfBirth, int weightInKilos)
    {
        setName(name);
        setYetYearOfBirth(yearOfBirth);
        setWeightInKilos(weightInKilos);

    }

    /**
     * Method getName is the get method for catName
     * @return catName
     */
    public String getName()
    {
        return catName;
    }

    /**
     * Method getYearOfBirth is the get method for yearOfBirth
     * @return yearOfBirth
     */
    public int getYearOfBirth()
    {
        return yearOfBirth; 
    }

    /**
     * Method getWeightInKilos is the get method for weightInKilos
     * @return weightInKilos
     */
    public int getWeightInKilos()
    {
        return weightInKilos; 
    }

    /**
     * Method setName
     * @param inputName is the input for the setter method for catName
     */
    public void setName(String inputName)
    {
        if(inputName != null && !inputName.equals(""))
        {
            catName = inputName;
        } 
        else if (inputName == null || inputName.equals(""))
        {
            throw new IllegalArgumentException("name cannot be null or an empty String"); 
        }
    }

    /**
     * Method setYetYearOfBirth
     * @param inputYearOfBirth is the input for the setter method for yearOfBirth
     */
    public void setYetYearOfBirth(int inputYearOfBirth)
    {
        if(inputYearOfBirth < 0)
        {
            throw new IllegalArgumentException("Year of birth cannot be negative");   
        }
        else
        {
            yearOfBirth = inputYearOfBirth;
        }
    }

    /**
     * Method setWeightInKilos
     * @param inputWeightInKilos is the input for the setter method for weightInKilos
     */
    public void setWeightInKilos(int inputWeightInKilos)
    {
        if(inputWeightInKilos < 0)
        {
            throw new IllegalArgumentException("Weight in kilos cannot be negative");   
        }
        else
        {
            weightInKilos =   inputWeightInKilos;
        }
    }

    /**
     * Method displayDetails displays the cat name, year of birth, and weight of the cat
     */
    public void displayDetails()
    {
        System.out.println(" cat name is "+ catName);
        System.out.println(" cat birth year is "+ yearOfBirth);
        System.out.println(" cat weight is "+ weightInKilos);
    }

}
