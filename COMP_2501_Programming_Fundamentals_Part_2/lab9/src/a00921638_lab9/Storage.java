package a00921638_lab9;

import java.util.ArrayList;

/**
* @author Vladislav Gudkov (A00921638)
 */

public class Storage 
{
	//fields
	private ArrayList<AudioDevices> audioDevicesList = new ArrayList<AudioDevices>();
    private ArrayList<VideoDevices> videoDevicesList = new ArrayList<VideoDevices>();
    private ArrayList<GameDevices> gameDevicesList = new ArrayList<GameDevices>();
    public int totalNumberOfItems;
	
    //default constructor
    public Storage()
    {
    	
    }
    
    
    //Methods to add to arrayLists
    public void addAudioDevices(AudioDevices audioDevice)
    {
    	this.audioDevicesList.add(audioDevice);
    	totalNumberOfItems = totalNumberOfItems + 1;
    }
    
    public void addVideoDevices(VideoDevices videoDevie)
    {
    	this.videoDevicesList.add(videoDevie);
    	totalNumberOfItems = totalNumberOfItems + 1;
    }
    
    public void addGameDevices(GameDevices gameDevice)
    {
    	this.gameDevicesList.add(gameDevice);
    	totalNumberOfItems = totalNumberOfItems + 1;
    }
    
    //methods to remove from arraylist
    public void removeAudioDevices(int listPosition)
    {
    	this.audioDevicesList.remove(listPosition);
    	totalNumberOfItems = totalNumberOfItems - 1;
    }
    
    public void RemoveVideoDevices(int listPosition)
    {
    	this.videoDevicesList.remove(listPosition);
    	totalNumberOfItems = totalNumberOfItems - 1;
    }
    
    public void RemoveGameDevices(int listPosition)
    {
    	this.gameDevicesList.remove(listPosition);
    	totalNumberOfItems = totalNumberOfItems - 1;
    }
    
    //return total number of items
    public int totalNumberOfItems()
    {
        return this.totalNumberOfItems;
    }
	

}
