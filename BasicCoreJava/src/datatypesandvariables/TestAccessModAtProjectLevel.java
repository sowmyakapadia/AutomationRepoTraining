package datatypesandvariables;

//When we are calling a function  from different pakacage import function in required
import functions.AccessModifiers;

//Extend function is to call function from parent class

public class TestAccessModAtProjectLevel extends AccessModifiers {

	public static void main(String[] args)
	{
		
	 AccessModifiers obj= new AccessModifiers();
	 obj.publicFunction();
	 
	 //Initialization of obj2 for protected function
	 TestAccessModAtProjectLevel obj2 = new TestAccessModAtProjectLevel();
	 obj2.protectedFunction();
	 
	 

	}

}
