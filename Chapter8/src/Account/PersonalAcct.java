
 
package Account;

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
		
		
		
		do
		{
			
		
		System.out.println("Would you like to withdraw from your balance? Y for Yes N for No : ");
		withdraw = input.next();
		
		//if(withdraw.equalsIgnoreCase("Y")) {
			
		
			if (bal<100 && withdraw.equalsIgnoreCase("Y")) {
				System.out.print("Enter amount to withdraw: ");
				wAmt = input.nextDouble();
				if (wAmt == 0) {
					Jerome.withdrawal(wAmt);
				} else {
					Jerome.withdrawal(wAmt+2);
				}
				
			} else if (bal>= 100 && withdraw.equalsIgnoreCase("Y")) {
				System.out.print("Enter amount to withdraw: ");
				wAmt = input.nextDouble();
				Jerome.withdrawal(wAmt);
			}
		//}
		
	} while(!withdraw.equalsIgnoreCase("N"));
		System.out.println(Jerome.toString());
	}	
}

/* screen dump:
Enter your balance: 
50
Enter your First Name: 
said
Enter your Last Name: 
rahmani
Enter your Street: 
64
Enter your City: 
chicago
Enter your State: 
mexico
Enter your Zip Code: 
23893
Would you like to withdraw from your balance? Y for Yes N for No : 
y
Enter amount to withdraw: 25
Would you like to withdraw from your balance? Y for Yes N for No : 
n
said rahmani
64
chicago, mexico  23893
Current balance is $23.00
*/
