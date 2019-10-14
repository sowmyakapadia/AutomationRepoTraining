package exceptionhandling;

import oops.abstraction.ICICI;

public class MultipleCatchBlocks {
	static ICICI bank;
	public static void main(String[] args) {
		try{	
	
//		example 1 = ArithmeticException:
			System.out.println(10/1);
			
//			example 2 = ArrayIndexOutOfBoundsException:
			String[] arr=new String[2];
			arr[0]="Anand";
			arr[1]="Sowmya";
			arr[2]="abdn";
			
//			example 3= NullPointerException when reference is point to null
			bank.CreditCard();
		}
		catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e.getMessage());
		}
		catch(NullPointerException e){
			System.out.println(e.getMessage());
//			Exception is super class of all exceptions and can handle all exceptions
//			we create this catch incase the code gives an exception other than Arithmetic,Outofbound or Null
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
//		finally is executed after try is positively executed and also in case of exception when catch block is executed
//		Finally is always executed at last after try and catch
		finally {
			System.out.println("Test case completed");
			System.out.println("DB conection closed");
			System.out.println("Report Ended");
			System.out.println("Object Flushed");
		}
	}
}
