/*

Program: myFileP2.java         Last Date of this Revision: Apr 7, 2022

Purpose: 

Author: Said Rahmani, 
School: CHHS
Course: Computer Programming 30
 

*/
import java.io.*;
import java.util.*;

public class myFileP2 {

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String choice;
		
		File textFile = new File("zzz");
		
		
		try {
			textFile.createNewFile();
			System.out.println(" New file created!");
		} catch (IOException e) {
			
		}
		
		System.out.print("A file named zzz.txt has been created do you want to keep the file Y(yes) N (no) : ");
		choice = input.next();
		
		if (choice.equalsIgnoreCase("n")) 
		{
			textFile.delete();
			System.out.println(" file deleted!");
		} 
		else 
		{
			
		}
		
		
			
		


	}

}

/* Screen Dump
 

 
 */