import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Vladislav GUdkov(A00921638)
 */

public class AddressReader 
{
	public static ArrayList<Address> readAddressData(File file) throws FileNotFoundException
	{
		ArrayList<Address> list = new ArrayList<Address>();
		//file = new File("src\\student_data.txt");
		file = new File("files\\address_data.txt");
		Scanner scanner = new Scanner(file);
		
		while(scanner.hasNext())
		 {
			String line = scanner.nextLine();
			String[] input = line.split("\\|");
			Address address = new Address(input[0], Integer.parseInt(input[1]), input[2], input[3],input[4]);
			list.add(address); 
		 } 
		 scanner.close();
		 return list;
	 }
}