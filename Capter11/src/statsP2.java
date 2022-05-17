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
		
		File dataFile;
		
		String fileName;
		
		
		System.out.println("Enter the name of the file: ");
		fileName=input.next();
		dataFile = new File(fileName);
		input.nextLine();
		
		
		try {
			out = new FileWriter(dataFile);
			writeFile = new BufferedWriter(out);
			
			//asks user for their name
			System.out.println("Enter your name : ");
			name=input.nextLine();
			writeFile.write(name);
			writeFile.newLine();
			
			// asks user how many score to enter 
			System.out.println("How many scores would you like to enter? : ");
			numScores = input.nextInt();
			scoresArray = new double[numScores];
			 
			//ass user to enter a set of class scores
			System.out.println("Enter " + numScores + " class scores: ");
				
			
			//writes the scores to the file and store them in an array
			for( int i =0; i<numScores; i++) {
				score=input.nextDouble();
				totalScores += score;
				scoresArray[i] = score;
				writeFile.write(String.valueOf(score));
				writeFile.newLine();
				}
			
			
			//calculates the average score
			avgScore = totalScores/numScores;
				
				
	    	largest =scoresArray[0];
   			smallest=scoresArray[0] ;
   			
   			
   			// calculates the highest and lwoest score
   			for (int i = 1; i < scoresArray.length; i++) {
   				if (scoresArray[i] > largest)
   					largest = scoresArray[i];
   				else if (scoresArray[i] < smallest)
   					smallest = scoresArray[i];
   				  }
   		
   			// prints average score, name, highest, and lowest score
   			System.out.print( "\n" + "Name: " + name + "\n" + "Average = " + percent.format(avgScore/100)
	    	+ "\n" + "Lowest Score :" + percent.format(smallest/100) + "\n" + "Highest Score: " + percent.format(largest/100));
	    
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
 Enter the name of the file: 
statsP2test
Enter your name : 
Said Rahmani
How many scores would you like to enter? : 
3
Enter 3 class scores: 
25
43
12

Name: Said Rahmani
Average = 27%
Lowest Score :12%
Highest Score: 43%
 
 */