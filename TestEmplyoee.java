package com.exercises.pll;
import com.exercises.bll.Employee;

public class TestEmplyoee {
	
public static void main(String[] args) {
	
	Employee e1=new Employee();
	Employee e2=new Employee(101,"Ram","xyz",10000.00);
	Employee e3=new Employee(102,"Sham","abc",50000.99);
	   System.out.println("\n Displaying details of employee e2");
	   System.out.println("\nid : "+e2.getId());
	   System.out.println("\nfirstName : "+e2.getFirstName());
	   System.out.println("\nlastName : "+e2.getLastName());
	   System.out.println("\nfulltName : "+e2.getName());
	   System.out.println("\nsalary : "+e2.getSalary());
	   System.out.println("\nAnnual salary : "+e2.getFirstName());
	   System.out.println("\nraisesalary with 20% hike: "+e2.raiseSalary(20));
	   System.out.println("\n");
	   System.out.println(e2);
	   e1.setSalary(20000);
	   System.out.println("\n salary of emplyoee e1 is : "+e1.getSalary());
	
	
	
}
}
