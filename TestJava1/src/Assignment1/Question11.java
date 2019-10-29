package Assignment1;
//Find the output
public class Question11 {
//The initialization of “int i=2” has no impact on the calculation
//We assigned f1 a value of 2 and create a method/class for "f1”
//in f1 class we create a method f2(i+1). Here the value of i=1 i.e.   f2(1+1)=2
//In the class f2 we create a method f3(i+2), now the value of 1=2 i.e.f3(2+2)=4
//In the class f3 the value of i=4 hence the system.out.println(i+3) is  (4+3)=7
//Hence the output is 7 and will change each time the value of f1() within main class
//is changed. 

	public static void main(String[] args) {
		int i=2;
		f1(1);
		}
//Method created for f1
		public static void f1(int i)
		{
		f2(i+1);
		}
//Method created for f2
		public static void f2(int i)
		{
		f3(i+2);	
		}
//Method created for f3
		public static void f3(int i)
		{
		System.out.println(i+3);
	}

}
