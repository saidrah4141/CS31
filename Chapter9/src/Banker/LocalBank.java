package Banker;

/*
 * LocalBank.java from Chapter 9
 * Chapter 9 Case Study
 * Lawrenceville Press
 * August 21, 2011
 */

 /**
  * A bank where accounts can be opened or closed and customers can
  * make transactions.
  */

 import java.util.Scanner;

 public class LocalBank {

	public static void main(String[] args) {
		Bank easySave = new Bank();
		Scanner input = new Scanner(System.in);
		String action, acctID;
		Double amt;

		/* display menu of choices */
		do {
			System.out.println("Deposit\\Withdrawal\\Check balance");
			System.out.println("Add an account\\Remove an account");
			System.out.println("Modify Address");
			System.out.println("Quit\n");
			System.out.print("Enter choice: ");
			action = input.next();

			if (action.equalsIgnoreCase("A")) 
			{
				easySave.addAccount();
			} 
			else if (!action.equalsIgnoreCase("Q")) 
			{
				System.out.print("Enter account ID: ");
				acctID = input.next();
				if (action.equalsIgnoreCase("D")) {
					System.out.print("Enter deposit amount: ");
					amt = input.nextDouble();
					easySave.transaction(1, acctID, amt);
				} else if (action.equalsIgnoreCase("W")) {
					System.out.print("Enter withdrawal amount: ");
					amt = input.nextDouble();
					easySave.transaction(2, acctID, amt);
				} else if (action.equalsIgnoreCase("C")) {
					easySave.checkBalance(acctID);
				} else if (action.equalsIgnoreCase("R")) {
					easySave.deleteAccount(acctID);
				} else if (action.equalsIgnoreCase("M")) { //write code to modify information if action equals "M"A
					easySave.modifyAccount(acctID);
				}
				
			}
		} while (!action.equalsIgnoreCase("Q"));
	}
}
 
 /*
  Screen Dump:
  #1
 Deposit\Withdrawal\Check balance
 Add an account\Remove an account
 Modify Address
 Quit

 Enter choice: a
 First name: Said 
 Last name: Rahmani
 Street: 43
 City: Calgary
 Province: Alberta
 Postal Code: T43 SDm
 Beginning balance: 1000
 Account created. Account ID is: SRahmani
 Deposit\Withdrawal\Check balance
 Add an account\Remove an account
 Modify Address
 Quit

 Enter choice: m
 Enter account ID: SRahmani
 Street: 54
 City: Quebec City
 Province: Quebec
 Postal Code: Tyu 65w
 SRahmani
 Said  Rahmani 54 Quebec City Quebec Tyu 65w
 Current balance is $1,000.00
 Deposit\Withdrawal\Check balance
 Add an account\Remove an account
 Modify Address
 Quit

 Enter choice: q
 
 #2
 Deposit\Withdrawal\Check balance
Add an account\Remove an account
Modify Address
Quit

Enter choice: a
First name: Said
Last name: Rahmani
Street: 43
City: sd
Province: alber
Postal Code: tew 231
Beginning balance: 1000
Account created. Account ID is: SRahmani
Deposit\Withdrawal\Check balance
Add an account\Remove an account
Modify Address
Quit


Enter choice: c
Enter account ID: SRahmani
SRahmani
Said Rahmani 43 sd alber tew 231
Current balance is $1,000.00
Deposit\Withdrawal\Check balance
Add an account\Remove an account
Modify Address
Quit

Enter choice: d
Enter account ID: SRahmani
Enter deposit amount: 12
SRahmani
Said Rahmani 43 sd alber tew 231
Current balance is $1,012.00
Deposit\Withdrawal\Check balance
Add an account\Remove an account
Modify Address
Quit

Enter choice: w
Enter account ID: SRahmani
Enter withdrawal amount: 45
SRahmani
Said Rahmani 43 sd alber tew 231
Current balance is $967.00
Deposit\Withdrawal\Check balance
Add an account\Remove an account
Modify Address
Quit

Enter choice: r
Enter account ID: SRahmani
Account removed.
Deposit\Withdrawal\Check balance
Add an account\Remove an account
Modify Address
Quit

Enter choice: q

 
*/