package functions;

public class TestAccessModAtPackageLevel {

	public static void main(String[] args) 
	{
		
	AccessModifiers obj=new AccessModifiers();
	
	obj.publicFunction();
	obj.protectedFunction();
	obj.noaccessModfunction();
	//Cant call private function as its outside the class "AccessModifiers"
	
	}

}
