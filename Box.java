package CIS256;
//Cailyn Hyun 09/20/2021
//Programming project 4.6
//using get set method with two class

public class Box 
{
	//variables for three dimensions of box
		private double boxHeight, boxWidth, boxDepth;
		private boolean boxFull;
		
		//default constructor
		public Box()
		{
			boxHeight = 0.0;
			boxWidth = 0.0;
			boxDepth = 0.0;
			boxFull = false;
		}//close default
		
		//Box constructor
		public Box(double height, double width, double depth, boolean full)
		{
			boxHeight = height;//get value from client class
			boxWidth = width;//get value from client class
			boxDepth = depth;//get value from client class
			boxFull = full;
		}//close constructor
		
		//set methods for each attribute
		public void setHeight(double height) 
		{
			boxHeight = height;
		}
		public void setWidth(double width) 
		{
			boxWidth = width;
		}
		public void setDepth(double depth) 
		{
			boxDepth = depth;
		}
		public void setFull(boolean full) 
		{
			boxFull = full;
		}
		
		//get methods for each attribute
		public double getHeight() 
		{
			return boxHeight;
		}
		public double getWidth() 
		{
			return boxWidth;
		}
		public double getDepth() 
		{
			return boxDepth;
		}
		public double calcVolume()
		{
			return boxHeight*boxWidth*boxDepth;
		}
		
		public String getFull() 
		{
			String condition;
			if(boxFull == true) 
			{ 
				condition = "not empty";
			}
			else
			{
				condition = "empty";
			}
			return condition;
		}
		
		//print attribute
		public String toString()
		{
			return String.format("A box has %s height, %s width, %s depth, and it is %s.", boxHeight, boxWidth, boxDepth, getFull());
		}//end toString
		
	}//end class Box