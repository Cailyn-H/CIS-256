package CIS256;
//Cailyn Hyun 09/15/2021
//Programming project 3.7
//calculate the area of the triangle using Heron's formula

import java.util.Scanner;

public class PP3_7Assignment 
{

	public static void main(String[] args) 
	{
		//create the scanner object for input
		Scanner stdIn = new Scanner(System.in);
		
		//declare variables
		double sideA, sideB, sideC, SquredArea, HalfPerimeter, area;
		
		//repeat
		for (int i = 0; i < 2; i++)
		{
			//get the input from the user. 
			System.out.println("The lengths of the sides of a trianlge");
			
			System.out.print("A: ");
			sideA = stdIn.nextDouble();//input for the side of a triangle
			System.out.print("B: ");
			sideB = stdIn.nextDouble();//input for the side of a triangle
			System.out.print("C: ");
			sideC = stdIn.nextDouble();//input for the side of a triangle
		
			//calculate half of the perimeter
			HalfPerimeter = (sideA + sideB + sideC)/2.0;
			
			//using Heron's formula to find an area of a triangle
			SquredArea = HalfPerimeter*(HalfPerimeter-sideA)*(HalfPerimeter-sideB)*(HalfPerimeter-sideC);
			area = Math.sqrt(SquredArea);
			//input, output
			System.out.printf("\nA trianlge with sides of A: %.1f B: %.1f C: %.1f has an area of %.3f \n\n", sideA, sideB, sideC, area);
		}//end for
	}//end main

}//end class
