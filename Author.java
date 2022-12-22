package com.exercises.bll;

/*
  1.	Write a Java class Author with following features:
Instance variables (fields) :

firstName for the author’s first name of type String.
lastName for the author’s last name of type String.
bookNames[] for the books has written by the author of type String[]

Constructors:
    Default constructor

public Author (String firstName, String lastName): A constructor with parameters, it creates the Author object by setting the two fields to the passed values.

public Author (String firstName, String lastName, String bookNames[]): A constructor with parameters, it creates the Author object by setting the three fields to the passed values.


Instance methods:

public void setFirstName (String firstName): Used to set the first name of author.

public void setLastName (String lastName): Used to set the last name of author.

public void setBookNames(String []bookNames): Used to set the book name.

public String getFirstName(): This method returns the first name of the author.

public String getLastName(): This method returns the last name of the author.

public String[] getBookNames(): This method returns the book name of the written book by the author.

public String toString(): This method printed out author’s details to the screen



*/

public class Author{
	
	private String firstName;
	private String lastName;
	private String bookName[];
	
	public Author(){
		
	}
	
	public  Author(String firstName,String lastName){
		this.firstName=firstName;
		this.lastName=lastName;
	}
	public Author(String firstName,String lastName,String bookName[]){
		this.firstName=firstName;
		this.lastName=lastName;
		this.bookName=bookName;
	}
	public void setFirstName (String firstName) {
		this.firstName=firstName;
	}
	public void setLastName (String lastName) {
		this.lastName=lastName;
	}
	public void setBookName(String bookName[]) {
		 this.bookName=bookName;
         
	}

	public String getFirstName() {
		return this.firstName;
	}
	public String getLastName() {
		return this.lastName;
	}
	public String getBookName() {
		return this.bookName;
	}
	
	@Override
	public String toString() {
		 return "\nAuthor Details"+"\nAuthor firstName :"
	+this.firstName+"\nLastName : "+this.lastName+"\nBookName :"+this.bookName;
	}
	
};



