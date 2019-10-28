package TestOopsInheritance;

public class TestMathCalculations {
	public static void main(String[] args) {
		TestAddSubandMultiply Math=new TestAddSubandMultiply();
//Method overriding called from Class TestAddition
		Math.AddCal();
//Method overloading called from Call TestAddandSub
//		Math.AddCal();
		Math.Sub();
		Math.Multiply();
		
		TestAddition Math2=new TestAddition();
		Math2.AddCal();
		TestAddandSub Math3=new TestAddandSub();
		Math3.AddCal();
	}

}
