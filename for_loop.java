package CIS256;
//Cailyn Hyun
//10.25.2021
//calculate the balance in a saving account for 10 years

import java.util.Scanner;
import java.io.*;

public class for_loop 
{

	public static void main(String[] args) throws FileNotFoundException  
	{
		//decalre variables
		double balance, interest, intRate;
		int year;
		
		//initialize values
		balance = 0;
		intRate = 0;
		
		//declare input device
		Scanner stdIn = new Scanner(System.in);
		//location of getfile.txt
		PrintWriter outFile = new PrintWriter("/Users/cailynhyun/Desktop/GetFile.txt");
		
		//posttest loop(error trap) in case of wrong input number
		do
		{
			//get deposit amount
			System.out.print("Deposit should be bigger than 0.\nHow much do you want to deposit?: ");
			balance = stdIn.nextDouble();
			System.out.println("");
		}while(balance < 0);
		
		//posttest loop(error trap) in case of wrong input number
		do
		{
			//get interest rate
			System.out.print("Interest rate should be between 0 and 100.\nWhat percent of interest rate?: ");
			intRate = stdIn.nextDouble();
			System.out.println("");
		}while(intRate < 0 || intRate > 100);
		
		//print initial balance and interest rate to textfile
		outFile.printf("%s%3.2f%n%s%.1f%s%n%n","Initial Balance: $",balance,"Interest Rate: ",intRate,"%");
		outFile.println("Year      Interest($)      Balance($)\n-------------------------------------");
				
		//for loop repeats until year 10
		for (year = 1; year <= 10; year++) 
		{
			//calculate interest amount earned and total balance each year
			interest = intRate * balance/100;
			balance += interest;
			outFile.printf("%-10d$%10.2f%7s%9.2f%n%n",year,interest,"$",balance);
			
		}
		//end textfile
		outFile.close();
	}

}
