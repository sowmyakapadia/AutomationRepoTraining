package Assignment_Packages;

public class Question8 {
	public static void main(String[] args) {
		int a=divide(4,2);
		System.out.println(a);
		int b=divide(4,0);
		System.out.println(b);
		}
		public static int divide(int a,int b) {
		int result=0;
		try{
		result = a/b;
		}catch(Exception e){
		e.printStackTrace();
		}
		return result;
		}
}
