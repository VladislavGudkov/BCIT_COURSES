
/**
 * @author (Vladislav Gudkov)
 * @version (November 19 2019)
 */

import java.util.ArrayList;
import java.util.Iterator;
public class BookStore
{

    private ArrayList <Book> books;
    private String businessName;
    
    private static final int DISCOUNT = 85;

    /**
     * BookStore Constructor with no args
     */
    public BookStore()
    {
        businessName = "Book Store";
        books = new ArrayList<Book>();
    }

    /**
     * BookStore Constructor
     * @param businessName is the parameter that uses the seeter method setNameOfBusiness to set the business name
     */
    public BookStore(String businessName)
    {
        setNameOfBusiness(businessName);
        books = new ArrayList<Book>();
    }

    /**
     * Method getNameOfBusiness is the getter method for businessName
     * @return businessName
     */
    public String getNameOfBusiness()
    {
        return businessName;
    }

    /**
     * Method getBooklist is the getter method for the ArrayList books
     * @return books
     */
    public ArrayList<Book> getBooklist() 
    {
        return books;
    }

    /**
     * Method setNameOfBusiness is the setter method for businessName
     * @param inputBusinessName is the parameter to set the businessName
     */
    public void setNameOfBusiness(String inputBusinessName)
    {

        if (inputBusinessName == null || inputBusinessName.equals(""))
        {
            System.out.println("Please a String that is not null or not empty");
        }
        else 
        {
            businessName = inputBusinessName;  
        } 
    }

    /**
     * Method addBook
     * @param book is the parameter to add book to the ArrayList books
     */
    public void addBook(Book book)
    {
        if(book != null)
        {
            books.add(book);
            System.out.println( "added "+book.getTitle() + "  to arraylist");
        } 
        else
        {
            System.out.println("Invalid object added, add a valid book input");
        }
    }  

    /**
     * Method getBook is the method to get a book from the arraylist
     * @param index is the parameter for the index of arraylist books
     */
    public void getBook(int index){
        if(index >=0 && index < books.size())
        {
            System.out.println("Object at index " +index + " details:");
            books.get(index).displayDetails();
        } else 
        {
            System.out.println("Please enter an index value from 0 to " + (books.size()-1));
        }
    }

    /**
     * Method findBook is the method to find a book in the arraylist
     * @param bookTitle is the parameter to enter to match with a book contained in the arraylist books
     */
    public void findBook(String bookTitle)
    {
        for (Book currentBook: books)
        {
            System.out.println("Book found!");
            currentBook.displayDetails();
            return; 
        }
        System.out.println("Book not found!");
    }

    /**
     * Method displayAllBooks is the method to display all books in the arraylist
     */
    public void displayAllBooks() 
    {
        System.out.println("Book details for all books:");
        for(Book currentBook: books) 
        {
            currentBook.displayDetails();
        }
    }
    
    
    
    /**
     * Method donateBook
     * @param yearPublished A parameter is the input for the year the book was published
     * @return count
     */
    public int donateBook(int yearPublished)
    {
      int count = 0;  
      Iterator<Book> it = books.iterator();
      while(it.hasNext())
      {
        Book current = it.next();
        if(current.getYearPublished() <= yearPublished)
        {
            it.remove();
            count++;
        }
      }
      System.out.println("The number of books removed from the collection is: "+count);
      return count;
    }
    
    
    
    /**
     * Method applyDiscountToBooks
     * @param beginYear A parameter for the begining year to apply discount
     * @param endYear A parameter for the end year to apply discount
     */
    public void applyDiscountToBooks (int beginYear, int endYear)
    {
       Iterator<Book> it = books.iterator();  
       int count;
       Book current;
       
       while(it.hasNext())
      {
        current = it.next();
        if(current.getYearPublished() >= beginYear || current.getYearPublished() <= endYear)
        {
           //current.setbookPriceInCAD() = current.getBookPriceInCAD() * DISCOUNT;
        }
      }
    }
    
    
    /**
     * Method main is the main metoh
     * @param args is the parameter for the main method
     */
    public static void main(String args[]) {
        Book book1 = new Book("The Master and Margarita", "Mikhail Bulgakov", 1967, 20);
        Book book2 = new Book("The Brothers Karamazov", "Fyodor Dostovesky", 1880, 30);
        Book book3 = new Book("Alice In Wonderland", "Lewis Carol", 1865, 15);

        BookStore myBookstore = new BookStore("Book Store");

        myBookstore.addBook(book1); 
        myBookstore.addBook(book2);
        myBookstore.addBook(book3);

        myBookstore.getBook(4); 
        myBookstore.getBook(2);

        myBookstore.findBook("How To Win Friends and Influence People"); 
        myBookstore.findBook("Alice In Wonderland"); 

        myBookstore.displayAllBooks();
    }

}
