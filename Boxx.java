package CIS256;
//Cailyn Hyun
//There is another Box class from the beginning of the semester, so I had to name this one Boxx
//sub class inherited from subclass(rectangle) has a value of side depth

public class Boxx extends Rectangle
{
	//declare additional attribute
	private double sideDepth;
	
	//default constructor
	public Boxx()
	{
		super();
		sideDepth = 0.0;
	}//end default
	
	//value constructor
	public Boxx(double length, double width, double depth)
	{
		super(length, width);
		sideDepth = depth;
	}//end value constructor
	
	//set all attributes together
	public void setLengthWidthDepth(double length, double width, double depth)
	{
		setLengthWidth(length, width);
		sideDepth = depth;
	}//end set method
	
	//get method to return depth value
	public double getSideDepth()
	{
		return sideDepth;
	}//end get method
	
	//toString() method to return formatted value
	public String toString()
	{
		return String.format("%s%s%.1f%s", super.toString(), " and depth is ", sideDepth, " inch");
	}//end toString() value
	
}//end class
