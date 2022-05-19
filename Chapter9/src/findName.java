/*

Program: findName.java          Last Date of this Revision: May 19, 2022

Purpose: Modify search class and test it in findName to use a linear search method for Strings

Author: Said Rahmani, 
School: CHHS
Course: Computer Programming 30
 

*/



import java.util.Scanner;

public class findName {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	
		// Asks user how many names to enter
		System.out.println("How many names do you want to enter: ");
		int numNames = input.nextInt();
		input.nextLine();
	
		
		String nameToFind;
		int location;
	
		String names[] = new String[numNames];
	
		// prompts user to enter all the names
		for(int i=0 ; i<names.length; i++) {
			System.out.println("Enter name: " + (i+1));
			names[i] = input.nextLine();
		}
		
		// asks user which name to find
		System.out.println("Which name do you want to find: ");
		nameToFind=input.nextLine();
		
		// uses the linear search method from the Search class with the chosen string and array
		location = Search.linear(names, nameToFind);
		
		// tells user the string's position or a message that the string could not be found
		if (location == -1) {
			System.out.println("Sorry, name not found in array.");
		} else {
			System.out.println("Occurrence is element: " + location);
		}
	
	}
}

/*
 Screen Dump:
 
 #1
 How many names do you want to enter: 
3
Enter name: 1
john doe
Enter name: 2
requis james
Enter name: 3
steve jobs
Which name do you want to find: 
requis james
Occurrence is element: 1

#2
How many names do you want to enter: 
2
Enter name: 1
steve harv
Enter name: 2
john doe
Which name do you want to find: 
george paul
Sorry, name not found in array.

 */
