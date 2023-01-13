package CIS256;
//Cailyn Hyun
//11/17/2021
/*person superclass, doctor subclass, patient subclass. 
Using inheritance to calculate medical bill and information*/

public class DoctorPatientClient 
{

	public static void main(String[] args) 
	{
		double charge1 = 0.0, charge2 = 0.0, hour1 = 0.0, hour2 = 0. 0;
		double bill1 = 0.0, bill2 = 0.0;
		
		//instantiate doctor1 and doctor2
		Doctor doc1 = new Doctor();
		Doctor doc2 = new Doctor("Gerald", "Herald", 789, "Dermatology", 125.50);
		
		//instantiate patient1 and patient2
		Patient patient1 = new Patient();
		Patient patient2 = new Patient("Linda","Blair", "98765", "01/22/1979", 789, 3.15);	
		
		System.out.println("\n*************** Doctor Information ***************");
		//print doctor1, doctor2
		System.out.printf("%s%n%n%s%n%n",doc1,doc2);
		
		//set new values to doctor 1
		doc1.setIDSpecialtyCharge("Abigail", "Green", 123, "Orthopedic", 98.99);
		
		//print dodctor1 with new values
		System.out.println(doc1);
		
		System.out.println("\n*************** Patient Information ***************");
		//print patient1, patient2
		System.out.println(patient1);
		System.out.println(patient2);
		
		//set new values to patient1
		patient1.setIDBODDocIDReqHr("Albert", "Einstein", "12345", "03/14/1979", 123, 0.75);
		
		//print patient1 with new values
		System.out.println(patient1);

		System.out.println("\n*************** Patient Bill Statement ***************");
		//patient1's bill
		hour1 = patient1.getRequiredHr();
		hour2 = patient2.getRequiredHr();
		//if statement to assign right doctor ID to right patient
		if (patient1.getDocID() == doc1.getDocID())
		{
			charge1 = doc1.getDocChargePerHr();
			charge2 = doc2.getDocChargePerHr();
		}//end if
		else
		{
			charge1 = doc2.getDocChargePerHr();
			charge2 = doc1.getDocChargePerHr();
		}//end else for patient 1
		
		//patient's bill calculation
		bill1 = hour1*charge1;
		//print patient 1's bill
		System.out.printf("%n%s%s%s%s%n%s%.2f","Name: ",patient1.getFirstName()," ",patient1.getLastName(),"Bill: $",bill1);
		
		//patient's bill calculation
		bill2 = hour2*charge2;
		//print patient 2's bill
		System.out.printf("%n%n%s%s%s%s%n%s%.2f","Name: ",patient2.getFirstName()," ",patient2.getLastName(),"Bill: $",bill2);
	}

}
