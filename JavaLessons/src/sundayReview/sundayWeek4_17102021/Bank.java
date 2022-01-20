package sundayReview.sundayWeek4_17102021;

public class Bank {

	public static void main(String[] args) {
		
		BankAccount accountOne= new BankAccount();
		
		accountOne.accountHolderName= "James Bond";
		accountOne.pin= 1007;
		accountOne.balance= 1_000_000;
		accountOne.accountNumber= 1007007007;
		
		System.out.println(accountOne.getBalance(1111));
		System.out.println(accountOne.getBalance(1007));
		
		System.out.println("-----------------------");
		accountOne= new BankAccount();
		System.out.println(accountOne.pin);
	}

}
