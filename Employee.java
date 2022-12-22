package com.exercises.bll;



public class Employee {
	private int id;
	private String firstName;
	private  String lastName;
	private double salary, percent;
	
	public Employee() {
	
	}
	
	 public Employee(int id,String firstName,String lastName,double salary){
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
		this.salary=salary;
	}
	public int getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getName(){
		return this.firstName+" "+this.lastName;
	}
	public double getSalary() {
		return salary;
	}
    public void setSalary(double salary) {
    	this.salary=salary;
    }
    public double getAnnualSalary(){
    	return salary*12;
    }
    public double raiseSalary(double percent) {
    	    return salary=(salary*percent)+salary;
    }
    @Override
	public String toString() {
    	return "Employee id " +this.id+" name : " +firstName  +" "+lastName +" salary : "+this.salary;
    }
};
