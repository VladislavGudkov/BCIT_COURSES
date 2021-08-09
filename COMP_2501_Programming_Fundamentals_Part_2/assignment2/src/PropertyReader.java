import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Vladislav GUdkov(A00921638)
 */
public class PropertyReader 
{
	public static ArrayList<String> readPropertyData(File file) throws FileNotFoundException
	{
		ArrayList<String> list = new ArrayList<String>();
		//file = new File("src\\student_data.txt");
		file = new File("files\\property_data.txt");
		Scanner scanner = new Scanner(file);
		
		while(scanner.hasNext())
		{
			String line = scanner.nextLine();
			String[] input = line.split("\\|");
			//String property = new Address(input[0], Integer.parseInt(input[1]), input[2], input[3],input[4]);
			//list.add(address); 
		} 
		scanner.close();
		return list;
	 }
}
