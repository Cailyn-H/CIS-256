package CIS256;

import java.util.Scanner;

public class August23_In_Class 
{

	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner (System.in);
		
		final double SQ_YD_COST = 21.75;
		
		int widthInFt;
		int lengthInFt;
		int areaInSqFt;
		double areaInSqYds, costOfCarpet;
		
		System.out.print("Length of the room in feet:");
		lengthInFt = stdIn.nextInt();
		
		System.out.print("Width of the room in feet:");
		widthInFt = stdIn.nextInt();
		
		areaInSqFt = lengthInFt * widthInFt;
		
		areaInSqYds = areaInSqFt/9.0;
		
		costOfCarpet = areaInSqYds * SQ_YD_COST;
		
		System.out.println("\nCailyn Hyun\n");
		System.out.println("length in feet:       "+lengthInFt);
		System.out.println("width in feet:        "+widthInFt);
		System.out.println("Area in squre yards:  "+areaInSqYds);
		System.out.println("Carpet cost:         $"+costOfCarpet);
		
	}//end main()

}//end class
