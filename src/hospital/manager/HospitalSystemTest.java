/**
 * 
 */
package hospital.manager;

import java.util.Scanner;

/**
 * @author Andrea Chagas
 *
 */
public class HospitalSystemTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int c = 0;
		Hospital h1 = new Hospital("Royal Perth Hospital");
		
		int choice = 0;
		
		h1.addSurgeon(new Surgeon(001, "Harold", "Heimlich", 2, 4));
		h1.addSpecialist(new Specialist (005, "Daniel", "Gosslin", 2, 10));
		h1.addNurse(new Nurse(001, "Jane", "Peters", 1));
		h1.addPatient(new Patient(002, "Robert", "Redford", 101));
		h1.addChef(new Chef(003, "Shaniqua", "Jones", 3));
		
		while (c != 1)
		{
			System.out.println("Press 1 to add Surgeon \n Press 2 to add Specialist \n Press 3 to " +
					"add Nurse \n Press 4 to add Patient \n Press 5 to assign surgeon to patients \n Press 6 to assign " +
					"specialist to patients \n Press 7 to assign a Chef to Patients \n Press 8 to show Patients \n Press 9 to show " +
					"Patients linked to Surgeon: ");
			@SuppressWarnings("resource")
			Scanner cin = new Scanner(System.in);
			choice = cin.nextInt();
			
			switch(choice)
			{
			case 1:
			{
				System.out.println("Enter Surgeon ID: ");
				long ID = cin.nextLong();
				System.out.println("Enter First Name: ");
				String fName = cin.next();
				System.out.println("Enter Last Name: ");
				String lName = cin.next();
				System.out.println("Enter Number of Equipments: ");
				int equip = cin.nextInt();
				System.out.println("Enter Number of Patients: ");
				int patients = cin.nextInt();
				h1.addSurgeon(new Surgeon(ID, fName, lName, equip, patients));
			}
			break;
			
			case 2:
			{
				System.out.println("Enter Specialist ID: ");
				long ID = cin.nextLong();
				System.out.println("Enter First Name: ");
				String fName = cin.next();
				System.out.println("Enter Last Name: ");
				String lName = cin.next();
				System.out.println("Enter Number of Equipments: ");
				int equip = cin.nextInt();
				System.out.println("Enter Number of Patients: ");
				int patients = cin.nextInt();
				h1.addSpecialist(new Specialist(ID, fName, lName, equip, patients));
			}
			break;
			
			case 3:
			{
				System.out.println("Enter Nurse ID: ");
				long ID = cin.nextLong();
				System.out.println("Enter First Name: ");
				String fName = cin.next();
				System.out.println("Enter Last Name: ");
				String lName = cin.next();
				System.out.println("Enter Number of Rooms: ");
				int room = cin.nextInt();
				h1.addNurse(new Nurse(ID, fName, lName, room));
			}
			break;
			
			case 4:
			{
				System.out.println("Enter Patient ID: ");
				long ID = cin.nextLong();
				System.out.println("Enter First Name: ");
				String fName = cin.next();
				System.out.println("Enter Last Name: ");
				String lName = cin.next();
				System.out.println("Enter Bed Number: ");
				int bed = cin.nextInt();
				h1.addPatient(new Patient(ID, fName, lName, bed));
			}
			break;
			
			case 5:
			{
				System.out.println("Please enter Surgeon ID: ");
				long d = cin.nextLong();
				for(Surgeon s: h1.surgeonList)
				{
					if(s.getID() == d)
					{
						System.out.println("Please enter Patient ID: ");
						long i = cin.nextLong();
						for(Patient p: h1.patientList)
						{
							if(p.getID() == i)
							{
								s.addPatientsToSurgeon(p);
							}
						}
						
					}
				}
				System.out.println("The patient has been assigned to a Surgeon.");
			}
			break;
			
			case 6:
			{
				System.out.println("Please enter Specialist ID: ");
				long d = cin.nextLong();
				for(Specialist sp: h1.specialistList)
				{
					if(sp.getID() == d)
					{
						System.out.println("Please enter Patient ID: ");
						long i = cin.nextLong();
						for(Patient p: h1.patientList)
						{
							if(p.getID() == i)
							{
								sp.addPatientsToSpecialist(p);
							}
						}
						
					}
				}
				System.out.println("The patient has been assigned to a Specialist.");
			}
			break;
			
			case 7:
			{
				System.out.println("Please enter Chef ID: ");
				long d = cin.nextLong();
				for(Chef f: h1.chefList)
				{
					if(f.getID() == d)
					{
						System.out.println("Please enter Patient ID: ");
						long i = cin.nextLong();
						for(Patient p: h1.patientList)
						{
							if(p.getID() == i)
							{
								f.addPatientsToChef(p);
							}
						}
						
					}
				}
				System.out.println("The patient has been assigned to a Chef.");
			}
			break;
			
			case 8:
			{
				System.out.println(h1.getPatients());
			}
			break;
			
			case 9:
			{
				System.out.println("Please enter staff ID to see Patients: ");
				long d = cin.nextLong();
				for(Surgeon s: h1.surgeonList)
				{
					if(s.getID() == d)
					{
						System.out.println(s.getFirstName() + " " + s.getLastName() + " " + s.surgeonPatientList);
					}
				}
			}
		}
			System.out.println("Press 1 to exit. Press any other key to continue");
			c = cin.nextInt();
		}
	}
}


