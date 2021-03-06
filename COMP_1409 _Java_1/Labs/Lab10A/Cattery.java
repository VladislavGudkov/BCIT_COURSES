
/**
 * @author (Vladislav Gudkov)
 * @version (Nov 21 2019)
 */
import java.util.ArrayList;

public class Cattery
{
    // instance variables
    private ArrayList <Cat> cats;
    private String nameOfBusiness;

    /**
     * Constructor for objects of class Cattery
     */
    public Cattery(String nameOfBusiness)
    {
        setNameOfBusiness(nameOfBusiness);
        cats = new ArrayList<Cat>();
    }


    /**
     * Method getNameOfBusiness is the getter method for nameOfBusiness
     * @return nameOfBusiness
     */
    public String getNameOfBusiness()
    {
        return nameOfBusiness;
    }

    /**
     * Method setNameOfBusiness is the setter method for nameOfBusiness
     * @param inputNameOfBusiness is the input parameter for the setter method of setNameOfBusiness
     */
    public void setNameOfBusiness(String inputNameOfBusiness)
    {
       
        if (inputNameOfBusiness == null || inputNameOfBusiness.equals(""))
        {
            System.out.println("Please a String that is not null or not empty");
        }
        else 
        {
            nameOfBusiness = inputNameOfBusiness;  
        } 
    }

    /**
     * Method addCat
     * @param newCat A parameter to add a new cat to the arraylist cats
     */
    public void addCat(Cat newCat)
    {
        if(newCat != null)
        {
            cats.add(newCat);
            System.out.println( "added "+newCat.getName() + "  to arraylist");
        } 
        else
        {
            System.out.println("Invalid object added, add a valid cat input");
        }
    }  

    /**
     * Method getCats
     * @param index gets the indexes of a cat object in cats arraylist
     */
    public void getCats(int index){
        if(index >=0 && index < cats.size())
        {
            System.out.println("Object at index " +index + " details:");
            cats.get(index).displayDetails();
        } else 
        {
            System.out.println("Please enter an index value from 0 to " + (cats.size()-1));
        }
    }

    /**
     * Method removeCat
     * @param index removes the indexes of a cat object in cats arraylist
     */
    public void removeCat(int index)
    {
        if(index >= 0 && index < cats.size()) {
            cats.remove(index);
            System.out.println("Object at index " +index + " removed from arraylist");
        } else {
            System.out.println("Please enter an index value from 0 to " + (cats.size()-1));
        }

    }

    /**
     * Method displayAllCats
     *This method displays all cats in the arraylist cats
     */
    public void displayAllCats() 
    {
        System.out.println("The current guests in Puss in Boots Cattery:");
        for(Cat currentCat: cats) 
        {
            System.out.println(currentCat.getName());
        }
    }

    /**
     * Method main method
     * @param args A parameter of the main method
     * This method creates 3 new cat objects, add them to the newCattery arraylist, gets the indexes of 2,4 in that arraylist
     * then dispalys all cats, removes indexes 2,4 and then displays all cats again
     */
    public static void main(String args[])
    {
        Cat cat1 = new Cat("Garfield", 2015, 12);
        Cat cat2 = new Cat("Furball", 2017, 10);
        Cat cat3 = new Cat("Grover ", 2019, 9);
        
        Cattery newCattery = new Cattery("Puss In Boots");
        
        newCattery.addCat(cat1);        
        newCattery.addCat(cat2);        
        newCattery.addCat(cat3);
        
        newCattery.getCats(4);      
        newCattery.getCats(2);        
        
        newCattery.displayAllCats();    
        
        newCattery.removeCat(4);      
        newCattery.removeCat(2);        
        
        newCattery.displayAllCats();  
    }

    
}
