package hospital.manager;


public class Patient extends Person{
	
	private int bedNumber;

	public Patient(long id, String first, String last, int bed) 
	{
		super(id, first, last);
		setBedNumber(bed);
	}
	
	//set bed number
	public void setBedNumber(int bed)
	{
		if(bed != 0)
			bedNumber = bed;
		else
			throw new IllegalArgumentException("Patient not assigned to a bed");		
	}
	
	public int getBedNumber()
	{
		return bedNumber;
	}
	
	@Override
	public String toString()
	{
		return String.format("Patient ID: %s \nFirst Name: %s \nLast Name is: %s \nBed Number: %s", getID(), getFirstName(), getLastName(), getBedNumber());
	}
		
			
}


