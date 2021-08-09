package ca.bcit.comp1451.lab8B;
import java.util.ArrayList;
import java.util.Collections;

public class Driver
{
	//array list creation
	private static ArrayList<AudioMaterial> list;
	/**
	 * @param args
	 */
	//Main method
	public static void main(String[] args) 
	{
		list = new ArrayList<AudioMaterial>();

		Album firstAlbum = new Album("Yellow Submarine", 55.45, 14, "The Beatles");
		AudioBook firstAudioBook = new AudioBook("Uknown", 100.15, 450, "ArtistUnknown");
		Movie firstMovie = new Movie("RockNRolla", 100, "Guy Ritchie", 11);
		
		list.add(firstAlbum);
		list.add(firstAudioBook);
		list.add(firstMovie);
		
		//invoke sort method
		Collections.sort(list);
		
		for(AudioMaterial material:list) 
		{
			System.out.println(material);
		}
	}
}
