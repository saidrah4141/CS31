/*

Program: PersonalAccount.java          Last Date of this Revision: Mar 24, 2022

Purpose: A Buisness Account application that allows the user to enter their personal information and withdraw from their balance

Author: Said Rahmani, 
School: CHHS
Course: Computer Programming 30
 

*/

package Account;

import java.util.Scanner;

public class BuissnessAcct {
public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	double bal;
	double wAmt;
	String fName;
	String lName;
	String str;
	String city;
	String st;
	String zip;
	String withdraw;
	
	System.out.println("Enter your balance: ");
	bal = input.nextDouble();
	
	System.out.println("Enter your First Name: ");
	fName = input.next();
	
	System.out.println("Enter your Last Name: ");
	lName = input.next();
	
	System.out.println("Enter your Street: ");
	str = input.next();
	
	System.out.println("Enter your City: ");
	city = input.next();
	
	System.out.println("Enter your State: ");
	st = input.next();
	
	System.out.println("Enter your Zip Code: ");
	zip = input.next();
	
	Account Jerome = new Account(bal,fName,lName,str,city,st,zip);
	
	
	
	do
	{
		
	
	System.out.println("Would you like to withdraw from your balance? Y for Yes N for No : ");
	withdraw = input.next();
	
	//if(withdraw.equalsIgnoreCase("Y")) {
		
	
		if (bal<500 && withdraw.equalsIgnoreCase("Y")) {
			System.out.print("Enter amount to withdraw: ");
			wAmt = input.nextDouble();
			
			if (wAmt == 0) {
				Jerome.withdrawal(wAmt);
			} else {
				Jerome.withdrawal(wAmt+10);
			}
			
		} else if (bal>= 500 && withdraw.equalsIgnoreCase("Y")) {
			System.out.print("Enter amount to withdraw: ");
			wAmt = input.nextDouble();
			Jerome.withdrawal(wAmt);
		}
	//}
	
} while(!withdraw.equalsIgnoreCase("N"));
	System.out.println(Jerome.toString());
}
	
	
	}

/* Screen Dump:
Enter your balance: 
100
Enter your First Name: 
said
Enter your Last Name: 
rahmani
Enter your Street: 
54
Enter your City: 
calgary
Enter your State: 
mexico
Enter your Zip Code: 
t56uj5
Would you like to withdraw from your balance? Y for Yes N for No : 
y
Enter amount to withdraw: 10
Would you like to withdraw from your balance? Y for Yes N for No : 
n
said rahmani
54
calgary, mexico  t56uj5
Current balance is $80.00

 
 */
