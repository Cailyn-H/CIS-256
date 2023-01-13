package CIS256;
//Cailyn Hyun 09/01/2021
//Programming Project 2.7 
//traveled time and print the output in float

import java.util.Scanner;
public class PP2_7Assignment 
{

	public static void main(String[] args) 
	{
		//getting input
		Scanner stdIn = new Scanner (System.in);
		
		//integer for speed and distance. float for hours to get decimals
	    int speed, distance;
	    float hours;

		//repeat twice
		for (int i = 0; i <2; i++) 
		{
			
			//shows run1 or run2 
			if (i==0) 
			{
				System.out.println("run1");
			}//close if
			else 
			{
				System.out.println("run2");
			}//close else 
			
			//speed and distance value from scanner
			System.out.print("Enter speed (mph): "); 
			speed = stdIn.nextInt();
			System.out.print("Enter distance (miles): ");
			distance = stdIn.nextInt();
		
			//travel formula (unless I put float in front of distance and speed, it would not give me 15.3846, because distance and speed are integer.)
			hours = (float)distance/(float)speed;
		
			//output included input
			System.out.println("If you travel " + distance + " miles with " + speed + " mph, it will take " + hours + " hours.\n");
		
		}//end for
	}//end main

}//end class
