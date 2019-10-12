package oops.abstraction;

public class User {
public static void main(String[] args)
{
	//here we are calling the abstract class Sprint3 in User Class
	MSWord msw=new Sprint3();
	msw.save();
	msw.edit();
	msw.delete();
	msw.print();
	msw.insert();
	msw.copy();
	
	//Objects of abstract class cannot be created because the methods are incomplete
//	new Sprint1()
	
	
}
}
