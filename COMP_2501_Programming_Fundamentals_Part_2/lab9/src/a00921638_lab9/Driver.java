package a00921638_lab9;

/**
* @author Vladislav Gudkov (A00921638)
 */

public class Driver 
{

	public static void main(String[] args) 
	{
		AudioDevices a1 = new AudioDevices("SMSL", "U DAC", 2018, 299.99,2,3, false);
		VideoDevices v1 = new VideoDevices("Sony", "AQ10", 2019, 499.99, false, true, 2.1);
		GameDevices g1 = new GameDevices("Nintendo", "Switch", 2020, 399.99, true, true, 7);
		
		Storage storage = new Storage();
		storage.addAudioDevices(a1);
		storage.addVideoDevices(v1);
		storage.addGameDevices(g1);
		
		
		System.out.println(storage.totalNumberOfItems);
	}
}
