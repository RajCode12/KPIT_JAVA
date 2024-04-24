package OopsProject;

public class methodTest {
	public static void main(String[] args) {
		//Functions type - 4
		BankAccount1 backAccountObj1 = new BankAccount1();
		backAccountObj1.withdraw();
		backAccountObj1.withdraw(500);
		double remainingBalance1 = backAccountObj1.withdraw(1000.0);
		System.out.println(remainingBalance1);
		double remainingBalance2 = backAccountObj1.balance();
		System.out.println(remainingBalance2);
	}
}

class BankAccount1 {
	double currBalance = 500000;
	//functions without argument and return values
	void withdraw() {
		System.out.println("Withdraw");
	}
	//functions with argument and without return values 
	void withdraw(float amount) {
		System.out.println("Balance is : " + currBalance);
		currBalance -= amount;
	}
	//functions with argument and return values 
	double withdraw(double amount) {
		currBalance -= amount;
		return currBalance;
	}
	//functions without argument but with return values
	double balance() {
		return currBalance;
	}
}
