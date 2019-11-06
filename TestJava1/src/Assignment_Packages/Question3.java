package Assignment_Packages;

public class Question3 {
	public static void main(String[] args) {
		int o[] = new int[2];

		try{
		o[3]=23;
		o[1]=33;
		}catch(Exception e){
		System.out.println(e.getMessage());
		e.printStackTrace();
		}
		System.out.println("2nd pos--"+o[1]);
	}
}
