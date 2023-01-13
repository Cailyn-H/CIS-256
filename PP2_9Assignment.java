package CIS256;
//Cailyn Hyun 09/01/2021
//Programming Project 2.9
//convert seconds to hour, minute, and second

import java.util.Scanner;
public class PP2_9Assignment 
{

	public static void main(String[] args) 
	{
		//gets input
		Scanner stdIn = new Scanner (System.in);
		
		//declare variables
		int hours, minutes, seconds, second2;
		
		//repeat twice
		for (int i = 0; i < 2; i++)
		{
		
			//shows run1 or run2 each time
			if (i==0) 
			{
				System.out.println("run1");
			}//close if
			else 
			{
				System.out.println("run2");
			}//close else 
			
			//getting seconds input from scanner
			System.out.print("How many seconds to convert: ");
			seconds = stdIn.nextInt();
			
			//seconds into hours, minutes, and seconds
			hours = seconds/3600; 
			minutes = seconds%3600/60;
			second2 = seconds%60; 
			
			//output with %d to get integer only
			System.out.printf(seconds + " seconds are %dhours %dminutes %dseconds \n\n", hours, minutes, second2 );
		}//end for
	}//end main

}//end class
