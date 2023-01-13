package CIS256;
//Cailyn Hyun
//11.1.2021
//student information and scores

public class StudentBody 
{

	public static void main(String[] args) 
	{
		//address and student objects 
		Address school = new Address ("800 Lancaster Ave.","Villanova","PA", 19085);
		Address jHome = new Address ("21 Jump Street","Blacksburg","VA",24551);
		Student john = new Student ("John", "Smith", 85, 92, 77, jHome, school);
		
		Address mHome = new Address ("123 Main Street","Euclid","OH", 44132);
		Student marsha = new Student ("Marsha", "Jones", 100, 80, 93, mHome, school);
		
		//this will call overloaded constructor
		Address tHome = new Address ("9876 First Avenue","Miami","FL", 22334);
		Student timothy = new Student ("Timothy", "Green", mHome, school);
		
		//print output from student and address class
		System.out.println(john);
		System.out.println();
		System.out.println(marsha);
		System.out.println();
		System.out.println(timothy);
		
		//set three scores for Timothy
		/*timothy.setTestScore()
		{
			
		}
		
		
		//get three scores and print output
		System.out.print("The average of " + timothy.getTestScore(1) + ", " + timothy.getTestScore(2) + ", and "
				+ timothy.getTestScore(3) + " is ");
		
		System.out.printf("%d%n", timothy.calcAvgScore());*/

	}//end main

}//end class
