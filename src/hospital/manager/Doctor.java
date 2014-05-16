package hospital.manager;


public class Doctor extends Person{
	
	private int numberOfPatients;

	public Doctor(long id, String first, String last, int patients) {
		super(id, first, last);
		setNumberOfPatients(patients);		
	}
	
	public void setNumberOfPatients(int patients)
	{
		if(patients != 0)
			numberOfPatients = patients;
		else
			throw new IllegalArgumentException("Doctor not assigned any patients");		
	}
	
	public int getNumberOfPatients()
	{
		return numberOfPatients;
	}
	
	@Override
	public String toString()
	{
		return String.format("Doctor ID: %s \nFirst Name: %s \nLast Name is: %s \nNumber of Patients Assigned: %s", getID(), getFirstName(), getLastName(), getNumberOfPatients());
	}

}
