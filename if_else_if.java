package CIS256;
//Cailyn Hyun
//10.18.2021
//finding appropriate quadrant on Cartesian plane

import java.io.*;
import java.util.Scanner;

public class if_else_if 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		//declare variables
		int x_Axis, y_Axis, loop;
		String quadrant;

		//initialize variable
		loop = 0;
		
		//declare input device
		Scanner stdIn = new Scanner(System.in);
		//location of getfile.txt
		PrintWriter outFile = new PrintWriter("/Users/cailynhyun/Desktop/GetFile.txt");
		
		//sentinel controlled loop
		while (loop != 1)
		{	
			//get input for x and y values
			System.out.print("What is a value of X: ");
			x_Axis = stdIn.nextInt();
			System.out.print("What is a value of Y: ");
			y_Axis = stdIn.nextInt();
			
			//determine which quadrant the coordinate is in
			if (x_Axis == 0 && y_Axis == 0)
			{
				quadrant = "the origin";
			}
			else if (y_Axis == 0)
			{
				quadrant = "on the X-Axis";
			}
			else if (x_Axis == 0)
			{	
				quadrant = "on the Y-Axis";
			}
			else if (x_Axis > 0 && y_Axis > 0)
			{	
				quadrant = "in the first quadrant";
			}
			else if (x_Axis < 0 && y_Axis > 0)
			{
				quadrant = "in the second quadrant";
			}
			else if (x_Axis < 0 && y_Axis < 0)
			{
				quadrant = "in the third quadrant";
			}
			else 
			{	
				quadrant = "in the fourth quadrant";
			}
		
			//print textfile
			outFile.printf("(%d,%d) is %s%n%n",x_Axis, y_Axis, quadrant);
			
			//ask whether continue or stop
			System.out.print("When you are done press 1. Otherwise, press 0. ");
			loop = stdIn.nextInt();
			
		}//end while loop
		
		outFile.close();
	}//end main

}//end class
