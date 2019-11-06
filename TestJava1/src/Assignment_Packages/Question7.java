package Assignment_Packages;

public class Question7 {
	public static void main(String[] args) {
		int a=divide(4,2);
		System.out.println(a);
		int b=divide(4,0);

		System.out.println(b);

		}
		public static int divide(int a,int b) {
		int result = a/b;
		return result;
		}
}
