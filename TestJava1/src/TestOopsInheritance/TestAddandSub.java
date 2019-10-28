package TestOopsInheritance;

public class TestAddandSub extends TestAddition
{
	public void Sub()
	{
		System.out.println("This function helps in Subtraction");
	}
	// this is method overriding
	public void AddCal(){
		System.out.println("This is a Addition function within Subtraction Class");
	}
	// this is method overloading
//	public void AddCal(String Str){
//		String S= "str";
//		System.out.println(Str);
//		System.out.println("This is a overloading addition function within Subtraction Class");
//	}
	
}
