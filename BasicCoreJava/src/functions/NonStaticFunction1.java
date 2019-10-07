package functions;

public class NonStaticFunction1 {

	public static void main(String[] args)
	
	//Non static function created sum
	
	{
		NonStaticFunction1 obj= new NonStaticFunction1();
		int add=obj.sum(10,20);
		System.out.println(add);
		
		//Calling Static funtion Sum from static function "Functions1"
		Functions1.sum(10, 20);
	}
	
	public int sum(int a, int b)
	{
	return a+b;
}

}
