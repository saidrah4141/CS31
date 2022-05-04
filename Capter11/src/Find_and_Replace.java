import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Find_and_Replace {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		FileWriter out;
		BufferedWriter writeFile;
		String fileName;
		
		File dataFile;
	
		FileReader in;
		BufferedReader readFile;

		
		System.out.print("Enter file name: ");
		fileName= input.next();
		
		 dataFile = new File(fileName);
		 
		 try {
				
				
				in = new FileReader(dataFile);
				readFile = new BufferedReader(in);
				

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
