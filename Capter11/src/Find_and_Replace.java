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

		String find;
		String replace;
		String text;
		int occurences= 0;
		 dataFile = new File("find.dat");
		 
		 try {
				
				
				in = new FileReader(dataFile);
				readFile = new BufferedReader(in);
				
				System.out.println("Enter a word/ phrase you want to replace: ");
				find = input.nextLine();
				
				System.out.println("Repalce" + find + "with: ");
				replace = input.nextLine();
				
				do 
				{
					
					
					
				}while (( readFile.readLine()) != null);
	    			if ( ( readFile.readLine()).equals(find)) {
	    				ocurrences++:
	    			}
			

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
