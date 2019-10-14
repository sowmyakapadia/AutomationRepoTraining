package exceptionhandling;

//Throws helps pass value/information to next user
public class ThrowandThrowskeyword {
	public static void main(String[] args) throws Exception {
		System.out.println("Step1");
		pause(-3000);

		System.out.println("Step2");

	}

public static void pause(long miliSeconds) throws Exception
{
	if(miliSeconds>=0)		
		{
//	hower mouse and add throws declartion
	Thread.sleep(miliSeconds);
		}
		else
		{
			throwException("Please enter positive value");
}}

	public static void throwException(String message) throws Exception {
		// we use throw keyword to throw exception intentionally
		// Exception is a superclass of exception to show
		throw new Exception(message);

	}
}
