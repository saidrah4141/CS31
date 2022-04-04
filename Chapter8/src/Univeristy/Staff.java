/*

Program: Staff.java          Last Date of this Revision: Mar 20, 2022

Purpose: An application that uses nested for loops to output a table that diplays number in 
 multiples of ten.

Author: Said Rahmani, 
School: CHHS
Course: Computer Programming 30
 

*/
import java.text.*;
package Univeristy;

public class Staff extends UEmployee {
	String jobTitle;
	
	public Staff (String F, String L, int sal, String jT) {
		super(F,L,sal);
		jobTitle= jT;
	}
	public String getTitle() {
		return(jobTitle);
	}
	public String toString() {
		String de = super.getName() + money.format(super.getSalary()) +
	}
}
