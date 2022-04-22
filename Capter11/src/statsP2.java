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
		

		double avgScore;
		double totalScores = 0;
		int numScores = 0;
		String name;
		String score;
		NumberFormat percent = NumberFormat.getPercentInstance();
		File dataFile= new File("test1.dat");
		
		
		
		
		File dataFile;
		File docFile;
		String fileName;
		Scanner input = new Scanner(System.in);
		FileReader in;
		FileWriter out;
		BufferedReader readFile;
		BufferedWriter writeFile;
		String lineOfCode;
		
		

		

		
		
		try {
			in = new FileReader(dataFile);
			readFile = new BufferedReader(in);
			name=readFile.readLine();
			System.out.println(name);
    		while ((score = readFile.readLine()) != null) {
    			totalScores+= Double.parseDouble(score);
    			numScores+=1;
    			System.out.println(score);
    			
			}
    		avgScore = totalScores/numScores;
    		System.out.print("\n" + name + " Average = " + percent.format(avgScore/100));
		
		
		
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