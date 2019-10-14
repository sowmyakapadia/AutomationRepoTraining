package exceptionhandling;

import oops.abstraction.ICICI;

public class ExceptionHandling1 {
	
	static ICICI bank;
	
public static void main(String[] args) 
{
	try
{
//		example 1 = ArithmeticException:
			System.out.println(10/0);		
}
catch(ArithmeticException e)
	{
	System.out.println(e.getMessage());
}
//	
		try
		{
//			example 2 = ArrayIndexOutOfBoundsException:
				String[] arr=new String[2];
				arr[0]="Anand";
				arr[1]="Sowmya";
//				arr[2]="abdn";
		}
		catch(ArrayStoreException e)
		{
			System.out.println(e.getMessage());
		}
//		
		try{
//		example 3= NullPointerException when reference is point to null
		bank.CreditCard();
		}
		catch(NullPointerException e)
		{
			System.out.println(e.getMessage());
		}
		}
}

