import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
@SuppressWarnings("unused")

/**
 * @author Vladislav GUdkov(A00921638)
 */

public class Assignment2 
{
	//fields
	Agency agency;
	
	private AddressReader a = new AddressReader();
	private PropertyReader p = new PropertyReader();
	File file1 = new File("files\\address_data.txt");
	File file2= new File("files\\property_data.txt");


	public void init() throws FileNotFoundException
	{
		AddressReader.readAddressData(file1);
		PropertyReader.readPropertyData(file2);
	}
	
	//menu functions for simplicity
	public void Mainmenu()
	{
		System.out.println ( "1. General Queries\n2. Residence Queries \n3. Commercial Queries\n4. Retail Queries\n5. Exit" );
	}
	public void generalQuieriesMenu()
	{
		System.out.println ( "1. By Property ID\n2. By Price \n3. By Street\n4. By Type\n5. Back" );
	}
	public void residenceQuieriesMenu()
	{
		System.out.println ( "1. By Bedroom\n2. By Pool \n3. By Strata\n4. Back");
	}
	public void commercialQuieriesMenu()
	{
		System.out.println ( "1. By Loading Dock\n2. By Highway Access \n3. Back");
	}
	public void retailQuieriesMenu()
	{
		System.out.println ( "1. By Square Footage \n2. By Customer Parking \n3. Back");
	}
	
	
	public void doSearches()
	{
		agency = new Agency("BCIT");	
		Scanner s = new Scanner(System.in);
		int option = 0;
		
		//Main menu
		System.out.println("Welcome to our Property search.");
		System.out.println("Choose one of the following options:");
		Mainmenu(); //render main menu
		option = s.nextInt();
		
		if(option == 1)
		{
			generalQuieriesMenu();
			switch (s.nextInt())
			{
			case 1:	
				System.out.println ( "1. By Property ID" );
				String propertyId = s.next();
				//Agency.getProperty(propertyId);
				break;
			case 2: 
				System.out.println ( "2. By Price" );
				double minUsd = s.nextDouble();
				System.out.println ( "Enter min price: " );
				s.nextDouble();
				System.out.println ( "Enter max price: " );
				double maxUsd = s.nextDouble();
				s.nextDouble();
				//Agency.getPropertiesBetween(minUsd, maxUsd);
				
				break;
			case 3:
				System.out.println ( "3. By Street" );
				String streetName = s.next();
				//Agency.getPropertiesOn(streetName)
				break;
			case 4:
				System.out.println ( "4. By By type" );
				String propertyType = s.next();
				//Agency.getPropertiesOfType(propertyType);
				break;
			case 5:
				System.out.println ( "5. Back" );
				Mainmenu();
			}
		}
		
		
		else if (option == 2)
		{
			residenceQuieriesMenu();
			switch (s.nextInt())
			{
			case 1:	
				System.out.println ( "1. By Bedroom" );
				System.out.println ( "Enter min number of bedrooms: " );
				int minBedrooms = s.nextInt();
				System.out.println ( "Enter max number of bedrooms: " );
				int maxBedrooms = s.nextInt();
				//Agency.getPropertiesWithBedrooms(minBedrooms, maxBedrooms);
				break;
			case 2: 
				System.out.println ( "2. By Pool" );
				s.nextBoolean();
				//Agency.getPropertiesWithPools();
				break;
			case 3:
				System.out.println ( "3. By Strata" );
				s.nextBoolean();
				//Agency.getPropertiesWithStrata();
				break;
			case 4:
				System.out.println ( "4. Back" );
				Mainmenu();
				break;
			}
		}
		
		
		else if (option == 3)
		{
			commercialQuieriesMenu();
			switch (s.nextInt())
			{
			case 1:	
				System.out.println ( "1. By Loading Dock" );
				s.nextBoolean();
				//Agency.getPropertiesWithLoadingDock();
				break;
			case 2: 
				System.out.println ( "2. By Highway Acess");
				s.nextBoolean();
				//Agency.getPropertiesWithHighwayAccess();
				break;
			case 3:
				System.out.println ( "3. Back" );
				Mainmenu();
				break;
			}
		}
		
		else if (option == 4)
		{
			retailQuieriesMenu();
			switch (s.nextInt())
			{
			case 1:	
				System.out.println ( "1. By Square Footage" );
				System.out.println ( "Enter min square footage: " );
				int squareFootage = s.nextInt();
				//Agency.getProperties WithSquareFootage(int squareFootage) 
				break;
			case 2: 
				System.out.println ( "2. By Customer Parking");
				s.nextBoolean();
				//Agency.getPropertiesWithCustomerParking() 
				break;
			case 3:
				System.out.println ( "3. Back" );
				Mainmenu();
				break;
			}
		}
		
		else if (option == 5)
		{
			System.exit(0);
		}
	}
	
	
	
	
	
	public static void main(String[] args) throws FileNotFoundException 
	{
		Assignment2 a2 = new Assignment2();
		a2.init();
		a2.doSearches();
	}

}
