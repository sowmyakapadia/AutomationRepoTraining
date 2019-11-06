package Assignment_Packages;

public class Question10 {
	public static void main(String[] args) {
		try{
		int a=divide(4,2);
		System.out.println(a);
		int b=divide(4,0);
		System.out.println(b);
		}catch(Exception e){
		System.out.println("error 1");
//Why is the msg Error1 not displayed in output whereas in Question14
//The system.out.println message within catch is displayed.		
		
		}
		}
		public static int divide(int a,int b) {
		int result=0;
		try{
		result=a/b;
		}catch(Exception e){
		System.out.println("error 2");
		}

		return result;
		}
}
