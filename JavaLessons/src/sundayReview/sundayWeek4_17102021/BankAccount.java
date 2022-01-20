package sundayReview.sundayWeek4_17102021;

public class BankAccount {
	
	String accountHolderName;
	int pin;
	double balance;
	long accountNumber;

	public double getBalance(int inputPin) {
		if (pin==inputPin) return balance;
		else return -1;
	}
	
	
	
	

}
