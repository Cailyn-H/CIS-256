package CIS256;
//Cailyn Hyun 09/20/2021
//Programming project 4.6
//using get set method with two class

public class BoxTest 
{
	public static void main(String[] args) 
	{
		//create and print box1 and box2 objects
		Box box1 = new Box();
		Box box2 = new Box(15.5, 4.75, 7.0, true);
		
		//output box1 & box2
		System.out.println(box1 + " The volume is " + box1.calcVolume() +"\n\n"+ box2 + " The volume is " + box2.calcVolume());
		
		//give new data for box1
		box1.setDepth(25.0);
		box1.setHeight(14.25);
		box1.setWidth(20.25);
		box1.setFull(true);
		
		//output box1 again
		System.out.printf("\nA box has %s height, %s width, %s depth, and it is %s. The volume is %,.2f", box1.getHeight(), box1.getWidth(), box1.getDepth(), box1.getFull(), box1.calcVolume());

	}//end main
}//end class BoxTest
