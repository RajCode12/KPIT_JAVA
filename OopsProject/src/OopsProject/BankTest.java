package OopsProject;


public class BankTest {

	public static void main(String[] args) {
		//Class	  refToObj allocator   Constructor
		//  |		  |		 |			 |
			BankAccount baAcc1 = new BankAccount(101,"Prakhar",50000);
			BankAccount baAcc2 = new BankAccount(102,"Chahat",55000);
			BankAccount baAcc3 = new BankAccount(103,"Harsh",65000);
			BankAccount baAcc4 = new BankAccount(104,"Shikha",75000);
			BankAccount baAcc5 = new BankAccount(105,"Pranjali",85000);
			BankAccount baAcc6 = new BankAccount(106,"Vishhal",95000);
			
			// baAcc1 -> stores in stack memory
			// it contains address of heap memory
			// 101,Raj,500000 - will store in heap memory
			// methods will also get store in method area in heap memory
			
			//Note:- when baAcc2 and so on will get called, 
			// only new data fields will get store in heap 
			// methods will only get store once

			baAcc1.showBankAccount();
			baAcc2.showBankAccount();
			baAcc3.showBankAccount();
			baAcc4.showBankAccount();
			baAcc5.showBankAccount();
			baAcc6.showBankAccount();
			
	}

}
class BankAccount { //extends Object 
	//DATA MEMBERS / fields
	int accountNumber;
	String accountHolder;
	double accountBalance;
	
	//MEMBER FUNCTION / methods
	BankAccount() {
		
	}
	
	//there is inbuilt ctor/implicit ctor/default ctor
	BankAccount(int x, String y, double z) { //explicit no-arg ctor
		System.out.println("BankAccount ctor...");
		accountNumber=x;
		accountHolder=y;
		accountBalance=z;
	}
	
	//either implicit or explicit but not both
	void withdraw(float amt) {
		System.out.println(accountHolder+" is withdrawing..."+amt);
		accountBalance -= amt;
	}
	void deposit(float amt) {
		System.out.println(accountHolder+" is depositing..."+amt);
		accountBalance += amt;
	}
	void showBankAccount() {
		System.out.println("------object hashcode---"+toString());
		System.out.println("ACNO   : "+accountNumber);
		System.out.println("ACNAME : "+accountHolder);
		System.out.println("ACBAL  : "+accountBalance);
		System.out.println("-------------------");
	}
	// hashcode() -> return random memory address
	// toString() -> return random memory address in string
	
}
//Implicit super constructor BankAccount() 
//is undefined for default constructor. 
//Must define an explicit constructor
class SavingsAccount extends BankAccount {
	int savingBalance = 50000;
	SavingsAccount() {
		super(100,"Raj",700000);
	}
	
}
class CreditAccount extends BankAccount {
	private double creditLimit = 100000;
	void getCurrBalance() {
		System.out.println(accountBalance);
	}
	void creditLimit() {
		System.out.println(creditLimit);
	}
	void availableCredit() {
		double credLimit = creditLimit - accountBalance;
		System.out.println(credLimit);
	}
}
class CurrentAccount extends BankAccount {
	int remainingBalance = 5000;
	void withdraw(double amount) {
		if(accountBalance - amount >= remainingBalance) {
			accountBalance -= amount;
			System.out.println(amount + " withrdrawn");
		} else {
			System.out.println("Not sufficient Balance");
		}
	}
}
class FixedDepositAccount extends SavingsAccount {
	double fixedDepositBalance = 0.0;
	private int interestRate = 10;
	void fixedDepositAmount(double amount) {
		fixedDepositBalance += amount;
		accountBalance -= amount;
	}
	void getInterest(int timeInYear) {
		double interest = (fixedDepositBalance*timeInYear*interestRate)/100;
		System.out.println("Interest for AccountNumber " + accountNumber + " is : " + interest);
	}
}

