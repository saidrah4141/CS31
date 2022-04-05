/*

Program: Hockey.java          Last Date of this Revision: Mar 15, 2022

Purpose: tests the puck class

Author: Said Rahmani, 
School: CHHS
Course: Computer Programming 30
 

*/

package Puck;

public class Hockey extends Puck {

	public static void main(String[] args) {
		// creates 2 pucks
		Puck puck1 = new Puck();
		Puck puck2 = new Puck();
	
		// gives the first puck a weight of 5.1 oz and the second one a weight of 4.3 oz
		puck1.puck(5.3);
		puck2.puck(4.3);

		// checks if pucks are equal
		if (puck1.equals(puck2)) {
			System.out.print("pucks are equal");
		} else {
			System.out.print("pucks are not equal");
		}
	}

	

}
