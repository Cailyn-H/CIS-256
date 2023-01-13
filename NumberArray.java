package CIS256;
//Cailyn Hyun
//11.8.2021
//make array and store numbers with multiple methods

public class NumberArray 
{
	public static void main(String[] args) 
	{
		//declare array
		int[] numbers = {52, 46, 33, 78, 75, 65, 44, 28, 79, 56};

		//declare methods
		printHorizontalArray(numbers);
		printSumAndAvg(numbers);
		printEvenCount(numbers);
		printOddCount(numbers);
		printMin(numbers);
		printMax(numbers);
		printAdd5(numbers);
		printReversed(numbers);
	}//end main

	private static void printHorizontalArray(int[] numbers) 
	{
		//print the values in the array horizontally
		System.out.print("The values in the array are: [");
		for (int i=0; i<numbers.length; i++)
		{
			System.out.print("  " + numbers[i]);
		}
	}//end horizontal array

	private static void printSumAndAvg(int[] numbers) 
	{
		double avg = 0.0;
		int sum = 0;
		for (int i=0; i<numbers.length; i++)
		{
			//sum of all values
			sum += numbers[i];
		}
		System.out.println("  ]\n\nThe sum of all the values in the array is:  " + sum);
		avg = (double)sum/(double)numbers.length;
		System.out.println("\nThe average of all the values is:  " + avg);
	}//end sum and avg
	
	private static void printEvenCount(int[] numbers)
	{
		int countEven=0;
		//print even numbers
		System.out.print("\nEven numbers in the array are: [");
		for (int i=0; i<numbers.length; i++) 
		{
			if (numbers[i]%2 == 0)
			{
				System.out.print("  " + numbers[i]);
				countEven++;
			}
		}//end for loop for even#
		System.out.println("  ]\n\nNumber of even numbers in the array is:  " + countEven);
	}//end even numbers

	private static void printOddCount(int[] numbers) 
	{
		int countOdd = 0;
		//print odd numbers
		System.out.print("\nOdd numbers in the array are: [");
		for (int i=0; i<numbers.length; i++) 
		{
			if (numbers[i]%2 != 0)
			{
				System.out.print("  " + numbers[i]);
				countOdd++;
			}
		}//end for loop for odd#
		System.out.println("  ]\n\nNumber of odd numbers in the array is:  " +  countOdd);
	}//end odd numbers
	
	private static void printMin(int[] numbers) 
	{
		int maxIndex=0, max=0;
		for (int i=0; i<numbers.length; i++)
		{
			if (max < numbers[i])
			{
				max = numbers[i];
				maxIndex = i;
			}
		}//end for loop
		System.out.println("\nThe biggest value in the array is " + max + " and it is in array[" + maxIndex +"].");
	}//end minimum

	private static void printMax(int[] numbers) 
	{
		int minIndex=0, min=numbers[0];
		//minimum and maximum values
		for (int i=0; i<numbers.length; i++)
		{
			if (min > numbers[i])
			{
				min = numbers[i];
				minIndex = i;
			}
		}//end for loop
		System.out.println("\nThe smallest value in the array is " + min + " and it is in array[" + minIndex +"].");
	}//end maximum

	private static void printAdd5(int[] numbers) 
	{
		//add 5 to every numbers in the array and print
		System.out.print("\nNumbers with 5 bigger values: [");
		for (int i=0; i<numbers.length; i++)
		{
			numbers[i] = 5 + numbers[i];
			System.out.print("  " + numbers[i]);
		}//end for loop for adding 5 to values
	}//end add5 
	
	private static void printReversed(int[] numbers) 
	{
		int reverse;
		//reverse the order in the array
		System.out.print("  ]\n\nNumbers are in reversed order: [");
		for(int i=numbers.length-1; i >=0; i--)
		{
			System.out.print("  " + numbers[i]);
		}
		System.out.print("  ]");
	}//end reversed

}//end class

