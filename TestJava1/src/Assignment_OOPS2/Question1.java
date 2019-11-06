package Assignment_OOPS2;

public class Question1 {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		System.out.println(a.x);
//As "A" is a parent class and "B" is child class, the properties of parent class is 
//inherited by child and not vice-versa. Hence when error is displayed when variable "y"
//initialized in B is called by class "A".		
		System.out.println(a.y);
		System.out.println(b.x);
		System.out.println(b.y);
		}
			}
		class A{

		String x="Parent";
		}

		class B extends A{
		String y="Child";
}