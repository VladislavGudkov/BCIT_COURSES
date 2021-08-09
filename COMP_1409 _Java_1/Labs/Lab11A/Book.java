
/**

 * @author (Vladislav Gudkov)
 * @version (Nov 19 2019)
 */
public class Book
{
    // instance variables - replace the example below with your own
    private String title;
    private String author;
    private int yearPublished;
    private int bookPriceInCAD;

    /**
     * Constructor for objects of class Book
     */
    public Book(String title, String author, int yearPublished, int bookPriceInCAD)
    {
        setTitle(title);
        setAuthor(author);
        setYearPublished(yearPublished);
        setBookPriceInCAD(bookPriceInCAD);  
    }

    //accesor methods
    /**
     * Method getTitle is the getter method for title
     * @return title
     */
    public String getTitle()
    {
        return title;
    }

    /**
     * Method getAuthor is the getter method for author
     * @return author
     */
    public String getAuthor()
    {
        return author;
    }

    /**
     * Method getYearPublished is the getter method for yearPublished
     * @return yearPublished
     */
    public int getYearPublished()
    {
        return yearPublished;
    }

    /**
     * Method getBookPriceInCAD is the getter method for bookPriceInCAD
     * @return bookPriceInCAD
     */
    public int getBookPriceInCAD()
    {
        return bookPriceInCAD;   
    }

    //mutator methods
    /**
     * Method setTitle
     * @param inputTitle is the input parameter for the setter method for title
     */
    public void setTitle(String inputTitle)
    {
        if (inputTitle == null || inputTitle.equals(""))
        {
            System.out.println("Please enter a String that is not null or not empty");
        }
        else 
        {
            title = inputTitle;  
        } 
    }

    /**
     * Method setAuthor
     * @param inputTitle is the input parameter for the setter method author
     */
    public void setAuthor(String inputAuthor)
    {
        if (inputAuthor == null || inputAuthor.equals(""))
        {
            System.out.println("Please enter a String that is not null or not empty");
        }
        else 
        {
            author = inputAuthor;  
        } 
    }

    /**
     * Method setYearPublished
     * @param inputYearPublished is the input parameter for the setter method yearPublished
     */
    public void setYearPublished(int inputYearPublished)
    {
        if(inputYearPublished < 0)
        {
            System.out.println("Please enter a non-negative value"); 
        }
        else        
        {
            yearPublished = inputYearPublished;
        }
    }

    /**
     * Method setBookPriceInCAD
     * @param inputBookPriceInCAD is the input parameter for the setter method bookPriceInCAD
     */
    public void setBookPriceInCAD(int inputBookPriceInCAD)
    {
        if(inputBookPriceInCAD < 0)
        {
            System.out.println("Please enter a non-negative value"); 
        }
        else        
        {
            bookPriceInCAD = inputBookPriceInCAD;
        }
    }
    
    /**
     * Method displayDetails displays the book details of title, author, year published and book price
     */
    public void displayDetails()
    {
      System.out.println(" book title is: "+ title);
      System.out.println(" book is author: "+ author);
      System.out.println(" book year is published is: "+ yearPublished);  
      System.out.println(" book price is: "+ bookPriceInCAD);  
    }

}
