package CIS256;
//Cailyn Hyun 09/20/2021
//Programming project 4.4
//using get set method with two class

public class Kennel 
{
	public static void main(String[] args) 
	{
		//create and print dog1 and dog2 objects
		Dog dog1 = new Dog();
		Dog dog2 = new Dog("Max", 8);
		System.out.println(dog1 + " and " + dog1.calcDog_Age() + " in dog years.\n\n" + dog2 + " and " + dog2.calcDog_Age() + " in dog years.\n");
		
	    //give values to default dog attribute
		dog1.setName("Fido");
	    dog1.setHuman_Age(3);
	    
	    System.out.print(dog1.getName()+" is "+ dog1.getHuman_Age() + " in person years and " + dog1.calcDog_Age() + " in dog years.");
	       
	}//end main

}//end class Kennel
