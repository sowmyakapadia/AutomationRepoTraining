package functions;

public class MethodOverLoading {
	
	public static void main(String[] args) {
		MethodOverLoading obj = new MethodOverLoading();
		obj.sum(10,20);

	}

	public  void sum(int a, int b)	
	{
		
	System.out.println(a+b);

	}
			
	//To keep same function name you need to change parameters as shown below
	public  void sum(int a, int b, int c)	
	{
		
	System.out.println(a+b+c);

	}
	
	
}
