
Import 
package Puck;

import java.util.Scanner;

public class PersonalAcct {
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
		
		Jerome.toString();
		
		do
		{
			
		
		System.out.println("Would you like to withdraw from your balance? Y for Yes N for No : ");
		withdraw = input.next();
		
		if (bal<100 && withdraw.equalsIgnoreCase("Y")) {
			System.out.print("Enter amount to withdraw: ");
			wAmt = input.nextDouble();
			bal -= wAmt +2 ;
		} else if (bal>= 100 && withdraw.equalsIgnoreCase("Y")) {
			System.out.print("Enter amount to withdraw: ");
			wAmt = input.nextDouble();
			bal -= wAmt +2 ;
		}
		
	} while(withdraw!=)
}
