/*

Program: statsP1.java         Last Date of this Revision: Apr 11, 2022

Purpose: 

Author: Said Rahmani, 
School: CHHS
Course: Computer Programming 30
 

*/


import java.io.*;

import java.util.Scanner;
public class statsP1 {

	public static void main(String[] args) 
	
	{
		
		double avgScore;
		double totalScores = 0;
		int numScores = 0;
		String name;
		try {
		      File dataFile = new File("test1.dat");
		      Scanner myReader = new Scanner(dataFile);
		      while (myReader.hasNextLine()) {
		         name = myReader.nextLine();
		    	Double score = myReader.nextDouble();
		        
		        System.out.println(name);
		        System.out.print(score);
		        
		       totalScores += score;
		       numScores+=1;
		       
		      }
		      avgScore = totalScores / numScores;
				System.out.println("\n" + name + "Average =" + avgScore);
				myReader.close();
				
		     
			
			
		      
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		
			}

				}
		
		
		
		/*
		
		File dataFile= new File("test1.dat");
		FileReader in;
		BufferedReader readFile;
	
	
		try {
	
		in = new FileReader(dataFile);
		readFile = new BufferedReader(in);
		while ((score= readFile.readLine ()) != null ) {
		numScores += 1;
		System.out.println(score);
		totalScores += Double.parseDouble(score);
		}
		avgScore = totalScores / numScores;
		System.out.println("Average =" + avgScore);
		readFile.close();
		in.close();
		}
		catch (FileNotFoundException e)
		{
		System. out. println("File does not exist or could not be found.");
		System.err.println("FileNotFoundException:" + e. getMessage ());
		}
		catch (I0Exception e)
		{
				System.out.println("Problem reading file.");
				System.err.println("I0Exception: "+ e.getMessage());
		
		}
		*/
		






/* Screen Dump
 

 
 */