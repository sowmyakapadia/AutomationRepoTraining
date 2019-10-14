package oops.abstraction;

public class HDFC implements RBI {

	//If you delete any of the methods you will get error to replace keyword "implement" as "abstract"
	//example: if you delete Credit card and Debit card method you will get error on HDFC class
	//Implement is similar to Abstraction
	
	public void SavingAccount() {
		System.out.println("HDFC Savings account");
	}

	public void CurrentAccount() {
		System.out.println("HDFC Current account");
	}

	public void CreditCard() {
		System.out.println("HDFC Credit Card account");
	}

	public void DebitCard() {
		System.out.println("HDFC Debit Card account");
	}
	

}
