package CIS256;
//Cailyn Hyun
//9/29/2021
//grosspay calculation
import java.util.Scanner;

public class SingleSidedDecision 
{
	public static void main(String[] args) 
	{
		//declare variable
		String employeeNum;
		double grossPay, payRate, hours, overtimePay;
		
		//declare input device
		Scanner stdIn = new Scanner(System.in);
		
		for (int i = 0; i <2; i++) 
		{
			//get input
			System.out.print("What is employee number? : ");
			employeeNum = stdIn.nextLine();
			System.out.print("How many hours worked? : ");
			hours = stdIn.nextDouble();
			System.out.print("What is hourly pay rate? : $");
			payRate = stdIn.nextDouble();
			
			//calculate less than 40 hour pay
			grossPay = hours * payRate;
			
			//check to see if qualifies for overtime pay
			if (hours > 40) //add additional overtime pay for the hours over 40 at 50% of the regular pay rate
			{
				overtimePay = payRate * 0.5 * (hours-40);
				grossPay = grossPay + overtimePay;//regular pay + over 40 hours pay
			}//end if
		
			System.out.printf("%n%-17s%s%n%-17s%.2f%n%-16s$%.2f%n%-16s%s%.2f%n%n","Employee number:",employeeNum,"Hours worked:", hours,"Pay rate:",payRate,"Grosspay:","$",grossPay);
		}//end for 
		
	}//end main

}//end class
