package CIS256;
//Cailyn Hyun 09/20/2021
//Programming project 4.4
//using get set method with two class

public class Dog 
{
	//variables of name and two different ages
	private String dogName;
	private int age;
	
	public Dog()
	{
		dogName = "";
		age = 0;
	}
	//constructor for name and age
	Dog(String name, int human_Age)
	{
		dogName = name;//get name from instance
		age = human_Age;//get age from instance
	}//close constructor 
	
	//set methods for each attribute
	public void setName(String name) 
	{
		dogName = name;//state name
	}
	public void setHuman_Age(int human_Age) 
	{
		age = human_Age;//state age
	}
	
	//get methods for each attribute
	public String getName() 
	{
		return dogName;
	}
	public int getHuman_Age() 
	{
		return age;
	}
	public int calcDog_Age()
	{
		return age*7;
	}
	
	//print attribute
	public String toString() 
	{
		return String.format("%s is %s in person years",dogName,age);
	}//end toString
}//end class Dog
