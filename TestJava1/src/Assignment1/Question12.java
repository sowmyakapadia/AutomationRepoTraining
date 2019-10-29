package Assignment1;

public class Question12 {
//The return function will keep incrementing the x value till it satisfies the if condition
//so when x>10 the program will exit. The output will be 1 to 11
	public static void main(String[] args) {
		int x=0;
		while(true){
		x = increment(x);
		
System.out.println("The value of x: "+x);
 if (x>10) {
	break;
}
	}
}
	private static int increment(int x) {
		return x+1;
	}

		}


