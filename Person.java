package CIS256;
//Cailyn Hyun
//super class
//names for doctor and patient

public class Person 
{
	//declare instance variables
	private String firstName;
	private String lastName;
	
	//default constructor
	public Person()
	{
		firstName = "";
		lastName = "";
	}//end default constructor
	
	//values constructor
	public Person(String fName, String lName)
	{
		firstName = fName;
		lastName = lName;
	}//end values constructor
	
	//set method for both attributes
	public void setNames(String fName, String lName)
	{
		firstName = fName;
		lastName = lName;
	}//end setAttribute
	
	//get method for first name
	public String getFirstName()
	{
		return firstName;
	}//end getFirstName;
	
	//get method for lastname
	public String getLastName()
	{
		return lastName;
	}//end getLastName;
	
	public String toString()
	{
		return (firstName + " " + lastName);
	}//end toString
	
}//end Person class
