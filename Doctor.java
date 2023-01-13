package CIS256;
//Cailyn Hyun
//subclass of person class

public class Doctor extends Person
{
	//decalre additional atributes
	private int docID;
	private String docSpecialty;
	private double docChargePerHr;
	
	//default constructor
	public Doctor()
	{
		super();
		docID = 0;
		docSpecialty = "";
		docChargePerHr = 0.0;
	}//end default constructor
	
	//values constructor
	public Doctor(String first, String last, int ID, String specialty, double chargePerHr)
	{
		super(first, last);
		docID = ID;
		docSpecialty = specialty;
		docChargePerHr = chargePerHr;
	}//end constructor

	//method to set all attributes
	public void setIDSpecialtyCharge(String first, String last, int ID, String specialty, double chargePerHr)
	{
		setNames(first, last);
		docID = ID;
		docSpecialty = specialty;
		docChargePerHr = chargePerHr;
	}//end setIDSpecialtyCharge
	
	//get method for doctor's ID
	public int getDocID()
	{
		return docID;
	}//end getDocID()
	
	//get method for doctor's specialty
	public String getDocSpecialty()
	{
		return docSpecialty;
	}//end get method
	
	//get method for doctor's charger per hour
	public double getDocChargePerHr()
	{
		return docChargePerHr;
	}//end get method
	
	//redefine toString
	public String toString()
	{
		return String.format("%n%s%24s%n%s%19d%n%s%11s%n%s%7s%6.2f","Name: ",super.toString(),"ID number: ",docID,"Area of specailty: ",docSpecialty,"Charge per hour: ","$",docChargePerHr);
	}//end toString
	
}
