package CIS256;
//Cailyn Hyun
//super class
public class Square 
{
	//declare attribute
	private double sideLength;
	
	//default constructor
	public Square()
	{
		sideLength = 0.0;
	}//end default
	
	//value constructor
	public Square(double length)
	{
		sideLength = length;
	}//end calue constructor
	
	//method to set attribute
	public void setSideLength(double length)
	{
		sideLength = length;
	}//end set method
	
	//get method to return value
	public double getSideLength()
	{
		return sideLength;
	}//end get method
	
	//toString method to return formatted value
	public String toString()
	{
		return String.format("%s%.1f%s", "length is ",sideLength, " inch");
	}//end toString() method
	
}//end class
