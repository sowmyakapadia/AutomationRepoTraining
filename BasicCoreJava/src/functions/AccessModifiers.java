package functions;


//creating functions with different types of access modifiers
	// you must deleted main class before defining other functions. 
	//You cannot define a different access modifiers within main class

public class AccessModifiers 
{
	//main funtion short cut "crtl+space"
	
	public static void main(String[] args) {
		AccessModifiers obj=new AccessModifiers();
		
		obj.publicFunction();
		obj.privateFunction();
		obj.protectedFunction();
		obj.noaccessModfunction();
	}

		//It has range/accessed throughout the project
		public void publicFunction()
		{
			System.out.println("Public Function");
		}
//Access limited to class
		private void privateFunction()
		{
			System.out.println("Private Function");
		}
		
		//Access only within package & using child class can be accessed throughout project
		protected void protectedFunction()
		{
			System.out.println("Protected Function");
		}
		// Within the package only
		void noaccessModfunction()
		{
			System.out.println("No Access Modifier function");
		
		}
	

}
