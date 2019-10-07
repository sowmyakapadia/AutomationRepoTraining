package functions;

public class Functions1 {

	public static void main(String[] args) 
	{
		//calling the Main sum function created below
		/*sum(12,20);		
		sum(30,34);*/
		int a=sum(10,20);
		int b=sum(30,40);
		System.out.println(a+b);
		

		//Calling nonstatic functions from class "NonStaticFunctions1"
		
		NonStaticFunction1 obj= new NonStaticFunction1();
		System.out.println(obj.sum(10,20));
							
	}
	
// creating a main function for summation
/*	public static void sum(int a, int b)
	{
		int sum=a+b;
		System.out.println(sum);
				
	}*/
	
	//USe return function for summation called in void main class adding sum of two summations
	//Created static function Sum
	public static int sum (int a, int b)
	{
		int sum=a+b;
		return sum;
	
	}	
}
	/*int a=10;
	int b=20;
	
	int sum=a+b;	
	System.out.println(sum); 
}
}*/
