package TestFunctions;

public class CreateNonStatic {

	public static void main(String[] args) {
		CreateNonStatic obj=new CreateNonStatic();
		int SI=obj.SimpleInterest(2000,3, 4);		
		System.out.println(SI);
		
//		Non Static functions cannot call Static functions created as they are used within the class
		CreateStaticfunction.SI(5000, 2, 5);
	}
	public int SimpleInterest (int P, int R, int N) {
		int SimpleInterest=(P*R*N/100);
		return SimpleInterest;
	}
			
}
