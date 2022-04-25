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
		double[] myNum;
	File himan = new File("hithere.txt");
		
		try 
		{
			
			out = new FileWriter(himan);
			writeFile = new BufferedWriter(out);
			System.out.println("Enter your name: ");
				name=input.next();
			writeFile.write(name);
				writeFile.newLine();
				
				System.out.println("Enter five class score: ");
				for( int i =0; i<=5; i++) {
					 myNum[i]=input.nextDouble();
				writeFile.write(String.valueOf(myNum[i]));
				writeFile.newLine();
			}
			writeFile.close();
			out.close();
		} catch (IOException e) {
			
		} 
		
		
		
		
		
	}

}

/* Screen Dump
 

 
 */