package ca.bcit.comp1451.lab5A;
import java.util.ArrayList;

public class Library
{
	//Instance variables
	private ArrayList<ReadingMaterial> listOfReadingMaterial;
	
	//Constructor for class Library
	public Library()
	{
		listOfReadingMaterial = new ArrayList <ReadingMaterial>();
	}
	
	//Method for loadLibrary
	public void loadLibrary()
	{
		ReadingMaterial textbook = new TextBook("Java Programming ", 100, 3, "Bob Smith", "Computer Science");
		ReadingMaterial novel = new Novel("Art of War", 200, "Name", "classic", "Sun Tzu");
		ReadingMaterial magazine = new Magazine("Mens Health", 80, "12", 50000);
		listOfReadingMaterial.add(textbook);
		listOfReadingMaterial.add(novel);
		listOfReadingMaterial.add(magazine);
	}
	
	//Method to display all reading materials in the arrayList
	public void displayAllMaterialDetails()
	{
		for (ReadingMaterial material : listOfReadingMaterial)
		{
			if (material instanceof TextBook)
			{
				((TextBook) material).displayDetails();
				System.out.println("~~~~~~~~~~");
			} 
			else if (material instanceof Novel) 
			{
				((Novel) material).displayDetails();
				System.out.println("~~~~~~~~~~");
			} 
			else if (material instanceof Magazine)
			{
				((Magazine) material).displayDetails();
				System.out.println("~~~~~~~~~~");
			}
		}
	}
	
	//Method to display all magazine material details in the arrayList
	public void displayMagazineDetails()
	{
		for (ReadingMaterial material : listOfReadingMaterial) 
		{

			if (material instanceof Magazine) 
			{
				((Magazine) material).displayDetails();
				System.out.println("~~~~~~~~~~");
			}
		}
	}
	
	//Main method
	public static void main(String[] args) 
	{
		Library library = new Library();
		library.loadLibrary();
		library.displayMagazineDetails();
		library.displayAllMaterialDetails();
	}
	
	
}
