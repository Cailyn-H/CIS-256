package CIS256;
//Cailyn Hyun
//11.22.2021
//client class for squre, rectangle, and boxx class

public class SqureRectangleBoxxClient 
{

	public static void main(String[] args) 
	{
		//decalre variables for calculation
		double perimeter = 0.0, area = 0.0, volume = 0.0;
		
		//instantiate square A and B
		Square squareA = new Square();
		Square squareB = new Square(15.5);
		
		System.out.println("***************** SQUARE SHAPE *****************\n");
		
		//call toString() from Square class
		System.out.println(squareA);
		System.out.println(squareB);
		
		//set new value for square A
		squareA.setSideLength(22.75);
		
		//call and print returned square A value
		System.out.print("\nNew value for length of square A is ");
		System.out.println(squareA.getSideLength());
		
		//calls values of square A and calculate perimeter and area of square A
		perimeter = squareA.getSideLength() * 4;
		area = Math.pow(squareA.getSideLength(), 2);
		
		System.out.printf("%n%s%.2f%n%s%.2f%n", "Perimeter of Square A is ", perimeter, "Area of Square A is ", area);
		
		System.out.println("\n***************** RECTANGLE SHAPE *****************\n");
		
		//instantiate rectagle 1 and 2
		Rectangle rect1 = new Rectangle();
		Rectangle rect2 = new Rectangle(10, 13.5);
		
		//call toString() from Rectangle class
		System.out.println(rect1);
		System.out.println(rect2);
		
		//set new value for rect 1 
		rect1.setLengthWidth(5, 6.35);
		
		//calls values of rect1 and calculate perimeter and area of rectangle 1
		perimeter = (rect1.getSideWidth()+rect1.getSideLength())*2;
		area = rect1.getSideWidth()*rect1.getSideLength();
		
		System.out.printf("%n%s%.2f%n%s%.2f%n", "Perimeter of Rectangle 1 is ", perimeter, "Area of Rectangle 1 is ", area);
		
		System.out.println("\n***************** BOX SHAPE *****************\n");
		
		//instantiate box 1 and 2
		Boxx box1 = new Boxx();
		Boxx box2 = new Boxx(10, 14.6, 5.5);
		
		System.out.println(box1);
		System.out.println(box2);
		
		//set new values for box1
		box1.setLengthWidthDepth(1.0, 2.0, 3.0);
		
		//calls values of boxw and calculate volume of the box
		volume = box1.getSideDepth()*box1.getSideLength()*box1.getSideWidth();
		
		System.out.printf("%n%s%n%n%s%.2f", box1, "Volume of the box is ",volume);
	}//end main

}//end class
