package Assignment_OOPS2;

public class Question5 {

	public static void main(String[] args) {
		A a1 = new B();
		a1.meth1();
		a1.meth2();
		a1.meth3();
		
//As this method is not created within Interface A we cannot call this method using reference
//of a1 as 		
		a1.meth4();
		}
		}
		interface A
		{
		public void meth1();
		public void meth2();
		public void meth3();
		}
class B implements A{

		public void meth1() 
		{
		System.out.println("meth1");
		}
		public void meth2()
		{
		System.out.println("meth2");
		}
		public void meth3() 
		{
		System.out.println("meth3");
		}
		public void meth4() 
		{
		System.out.println("meth4");
		}
	}


