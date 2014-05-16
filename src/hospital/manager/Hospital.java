package hospital.manager;

import java.util.ArrayList;
import java.util.List;

public class Hospital {

	List<Doctor> doctorList = new ArrayList<Doctor>();
	List<Surgeon> surgeonList = new ArrayList<Surgeon>();
	List<Specialist> specialistList = new ArrayList<Specialist>();
	List<Patient> patientList = new ArrayList<Patient>();
	List<Nurse> nurseList = new ArrayList<Nurse>();
	List<Chef> chefList = new ArrayList<Chef>();
	
	String hospitalName;
	
	void addDoctor(Doctor d)
	{
		doctorList.add(d);
	}
	
	void addSurgeon(Surgeon s)
	{
		surgeonList.add(s);
	}
	
	void addSpecialist(Specialist sp)
	{
		specialistList.add(sp);
	}
		
	void addPatient(Patient p)
	{
		patientList.add(p);
	}
	
	void addNurse(Nurse n)
	{
		nurseList.add(n);
	}
	
	void addChef(Chef c)
	{
		chefList.add(c);
	}
	
	Hospital(String name)
	{
		this.hospitalName = name;
	}
	
	public List<Surgeon> getSurgeons()
	{
		return surgeonList;
	}
	
	public List<Specialist> getSpecialists()
	{
		return specialistList;
	}
	
	public List<Patient> getPatients()
	{
		return patientList;
	}
	
	public List<Nurse> getNurses()
	{
		return nurseList;
	}
	
	public List<Chef> getChefs()
	{
		return chefList;
	}
	
	public void assignSurgeon()
	{
		for(Patient c:patientList)
		{
			for(Surgeon x: surgeonList)
			{
				x.addPatientsToSurgeon(c);
			}
		}
	}
	
	public void assignSpecialist()
	{
		for(Patient c:patientList)
		{
			for(Specialist x: specialistList)
			{
				x.addPatientsToSpecialist(c);
			}
		}
	}
	
	public void assignChef()
	{
		for(Patient c:patientList)
		{
			for(Chef x: chefList)
			{
				x.addPatientsToChef(c);
			}
		}
	}
	
	
}
