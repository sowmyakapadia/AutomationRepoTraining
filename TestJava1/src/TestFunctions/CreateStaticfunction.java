package TestFunctions;

public class CreateStaticfunction {

public static void main(String[] args) {
//	Created static method for Simple Interest
	int P=2500;
	int R=2;
	int N=4;
	
	System.out.println(P*R*N/100);
 
//	calling non static function for calculating Simple Interest from class "CreateNonStatic"
	CreateNonStatic obj=new CreateNonStatic();
	System.out.println(obj.SimpleInterest(6000, 4, 5));
	}

public static int SI(int P, int R, int N) {
	int SI = P*R*N/100;
	return SI;
}
}		

