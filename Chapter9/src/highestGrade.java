/*

Program: highestGrade.java          Last Date of this Revision: May 19, 2022

Purpose: Create an application that takes 5 grades and traverses them to find the highest grade


Author: Said Rahmani, 
School: CHHS
Course: Computer Programming 30
 

*/

import java.text.NumberFormat;
import java.util.Scanner;

public class highestGrade {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double grades[] = new double[5];
		double grade;
		
		double highest=0;
		
		NumberFormat percent = NumberFormat.getPercentInstance();
		
		// asks user to enter 5 grades
		System.out.println("Enter 5 grades between 0-100: " + "\n");
		for(int i=0; i<grades.length; i++) 
		{
			System.out.println("Enter grade: " + (i+1));
			grades[i] = input.nextInt();
			
			// if a grade higher than 100 is entered the user will be promted to re enter the grade
			if (grades[i]>100) 
			{
				System.out.println("Please only enter grades between 0-100" + "\n");
				i--;
				
			}
		}
		
		// compares the grades to find the highest grade
		for(int i=0; i<grades.length; i++) {
			 grade =grades[i];
			 
			 if(grades[i] >= highest) {
				highest = grade;
			 }
		}
	
		// prints the highest grade along with a message
		System.out.println("The highest grade is: " + percent.format(highest/100));
		
		if (highest<= 50 && highest >=0) {
			System.out.println("Fail ");
		}
			else if (highest<= 75 && highest >=50) {
				System.out.println("Practice more ");
			}
				else if (highest<= 90 && highest >=75) {
					System.out.println("Good Job ");
				}
					else if (highest<= 100 && highest >=90) {
						System.out.println("Excellent ");
					}
	}
	
}

/*
 Enter 5 grades between 0-100: 
#1
Enter grade: 1
12
Enter grade: 2
45
Enter grade: 3
90
Enter grade: 4
101
Please only enter grades between 0-100

Enter grade: 4
92
Enter grade: 5
50
The highest grade is: %92.0
Excellent 

#2
Enter 5 grades between 0-100: 

Enter grade: 1
12
Enter grade: 2
34
Enter grade: 3
43
Enter grade: 4
23
Enter grade: 5
22
The highest grade is: 43%
Fail 

#3
Enter 5 grades between 0-100: 

Enter grade: 1
75
Enter grade: 2
64
Enter grade: 3
34
Enter grade: 4
21
Enter grade: 5
2
The highest grade is: 75%
Practice more 
 *
 *
 *
 */
