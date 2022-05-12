/*

Program: statsP1.java         Last Date of this Revision: Apr 11, 2022

Purpose: 

Author: Said Rahmani, 
School: CHHS
Course: Computer Programming 30
 

*/


import java.io.*;
import java.text.NumberFormat;


import java.util.Scanner;
public class statsP1 {

	public static void main(String[] args) 
	
	{
		
		
		
		
		double avgScore;
		double totalScores = 0;
		int numScores = 0;
		String name;
		String score;
		NumberFormat percent = NumberFormat.getPercentInstance();
		File dataFile= new File("test1.dat");
		
		double smallest =100;
		double largest =0;
		
		double testScore;
		
		FileReader in;
		BufferedReader readFile;
		
		
		

		

		
		
		try {
			
			in = new FileReader(dataFile);
			readFile = new BufferedReader(in);
			
			//reads the name 
			name=readFile.readLine();
			System.out.println(name);
    		
			while ((score = readFile.readLine()) != null) {
    			
    			// adds up all the scores and the number of score
    			totalScores+= Double.parseDouble(score);
    			numScores+=1;
    			System.out.println(score);
    			
    			
    			testScore=Double.parseDouble(score);
    			
    			//Calculates absolute lowest score
    			if (testScore < smallest) {
    			smallest = testScore;
    			}

    			//Calculates absolute highest score
    			if (testScore > largest) {
    			largest = testScore;
    			}
			}
    		// calculates the average score
			avgScore = totalScores/numScores;
    		
    		// prints average score, name, highest, and lowest score
    		System.out.print("\n" + name + " Average = " + percent.format(avgScore/100) + ", Highest Score: " + percent.format(avgScore/100) 
    		+ ", Lowest Score: " + percent.format(smallest/100));
		
		
		
		readFile.close();
    		in.close();
    	} catch (FileNotFoundException e) {
			System.out.println("File does not exist or could not be found.");
			System.err.println("FileNotFoundException: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("Problem reading file.");
    		System.err.println("IOException: " + e.getMessage());
    	}
		
	}
}	
		






/* Screen Dump
Said Rahmani
45
23
12
98
34

Said Rahmani Average = 42%, Highest Score: 42%, Lowest Score: 12%

 
 */