package CIS256;
//Cailyn Hyun
//10.18.2021
//bill statement for gigabyte used

import java.util.Scanner;
import java.io.*;

public class switch_Gigabyte 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		//declare variables
		int loop;
		double gigabytes, charge, totalBill, additional;
		char callArea;
		
		//initialize variables
		loop = 0;
		totalBill = 0;
		
		//declare input device
		Scanner stdIn = new Scanner(System.in);
		//location of getfile.txt
		PrintWriter outFile = new PrintWriter("/Users/cailynhyun/Desktop/GetFile.txt");
		
		//print textfile
		outFile.println("Call Area      Gigabytes used      Total Bill\n---------------------------------------------");
		
		//sentinel while loop
		while (loop != 1) 
		{
			System.out.print("Which call area (A ~ D): ");
			callArea = stdIn.next().charAt(0);
			callArea = Character.toUpperCase(callArea);
		
			//error trap 
			while (callArea != 'A' && callArea != 'B' && callArea != 'C' && callArea != 'D') 
			{
				System.out.print("The call area should be from A to D. Please enter again. ");
				callArea = stdIn.next().charAt(0);  //char input from the user
				callArea = Character.toUpperCase(callArea); //convert input to uppercase, this way you won't have to worry about handling any possible lowercase entries
			}//end error trap
		
			//print output
			System.out.print("How much gigabytes used: ");
			gigabytes = stdIn.nextDouble();
			outFile.printf("%-15c%-20.2f",callArea, gigabytes);
		
			//additional gigabyte used
			additional = (gigabytes - 1.0);
			
			//total charges
			switch (callArea)
			{
				case 'A': totalBill = 10 + 5.75*additional; 
							break;
				case 'B': totalBill = 12.50 + 6.00*additional;
							break;
				case 'C': totalBill = 15.00 + 6.35*additional;
							break;
				case 'D': totalBill = 17.50 + 6.85*additional;	
			}//end switch
		
			//print textfile
			outFile.printf("$%-14.2f%n%n",totalBill);
			
			//print output
			System.out.print("When you are done press 1. Otherwise, press 0. ");
			loop = stdIn.nextInt();
			
		}//end while loop 
		
		//end textfile
		outFile.close();
	}

}
