package CIS256;
//Cailyn Hyun
//11.1.2021
//called from client class for student information

public class Student 
{
	//declare variables
	private String firstName, lastName;
	private Address homeAddress, schoolAddress;
	private int score1, score2, score3;
	
	//constructor method
	public Student(String first, String last, int Num1, int Num2, int Num3, Address home, Address school)
	{
		firstName = first;
		lastName = last;
		homeAddress = home;
		schoolAddress = school;
		score1 = Num1;
		score2 = Num2;
		score3 = Num3;
	}//clost constructor
	
	//overloaded constructor
	public Student(String first, String last, Address home, Address school)
	{
		firstName = first;
		lastName = last;
		homeAddress = home;
		schoolAddress = school;
		score1 = 0;
		score2 = 0;
		score3 = 0;
	}//close overloaded constructor
	
	//get and set three scores
	/*public int getScore1()
	{
		return score1;
	}
	public void setScore1(int Num1) 
	{
		score1 = Num1;
	}

	public int getScore2() 
	{
		return score2;
	}
	public void setScore2(int Num2) 
	{
		score2 = Num2;
	}

	public int getScore3() 
	{
		return score3;
	}
	public void setScore3(int Num3) 
	{
		score3 = Num3;
	}*/
	public void setTestScore(int testNum1, int Num1)
	{
		score1 = Num1;
	}
	public int getTestScore() 
	{
		return score1;
	}

	//calculate average test score
	public int calcAvgScore()
	{
		return (score1 + score2 + score3)/3;
	}
	
	//print attribute
	public String toString()
	{
		String result;
		
		result = firstName + " " + lastName;
		result += "\nTest 1 Score: " + score1 + "\nTest 2 score: " + score2 + "\nTest 3 score: " + score3;
		result += "\nAverage Test Score is " + calcAvgScore();
		result += "\nHome Address:\n" + homeAddress;
		result += "School Address:\n" + schoolAddress;
		
		return result;
	}//clost toString
	
}//end class