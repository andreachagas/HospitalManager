package hospital.manager;


public abstract class Person {
	
	private long personID;
	private String firstName;
	private String lastName;
	
	// three argument constructor
	public Person(long id, String first, String last)
	{
		this.personID = id;
		this.firstName = first;
		this.lastName = last;
	}
	
	public void setID(long id)
	{
		personID = id; 
	}
	
	public long getID()
	{
		return personID;
	}
	
	public void setFirstName(String first)
	{
		firstName = first;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public void setLastName(String last)
	{
		lastName = last;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	@Override
	public String toString()
	{
		return String.format("ID: %s \nFirst Name: %s \nLast Name is: %s", getID(), getFirstName(), getLastName());
		
	}
	
	
}
