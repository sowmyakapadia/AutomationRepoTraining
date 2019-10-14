package exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {
//	throws keyword is to pass the info of checked exception to next user. It just suggests to user that exception will be there if executed
//	example 1 = Interrupted exception 
//	example 2 = FileNot found exception
	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		System.out.println("Step1");
//		this is a static method is used when a program needs to be paused between execution which will give checked exception and two solution. Step1 select throws option
		Thread.sleep(20000);
		
		System.out.println("Step2");
		
//		Import FileInputStream as it is not a part of package "exceptionhandling">src>Basic Java
		FileInputStream file=new FileInputStream("");
	}

}
