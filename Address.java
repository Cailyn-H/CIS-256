package CIS256;
//Cailyn Hyun
//11.1.2021
//called from client class for student and school address
public class Address 
{
	//declare variables
	private String streetAddress, city, state;
	private long zipCode;
	
	//address constructor
	public Address (String street,String town, String st, long zip) 
	{
		streetAddress = street;
		city = town;
		state = st;
		zipCode = zip;
	}//end constructor
	
	//print toString
	public String toString()
	{
		String result;
		
		result = streetAddress + "\n";
		result += city + ", " + state + " " + zipCode;
		
		return result;
	}

}//end cass
