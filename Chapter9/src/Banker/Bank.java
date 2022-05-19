package Banker;

/**
 * Bank class.
 */

import java.util.ArrayList; 
import java.util.Scanner;

public class Bank 
{
	private ArrayList<Account> accounts;
		
	
	/**
	 * constructor
	 * pre: none
	 * post: accounts has been initialized.
	 */
	public Bank() {
		accounts = new ArrayList<Account>();
	}
	

	/** 
	 * Adds a new account to the bank accounts.
	 * pre: none
	 * post: An account has been added to the bank's accounts.
	 */
	public void addAccount() 
	{
		Account newAcct;
		double bal;
		String fName, lName, str, city, province, postalCode;

	//add your string variables for street, city, province, postal code

		Scanner input = new Scanner(System.in);
		
		System.out.print("First name: ");
		fName = input.nextLine();

		System.out.print("Last name: ");
		lName = input.nextLine();


	//get customer street and record street
		System.out.print("Street: ");
		str = input.nextLine();
	//get city 
		System.out.print("City: ");
		city = input.nextLine();
	//get province
		System.out.print("Province: ");
		province = input.nextLine();
	//get postal code
		System.out.print("Postal Code: ");
		postalCode = input.nextLine();







		System.out.print("Beginning balance: ");
		bal = input.nextDouble();
		
		newAcct = new Account(bal, fName, lName, str, city, province, postalCode); //update this constructor to include street, city, province, postal code	
										//create acct object
		accounts.add(newAcct);						//add account to bank accounts
		
		System.out.println("Account created. Account ID is: " + newAcct.getID());
	}

	
	/** 
	 * Deletes an existing account.
	 * pre: none
	 * post: An existing account has been deleted.
	 */
	public void deleteAccount(String acctID) {
		int acctIndex;
		Account acctToMatch;
		
	 	acctToMatch = new Account(acctID);
	 	acctIndex = accounts.indexOf(acctToMatch);		//retrieve location of account
	 	if (acctIndex > -1) {
	 		accounts.remove(acctIndex);					//remove account
	 		System.out.println("Account removed.");
	 	} else {
	 		System.out.println("Account does not exist.");
	 	}
	}
	
	
	/** 
	 * Performs a transaction on an existing account. A transCode of 1 is for deposits 
	 * and a transCode of 2 is for withdrawals.
	 * pre: transCode is 1 or 2.
	 * post: A transaction has occurred for an existing account.
	 */
	public void transaction(int transCode, String acctID, double amt) {
		int acctIndex;
		Account acctToMatch, acct;
		
	 	acctToMatch = new Account(acctID);
	 	acctIndex = accounts.indexOf(acctToMatch);		//retrieve location of account
	 	if (acctIndex > -1) {
	 		acct = accounts.get(acctIndex);				//retrieve object to modify
	 		if (transCode == 1) {
	 			acct.deposit(amt);
	 			accounts.set(acctIndex, acct);		//replace object with updated object
	 			System.out.println(acct);
	 		} else if (transCode == 2) {
	 			acct.withdrawal(amt);
	 			accounts.set(acctIndex, acct);		//replace object with updated object
	 			System.out.println(acct);
	 		}
	 	} else {
	 		System.out.println("Account does not exist.");
	 	}
	}


	/** 
	 * Displays the account information, including the current balance, 
	 * for an existing account.
	 * pre: none
	 * post: Account information, including balance, has been displayed.
	 */
	public void checkBalance(String acctID) {
		int acctIndex;
		Account acctToMatch, acct;
		
	 	acctToMatch = new Account(acctID);
	 	acctIndex = accounts.indexOf(acctToMatch);		//retrieve location of account
	 	if (acctIndex > -1) {
	 		acct = accounts.get(acctIndex);	//retrieve object to display
	 		System.out.println(acct);
	 	} else {
	 		System.out.println("Account does not exist.");
	 	}
	}



	//Changes the address of the account
    public void modifyAccount(String acctID)
    {
            int acctIndex;
Account acctToMatch, acct;
String str, city, province, postalCode;
Scanner input = new Scanner(System.in);
    //Checks to see which user
acctToMatch = new Account(acctID);
acctIndex = accounts.indexOf(acctToMatch); //retrieve location of account
if (acctIndex > -1)
            {
                acct = accounts.get(acctIndex); //retrieve object to display
              //get customer street and record street
        		System.out.print("Street: ");
        		str = input.nextLine();
        	//get city 
        		System.out.print("City: ");
        		city = input.nextLine();
        	//get province
        		System.out.print("Province: ");
        		province = input.nextLine();
        	//get postal code
        		System.out.print("Postal Code: ");
        		postalCode = input.nextLine();

                
                acct.changeAddress(str, city, province, postalCode); //Changes the address of the person
                System.out.println(acct);
}
            else
            {
                System.out.println("Account does not exist.");
}

	}

}