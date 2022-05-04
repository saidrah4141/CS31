/*

Program: statsP2.java         Last Date of this Revision: Apr 21, 2022

Purpose: 

Author: Said Rahmani, 
School: CHHS
Course: Computer Programming 30
 

*/




import java.io.*;
import java.text.NumberFormat;
import java.util.Scanner;
public class statsP2 {

	
	public static void main(String[] args) {
		


		Scanner input = new Scanner(System.in);
		FileWriter out;
		BufferedWriter writeFile;
		String name;
		Double score;
		int numScores;
		double totalScores = 0;
		double avgScore;
		double smallest;
		double largest;
		NumberFormat percent = NumberFormat.getPercentInstance();
		double[] scoresArray;
		
		
		
		File dataFile = new File("testName3.txt");
		
		try {
			out = new FileWriter(dataFile);
			writeFile = new BufferedWriter(out);
			for (int i = 0; i<2; i++) {
			System.out.println("Enter your name : ");
			name=input.nextLine();
			writeFile.write(name);
			writeFile.newLine();
			}
			System.out.println("How many scores would you like to enter? : ");
			numScores = input.nextInt();
			scoresArray = new double[numScores];
			 
			System.out.println("Enter " + numScores + " class score: ");
				
			for( int i =0; i<numScores; i++) {
				score=input.nextDouble();
				totalScores += score;
				scoresArray[i] = score;
				writeFile.write(String.valueOf(score));
				writeFile.newLine();
				}
			
			avgScore = totalScores/numScores;
				
				
	    	largest =scoresArray[0];
   			smallest=scoresArray[0] ;
   			
   			for (int i = 1; i < scoresArray.length; i++) {
   				if (scoresArray[i] > largest)
   					largest = scoresArray[i];
   				else if (scoresArray[i] < smallest)
   					smallest = scoresArray[i];
   				  }
	    		
   			//System.out.print( "\n" + name + "\n" + "Average = " + percent.format(avgScore/100)
	    	//+ "\n" + "Lowest Score :" + smallest + "\n" + "Highest Score: " + largest);
	    
		writeFile.close();
		out.close();
		
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
 

 
 */