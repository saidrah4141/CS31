/*

Program: squares.java          Last Date of this Revision: May 19, 2022

Purpose: Create a squares application that stores the square of an elements's in an integer array of 5 elements.


Author: Said Rahmani, 
School: CHHS
Course: Computer Programming 30
 

*/

import java.lang.Math.*;

public class squares {

	
	public static void main(String[] args) {

		// creates an integer array with 5 elements
		int[] array = new int[5];
		
		
		// stores the square of the arrays' indexs' then prints them
		for (int i=0; i<array.length; i++) {
			array[i]=(int) Math.pow(i, 2);
			System.out.println(array[i]);
		}
	
		
	}

}

/* 
Screen dump:
0
1
4
9
16


*/