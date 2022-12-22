package com.exercises.pll;

import com.exercises.bll.Author;


import java.util.Scanner;
/*
Finally write test class TestAuthor to test the functionalities you implemented.

•	Create three objects with the defined constructors (one is with default, one is with two parameterized constructor and one is with three parameterized constructor).
•	Display the values of second object by using getters.
•	Display the values of the third object by using the toString() method.
•	Display the values of first object by using getters.
•	This time create an object with default constructor. What is your observation?
•	Create one reference and try to display the values. What is your observation?
•	Assign second object to the reference and display the values.

*/

public class AuthoTest{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		Author bookName[]= new Author[3];
		int length=bookName.length;
			
			
		    Author a1=new Author();
		    Author a2=new Author("Narayana","Murthy");
		    //Author a3=new Author("Denis","Riche",bookName);
		    Author a4;
		    
		     System.out.println("Displaying a2 objects details using getters : ");
			 System.out.println(a2.getFirstName());
			 System.out.println(a2.getLastName());
			// System.out.println(a3);
			 System.out.println("\nDisplaying the values of first object using getters : ");
			 System.out.println(a1.getFirstName());
			 System.out.println(a1.getLastName());
			 a4=a2;
			 System.out.println(a4);
			 
			 sc.close();
	
}
	

}
