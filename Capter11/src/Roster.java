import java.io.*;
import java.text.NumberFormat;
import java.util.Scanner;

public class Roster {

	public static void main(String[] args) {
	

		Scanner input = new Scanner(System.in);
		FileWriter out;
		BufferedWriter writeFile;
		String fileName;
		int numStudents;
		File stuList;
		String[] roster;
		
		
		
		
		
		
		System.out.println("Enter the name of the file: ");
		fileName=input.next();
		stuList = new File(fileName);
		
		System.out.println("How many students: ");
		numStudents=input.nextInt();
		roster = new String[numStudents];
		
		
		
		
		try {
			out = new FileWriter(stuList);
			writeFile = new BufferedWriter(out);
			for(int i=0;  i<numStudents; i++) {
				System.out.println("Enter first and last name:");
				roster[i] = input.nextLine();
				writeFile.write(String.valueOf(roster[i]));
				writeFile.newLine();
			
			}
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
