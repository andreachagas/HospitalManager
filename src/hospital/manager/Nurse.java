package hospital.manager;

public class Nurse extends Person{
	
	private int numberOfRooms;

	public Nurse(long id, String first, String last, int rooms) 
	{
		super(id, first, last);
		setNumberOfRooms(rooms);
	}
	
	//set number of rooms
	public void setNumberOfRooms(int rooms)
	{
		if(rooms != 0)
			numberOfRooms = rooms;
		else
			throw new IllegalArgumentException("Nurse not assigned to any rooms");		
	}
	
	public int getNumberOfRooms()
	{
		return numberOfRooms;
	}
	
	@Override
	public String toString()
	{
		return String.format("Nurse ID: %s \nFirst Name: %s \nLast Name is: %s \nNumber of Rooms Assigned: %s", getID(), getFirstName(), getLastName(), getNumberOfRooms());
	}

}
