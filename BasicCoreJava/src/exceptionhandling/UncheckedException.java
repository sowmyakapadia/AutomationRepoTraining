package exceptionhandling;

//all exceptions that are not checked by compiler are known as Unchecked Exception"
import oops.abstraction.ICICI;

public class UncheckedException {
//	uninitalised reference, it can be initialised by writing static ICICI bank=new ICICI
	static ICICI bank;
	
	public static void main(String[] args) 
	{
//	example 1 = ArithmeticException:
		System.out.println(10/1);
		
//		example 2 = ArrayIndexOutOfBoundsException:
		String[] arr=new String[2];
		arr[0]="Anand";
		arr[1]="Sowmya";
//		arr[2]="abdn";
		
//		example 3= NullPointerException when reference is point to null
		bank.CreditCard();
		
	}
	

}
