package CIS256;
//Cailyn Hyun
//9/29/2021
//membership bill calculation

import java.util.Scanner;

public class DoubleSidedDecision 
{
	public static void main(String[] args) 
	{
		//declare variables
		String name;
		int months, age;
		double bill = 0;
		
		//declare input device
		Scanner stdIn = new Scanner(System.in);
		
		for (int i = 0; i <4; i++) 
		{
			//get input
			System.out.print("What is member's name: ");
			name = stdIn.nextLine();
			System.out.print("How old is the member: ");
			age = stdIn.nextInt();
			System.out.print("How long is the membership: ");
			months = stdIn.nextInt();
			
			//check to see if qualifies for commission
			if (months < 12) 
			{
				bill = 15.50 * months;
			}//end if
			else 
			{
				bill = 12.50 * months;
			}//end else
			if (age > 65) 
			{
				bill = bill - bill * 0.1;
			}//end if
			
			//output
			System.out.printf("%n%-18s%s%n%s%8d%n%-18s%d%n%s%s%.2f%n%n","Member name:",name,"Member age: ",age,"Membership term: ",months,"Membership Bill: ","$",bill);
		}//end for
		
	}//end main

}//end class
