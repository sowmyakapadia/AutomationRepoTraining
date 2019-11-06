package Assignment_Packages;

public class Question2 {
	public static void main(String[] args) {
//		int o[] = new int[2];
		try{
//As the variable o has been initialized within try instead of main class
//we get checked error that "o" cannot be resolved as a variable is system.out.println(o[1])			
		int o[] = new int[2];
		o[3]=23;
		o[1]=33;
		}catch(Exception e){
		System.out.println(e.getMessage());
		e.printStackTrace();
		}

		System.out.println(o[1]);
		}
}
