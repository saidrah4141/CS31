/*

Program: UEmployee.java          Last Date of this Revision: Apr 4, 2022

Purpose: An application that contains member variables for the university employee name and salary 

Author: Said Rahmani, 
School: CHHS
Course: Computer Programming 30
 

*/

package University;

import java.text.CompactNumberFormat;
import java.text.NumberFormat;

public  class UEmployee {
	NumberFormat money = NumberFormat.getCurrencyInstance();
	
	private String fName;
	private String lName;
	private double salary;
	
	// constructor that creates a university employee
	public UEmployee(String f, String l, int s) {
		fName= f;
		lName = l;
		salary = s;
	}
	
	// returns salary
	public double getSalary() {
		return(salary);
	}
	
	// returns first and last name
	public String getName() 
	{
	
		return(fName + " " + lName);
	
	}

	// returns first and last name and salaray
	public String toString()
	{
	
		return(fName + " " + lName+ " " + money.format(salary));
	
	}
		
	}

