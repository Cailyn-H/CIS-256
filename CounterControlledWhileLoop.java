package CIS256;
//Cailyn Hyun
//10/11/2021
//find number between two numbers and find average

import java.util.Scanner;

public class CounterControlledWhileLoop 
{

	public static void main(String[] args) 
	{
		//declare variables
		int firstNum, secondNum, count, sum;
		double avg;
	
		//declare input device
		Scanner stdIn = new Scanner(System.in);
		
		//repeat twice
		for (int i = 0; i <2; i++) 
		{
			//initializing values
			avg = 0;
			sum = 0;
			count = 0;
			
			//get first number
			System.out.print("Enter an integer: ");
			firstNum = stdIn.nextInt();
			
			//get second number
			System.out.print("\nEnter a second integer that is larger than the first integer: ");
			secondNum = stdIn.nextInt();
		
			//error trap
			while(secondNum <= firstNum)
			{	
				System.out.print("\nEnter a second integer that is larger than the first integer: ");
				secondNum = stdIn.nextInt();
			}//end trap loop
			
			//post first number and second number
			System.out.printf("%n%nThe numbers from %d to %d are:%n%n",firstNum, secondNum);
			
			//counter controlled while loop
			while(firstNum != secondNum+1) 
			{
				count ++;
				System.out.printf("%-4d",firstNum);
				sum += firstNum;
				firstNum += 1;
			}//end while loop
		
			//calculate average
			avg = (double) sum / (double)count;
		
			//output
			System.out.printf("%n%nThe Sum of the %d integers is %d and the average is %.1f%n%n%n",count, sum, avg);
		}//end for
		
	}//end main

}//end class