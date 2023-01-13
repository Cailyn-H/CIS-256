package CIS256;
//Cailyn Hyun
//second subclass patient is inherited from person superclass

public class Patient extends Person
{
	//declare addtitional attributes
	private String patientID;
	private String patientBOD;
	private int docIDNum;
	private double requiredHr;
	
	//default constructor
	public Patient()
	{
		super();
		patientID = "";
		patientBOD = "";
		docIDNum = 0;
		requiredHr = 0.0;
	}//end defualt constructor
	
	//values constructor
	public Patient(String first, String last, String patID, String BOD, int docID, double serviceHr)
	{
		super(first, last);
		patientID = patID;
		patientBOD = BOD;
		docIDNum = docID;
		requiredHr = serviceHr;
	}//end constructor
	
	//set all attributes together
	public void setIDBODDocIDReqHr(String first, String last, String patID, String BOD, int docID, double serviceHr)
	{
		setNames(first, last);
		patientID = patID;
		patientBOD = BOD;
		docIDNum = docID;
		requiredHr = serviceHr;
	}//end set method
	
	//get method for patient's ID
	public String getPatientID()
	{
		return patientID;
	}//end patient ID get method
	
	//get method for patient's BOD()
	public String getPatientBOD()
	{
		return patientBOD;
	}//end BOD get method
	
	//get method for doctor's ID that is assigned to the patient
	public int getDocID()
	{
		return docIDNum;
	}//end doctor ID get method
	
	//get method for patient's required service hour
	public double getRequiredHr()
	{
		return requiredHr;
	}//end service hour get method
	
	//redefine toString
	public String toString()
	{
		/*return("Patient's name is "+super.toString()+", the patient's ID number is "+patientID+
				", the patient's birth of date is "+patientBOD+", the patient's doctor ID is "+docIDNum+
				", and the patient's required service hour is "+requiredHr);*/
		return String.format("%n%s%23s%n%s%18s%n%s%14s%n%s%9d%n%s%6.2f%n","Name: ",super.toString(),"ID number: ",patientID,"Birth of date: ",patientBOD,"Assigned doctor ID: ",docIDNum,"Required service hour: ",requiredHr);
	}
	
}
