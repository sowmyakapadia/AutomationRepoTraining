package TestFunctions;

public class CalcuateSimpleInterest {

	public static void main(String[] args) {
		String name="Sowmya";
		int a= 1000;//principal amt
		int b= 15;//ROI
		int c= 5;//Duration
		
		int SI=a*b*c/100;//Simple Int formula
		
		System.out.println("The Simple Interest for "+name+" is "+SI);

	}

}
