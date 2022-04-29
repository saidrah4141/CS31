import java.io.BufferedWriter;
import java.io.*;
import java.io.FileWriter;
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
		stuList = new File(fileName+"txt");
		
		System.out.println("How many students: ");
		numStudents=input.nextInt();
		roster = new String[numStudents];
		
		for(int i=0;  i<numStudents; i++) {
			System.out.println("Enter first name: ");
			roster[i] = input.next();
			
			System.out.println("Enter last name: ");
			roster[i+1] = input.next();
		}
		
		
	}

}
