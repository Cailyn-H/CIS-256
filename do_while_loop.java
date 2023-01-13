package CIS256;
//Cailyn Hyun
//10.25.2021
//calculate the car rental bill

import java.io.*;
import java.util.Scanner;

public class do_while_loop 
{

	public static void main(String[] args) throws FileNotFoundException
	{
		//declare variables
		int mile, count, totalMile;
		final double rentalFee = 65.00;
		double bill, avgMile, totalBill, avgBill;
		String name, garbage;
		char repeat;
		
		//initialize variables
		count = 0;
		mile = 0;
		bill = 0.0;
		avgMile = 0.0;
		totalMile = 0;
		totalBill = 0.0;
		avgBill = 0.0;
		
		//declare input device
		Scanner stdIn = new Scanner(System.in);
		//location of getfile.txt
		PrintWriter outFile = new PrintWriter("/Users/cailynhyun/Desktop/GetFile.txt");
		outFile.println("Name          Miles Driven      Charge\n---------------------------------------");
		
		//posttest loop to get  multiple input
		do
		{	
			//get customer's name
			System.out.print("What is customer's name?: ");
			name = stdIn.nextLine();
			
			//error trap if  mile is less than 0
			
			do
			{
				//get miles from user
				System.out.print("Miles should be bigger than 0.\nNumber of miles driven: ");
				mile = stdIn.nextInt();
			}while(mile <= 0);
			
			//clear the input buffer before a new name can be entered
			garbage = stdIn.nextLine();

			//cost when mile is less than 25
			bill = rentalFee;
			
			//calculate when mile goes over 25
			if (mile > 25)
			{
				bill = (mile-25)*0.55 + rentalFee;
			}//end if
			
			//print output to textfile
			outFile.printf("%-14s%12d%7s%6.2f%n%n",name,mile,"$",bill);
			
			//calculate total mile
			totalMile +=mile;
			//calculate toal bill
			totalBill +=bill;
			//counts how times it repeats
			count++;
			
			//ask user whether continue
			System.out.print("Do you wish to continue(Y/N)? ");
			repeat = stdIn.next().charAt(0);
			repeat = Character.toUpperCase(repeat);
			System.out.println("");
			
			//clear the input buffer before a new name can be entered
			garbage = stdIn.nextLine();
		}while(repeat == 'Y');
		
		//calculate average miles driven and bill
		avgMile = (double)totalMile/(double)count;
		avgBill = totalBill/(double)count;
		
		//print average miles driven to textfile
		outFile.printf("%n%-14s%7.1f%n%-14s$%7.2f%n%-14s$%7.2f","Average miles:",avgMile,"Total Charge:",totalBill, "Average Bill:",avgBill);
		//end textfile
		outFile.close();
	}

}
