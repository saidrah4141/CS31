
   
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
	
		FileReader in;
		BufferedReader readFile;
		String stuName;
		int x= 1;
		
		
		
		
		System.out.println("Enter the name of the file: ");
		fileName=input.next();
		stuList = new File(fileName);
		
		System.out.println("How many students: ");
		numStudents=input.nextInt();
		input.nextLine();
		
		
		
		
		
		try {
			out = new FileWriter(stuList);
			writeFile = new BufferedWriter(out);
			
			
			
			for(int i=0;  i<numStudents; i++) {
				System.out.println("Enter first and last name of student " + (i+1) + ": ");
				stuName = input.nextLine();
				writeFile.write(String.valueOf(stuName));
				writeFile.newLine();
			
			}
			writeFile.close();
			out.close();
			
			in = new FileReader(stuList);
			readFile = new BufferedReader(in);
			while ((stuName = readFile.readLine()) != null) {
    			
    			System.out.println("\n" + "Student " + x + ": " + stuName);
    			x++;
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


/*
 Screen Dump:
 
 Enter the name of the file: 
RosterTester
How many students: 
3
Enter first and last name of student 1: 
req ad 
Enter first and last name of student 2: 
jkjd asda
Enter first and last name of student 3: 
jkjsd asda

Student 1: req ad 
Student 2: jkjd asda
Student 3: jkjsd asda

 *
 */
