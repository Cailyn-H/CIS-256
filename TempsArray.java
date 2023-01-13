package CIS256;
//Cailyn Hyun
//11.8.2021
//two dimensional array with highest and lowest temps with multiple methods

public class TempsArray 
{

	public static void main(String[] args) 
	{
		//declare variables
		String str = "";
		double highAvg, lowAvg;
		String indexHigh, indexLow;
		
		//declare array
		//12 rows 2 columns
		int[][] temp = {{50,16},
						{47,-2},
						{68,41},
						{65,35},
						{73,50},
						{81,66},
						{93,73},
						{101,82},
						{90,75},
						{75,60},
						{67,53},
						{56,38}};

		System.out.printf("%6s%6s%n%s%n","High","Low","--------------");
		
		//calls matrix format method
		printMatrix(temp);
		
		//calls average of high temperatures method and print returned value
		highAvg = averageHigh(temp);
		System.out.printf("%n%s%.2f%n", "Average high temperature is ",highAvg);
		
		//calls average of low temperatures method and print returned value
		lowAvg = averageLow(temp);
		System.out.printf("%n%s%.2f%n", "Average low temperature is ", lowAvg);
		
		//calls high temp position and print returned value
		indexHigh = indexHighTemp(str, temp);
		
		//calls low temp position and print returned value
		indexLow = indexLowTemp(str, temp);
		
		
	}//end main

	//matrix method
	private static void printMatrix(int[][] temp) 
	{
		//array for 12 rows
		for (int i=0; i<temp.length; i++)
		{
			//array for 2 columns
			for (int j=0; j<temp[i].length; j++)
			{
				System.out.printf("%6d",temp[i][j]);
				
			}//end column loop
			System.out.println();
		}//end row loop
		
	}//end matrix method
	
	//average high temperature 
	private static double averageHigh(int[][] temp) 
	{
		int highTempSum=0;
		double highAvg=0.0;
		for (int i=0; i<temp.length; i++)
		{
			highTempSum += temp[i][0];
		}//end for loop
		
		highAvg = (double)highTempSum/(double)temp.length;
		
		return highAvg;
	}//end averageHigh

	//average low temperature method
	private static double averageLow(int[][] temp) 
	{
		int lowTempSum=0;
		double lowAvg=0.0;
		for (int i=0; i<temp.length; i++)
		{
			lowTempSum += temp[i][1];
		}//end for loop
		
		lowAvg = (double)lowTempSum/(double)temp.length;
		
		return lowAvg;
	}//end averageLow

	//indexHighTemp method
	private static String indexHighTemp(String str, int[][] temp) 
	{
		int max=temp[0][0];
		String outStr = "";
		for (int i=0; i<temp.length; i++)
		{
			for (int j=0; j<temp[i].length; j++)
			{
				if (max<temp[i][j])
				{
					max = temp[i][j];
					outStr = "\nThe highest temp is " + max + " in array [" + i + "][" + j + "]";
				}
			}
			
		}//end row for loop
		
		return outStr;
	}//end indexHighTemp
	
	//indexLowTemp method
	private static String indexLowTemp(String str, int[][] temp) 
	{
		int min = temp[0][0];
		String outStr = "";
		for (int i=0; i<temp.length; i++)
		{
			for (int j=0; j<temp[i].length; j++)
			{
				if (min>temp[i][j])
				{
					min = temp[i][j];
					outStr = "\nThe lowest temp is " + min + " in array [" + i + "][" + j + "]";
				}//end if
			}	
		}//end row for loop
		
		return outStr;
	}//end indexLowTemp
	
}//and class
