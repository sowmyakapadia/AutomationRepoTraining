package oops.abstraction;

public class Customer {
	public static void main(String[] args) {
		
	//you cannot create objs of interfaces as they contain abstract methods
	//Creating reference of RBI "RBI acc"
		
//	RBI acc;
//	
//	//Creating Objects of methods within RBI i.e. initialization of objects
//	acc=new Vijaya();
//	acc.SavingAccount();
//	acc.CurrentAccount();
//	acc.CreditCard();
//	acc.DebitCard();
//	
//	acc=new HDFC();
//	acc.SavingAccount();
//	acc.CurrentAccount();
//	acc.CreditCard();
//	acc.DebitCard();
//	
//	acc=new ICICI();
//	acc.SavingAccount();
//	acc.CurrentAccount();
//	acc.CreditCard();
//	acc.DebitCard();
		
		Customer obj=new Customer();
		obj.CreateAccount("HDFC");
		obj.CreateAccount("ICICI");
		obj.CreateAccount("Vijaya");
	}
	
	public void CreateAccount(String BankName)
	{
		//As we are doing conditional check we have to initialize the reference obj with null so that when there is no data/bank name (or condition fails) it will show result as null
		//Global variable are initialized STring =null; int-0; and Obj=null
		RBI acc=null;
		
		if (BankName.equals("Vijaya"))
				{acc=new Vijaya();}
		
				else if(BankName.equals("ICICI"))
				{acc=new ICICI();}
		
				else if(BankName.equals("HDFC"))
				{acc=new HDFC();}
		
		acc.SavingAccount();
		acc.CurrentAccount();
		acc.CreditCard();
		acc.DebitCard();	
	}
}
