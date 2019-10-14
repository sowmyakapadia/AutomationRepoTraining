package oops.abstraction;

//multiple inheritance is possible only in interfaces using "extend" keyword
public interface RBI extends Modi, SC{
	
	//all methods in Interface are by default Abstract methods **conditions Apply** 
//	They can contain concrete methods provided they are static methods and default methods
	public void SavingAccount();
	public void CurrentAccount();
	public void CreditCard();
	public void DebitCard();
	
}
