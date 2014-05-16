package hospital.manager;

import java.util.ArrayList;
import java.util.List;


public class Surgeon extends Doctor{
	
	private int numberOfEquipments;
	List<Patient> surgeonPatientList = new ArrayList<Patient>();

	public Surgeon(long id, String first, String last, int patients, int equipments) {
		super(id, first, last, patients);
		setNumberOfEquipments(equipments);
	}
	
	public void setNumberOfEquipments(int equipments)
	{
		if(equipments != 0)
			numberOfEquipments = equipments;
		else
			throw new IllegalArgumentException("Surgeon not assigned any equipments");		
	}
	
	public int getNumberOfEquipments()
	{
		return numberOfEquipments;
	}
	
	@Override
	public String toString()
	{
		return String.format("Surgeon ID: %s \nFirst Name: %s \nLast Name is: %s \nNumber of Patients Assigned: %s \nNumber of Equipments Assigned: %s", getID(), getFirstName(), getLastName(), getNumberOfPatients(), getNumberOfEquipments());
	}
	
	public List<Patient> getSurgeonPatientList()
	{
		return surgeonPatientList;
	}
	
	public void addPatientsToSurgeon(Patient o)
	{
		surgeonPatientList.add(o);
	}
	

}
