package CIS256;
//Cailyn Hyun
//10/11/2021
//charge by number of people

import java.io.*;
import java.util.Scanner;

public class SentinelControlledWhileLoop 
{
	
	public static void main(String[] args) throws FileNotFoundException 
	{
		//declare input device
		Scanner stdIn = new Scanner(System.in);
		//location of getfile.txt
		PrintWriter outFile = new PrintWriter("/Users/cailynhyun/Desktop/GetFile.txt");
		
		//declare variables
		int registrantInt, totalRegistrant;
		double chargePerPerson, totalCharge, totalRegistrantCharge, avgChargePerPerson;
		
		//initializing 
		totalCharge = 0;
		totalRegistrant = 0;
		totalRegistrantCharge = 0.0;
		avgChargePerPerson = 0.0;
		chargePerPerson = 0.0;
		
		System.out.print("Number of Registrant (If you are fininished, press 0): ");
		registrantInt = stdIn.nextInt();
		
		//print to textfile
		outFile.println("Registrant    " + "Charge per Person($)    " + "Total Charge($)");
		outFile.println("_____________________________________________________");
	
		//Sentinel Controlled While Loop or indefinite while loop
		while(registrantInt != 0) 
		{
			//check if it qualifies for charge difference
			if (registrantInt < 10) 
			{
				chargePerPerson = 150.0;
			}//end if
			else
			{
				chargePerPerson = 100.0;
			}//end else
			
			//calculate total charge for total registrant
			totalCharge = chargePerPerson * registrantInt;
			
			//print in txt file
			outFile.printf("\n%-14s$%-23.2f$%7.2f%n",registrantInt,chargePerPerson,totalCharge);
			
			//calculate total number of registrant and charge
			totalRegistrant += registrantInt;
			totalRegistrantCharge += totalCharge;
			
			//output
			System.out.print("\nNumber of Registrant (If you are fininished, press 0): ");
			registrantInt = stdIn.nextInt();
			
		}//end while loop
		
		//calculate average charger per person
		avgChargePerPerson = totalRegistrantCharge / (double)totalRegistrant;
		
		//print in txt file
		outFile.printf("%n%n%-33s%d%n%-32s$%,.2f%n%-32s$%,.2f","Total Registrant:",totalRegistrant,"Total Charge:",totalRegistrantCharge,"Average Charge per Registrant:",avgChargePerPerson);
		outFile.close();
	}//end main

}//end class
