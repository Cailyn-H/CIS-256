package CIS256;
//Cailyn Hyun 9/8/2021
//programming project 3.6
//calculate volume and surface area of sphere

import java.util.Scanner;

public class PP3_6Assignment 
{

	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		
		//declare variables
		double radius = 0, volume, surface_area;
		
		//repeat twice
		for (int i = 0; i < 2; i++)
		{
			System.out.print("What is radius of sphere: ");
			radius = stdIn.nextDouble(); //input radius of sphere
			
			//formula for surface area and volume
			surface_area =4*Math.PI*Math.pow(radius,2);
			volume = surface_area * radius/3;
			
			//input, output with four decimal places
			System.out.printf("For a sphere with radius of %.1f, volume is %,.4f and surface area is %,.4f.\n\n", radius, volume, surface_area);
		}//end for
	}//end main

}//end class
