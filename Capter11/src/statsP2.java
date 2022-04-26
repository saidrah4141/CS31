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
		FileReader in;
		FileWriter out;
		BufferedReader readFile;
		BufferedWriter writeFile;
		String name;
		Double score;
		String score1;
		String fileName;
		int numScores;
		double totalScores = 0;
		double avgScore;
		double smallest;
		double largest;
		NumberFormat percent = NumberFormat.getPercentInstance();
		/* prompt user for file name 
		System.out.print("Enter the name of the application file: ");
		fileName = input.nextLine();
		*/
		File dataFile = new File("testName2.txt");
		try {
			out = new FileWriter(dataFile);
			writeFile = new BufferedWriter(out);
			
			System.out.println("Enter your name: ");
				name=input.next();
				writeFile.write(name);
				writeFile.newLine();
				
				System.out.println("How many scores would you like to enter? : ");
			 numScores = input.nextInt();
			 double[] myNum = new double[numScores];
				System.out.println("Enter " + numScores + " class score: ");
				for( int i =0; i<numScores; i++) {
					 score=input.nextDouble();
					  totalScores += score;
				writeFile.write(String.valueOf(score));
				writeFile.newLine();
				}
				
				avgScore = totalScores/numScores;
				in = new FileReader(dataFile);
				readFile = new BufferedReader(in);
				name=readFile.readLine();
				System.out.println(name);
	    		while ((score1 = readFile.readLine()) != null) {
	    			for( int i =0; i<=numScores; i++) {
						 myNum[i] = Double.parseDouble(score1);
						 
					}
	    			 
				}
	    		largest =myNum[0];
   			 smallest=myNum[0] ;
   			for (int i = 1; i < myNum.length; i++) {
   				   if (myNum[i] > largest)
   				    largest = myNum[i];
   				   else if (myNum[i] < smallest)
   				    smallest = myNum[i];
   				  }
	    		System.out.print("\n" + name + " Average = " + percent.format(avgScore/100)
	    		+ "\n" + "Lowest Score :" + smallest + "\n" + "Highest Score: " + largest);
    		
		writeFile.close();
		out.close();
		
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
 

 
 */