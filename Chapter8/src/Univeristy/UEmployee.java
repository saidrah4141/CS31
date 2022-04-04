/*

Program: UEmployee.java          Last Date of this Revision: Apr 4, 2022

Purpose: An application that uses nested for loops to output a table that diplays number in 
 multiples of ten.

Author: Said Rahmani, 
School: CHHS
Course: Computer Programming 30
 

*/

package Univeristy;

public  class UEmployee {

	private String fName;
	private String lName;
	private double salary;
	
	public UEmployee(String f, String l, int s) {
		fName= f;
		lName = l;
		salary = s;
	}
	
	public double getSalary() {
		return(salary);
	}
	
	public String getName() 
	{
		return(fName + " " + lName);
	}

	
		
	}

