package CIS256;
//Cailyn Hyun
//sub class inherited from square class has a value of side width

public class Rectangle extends Square
{
	//declare additional attribute
	private double sideWidth;
	
	//default constructor
	public Rectangle()
	{
		super();
		sideWidth = 0.0;
	}//end default constructor
	
	//value constructor
	public Rectangle(double length, double width)
	{
		super(length);
		sideWidth = width;
	}//end value constructor
	
	//set all attributes together
	public void setLengthWidth(double length, double width)
	{
		setSideLength(length);
		sideWidth = width;
	}//end set method
	
	//get method to return value
	public double getSideWidth()
	{
		return sideWidth;
	}//end get method
	
	//toString method to return formatted value
	public String toString()
	{
		return String.format("%s%s%.1f%s", super.toString()," and width is ",sideWidth, " inch");
	}//end toString() method
	
}//end class
