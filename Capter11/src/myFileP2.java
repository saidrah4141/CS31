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
		
		
		
		try {
		      File fileName = new File("zzz.txt");
		      
		      	fileName.createNewFile();
		        System.out.println("File created: " + fileName.getName());
		      
		      
			      System.out.println("Do you want to keep: " + fileName.getName() + " y for (yes) n for (no): ");
			      choice = input.next(); 
			      
			      if (choice.equalsIgnoreCase("y")) 
			      {
			    	  
			    	  System.out.println( fileName.getName() + " Has been saved");
			      
			      } 
			      else if (choice.equalsIgnoreCase("n"))  
			      {
			    	  
			    	  fileName.delete();
			    	  System.out.println( fileName.getName() + " Has been deleted");
			      
			      }
		      
		    } catch (IOException e) {
		    	
		    	System.out.println("An error occurred.");
		      
		    }
		
		
		
		
			
		


	}

}

/* Screen Dump
 File created: zzz.txt
Do you want to keep: zzz.txt y for (yes) n for (no): 
y
zzz.txt Has been saved


File created: zzz.txt
Do you want to keep: zzz.txt y for (yes) n for (no): 
n
zzz.txt Has been deleted



 
 */