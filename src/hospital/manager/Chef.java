package hospital.manager;

import java.util.ArrayList;
import java.util.List;


public class Chef extends Person{
	
	private int numberOfPatients;
	List<Patient> chefPatientList = new ArrayList<Patient>();

	public Chef(long id, String first, String last, int patients) {
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
		return String.format("Chef ID: %s \nFirst Name: %s \nLast Name is: %s \nNumber of Patients Assigned: %s", getID(), getFirstName(), getLastName(), getNumberOfPatients());
	}
	
	public List<Patient> getChefPatientList()
	{
		return chefPatientList;
	}
	
	public void addPatientsToChef(Patient o)
	{
		chefPatientList.add(o);
	}
	

}
