/*

Program: myFile.java         Last Date of this Revision: Apr 6, 2022

Purpose: 

Author: Said Rahmani, 
School: CHHS
Course: Computer Programming 30
 

*/

import java.io.*;

import java.util.Scanner;

public class myFile {


	public static void main(String[] args) 
	{
		

		Scanner input = new Scanner(System.in);
		
		System.out.println("enter a file name: ");
		String file = input.next();
		
		File testFile = new File(file);
		if (testFile.exists()) {
			System.out.println("file exists");
		} else {
			System.out.println("dont exists");
		}

	}

}


/* Screen Dump
 

 
 */