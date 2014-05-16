package hospital.manager;

import java.util.ArrayList;
import java.util.List;

public class Room {
	
	private int roomNumber;
	private int maxBeds;
	List<Bed> beds = new ArrayList<Bed>();
	
	public Room(int room, int max)
	{
		this.roomNumber = room;
		this.maxBeds = max;
	}
	
	public void setRoomNumber(int room)
	{
		roomNumber = room; 
	}
	
	public int getRoomNumber()
	{
		return roomNumber;
	}
	
	public void setMaxBeds(int max)
	{
		maxBeds = max;
	}
	
	public int getMaxBeds()
	{
		return maxBeds;
	}
	
	
	@Override
	public String toString()
	{
		return String.format("Room Number: %s \nMaximum Beds: %s", getRoomNumber(), getMaxBeds());
		
	}
	

}
