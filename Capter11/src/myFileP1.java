/*

Program: myFile.java         Last Date of this Revision: Apr 6, 2022

Purpose: 

Author: Said Rahmani, 
School: CHHS
Course: Computer Programming 30
 

*/

import java.io.*;

import java.util.Scanner;

public class myFileP1 {


	public static void main(String[] args) 
	{
		
		
		Scanner input = new Scanner(System.in);
		
			
		
		System.out.println("Enter a file name: ");
		String file = input.next();
		
		File testFile = new File(file);
		
		if (testFile.exists()) {
			
			System.out.println("file exists!");
			
		} 
		else 
		{
			
			System.out.println("file doesn't exists!");
			
		}

	}

}


/* Screen Dump
 
Enter a file name: 
C:\Users\904101002\Documents\hi.txt
file exists!

Enter a file name: 
hi
file doesn't exists!
 
 */