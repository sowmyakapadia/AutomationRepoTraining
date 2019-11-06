package Assignment_Packages;

public class Question1 {
	public static void main(String[] args) {

		try
		{
		int o[] = new int[2];
		o[4]=23;
		}catch(Exception e)
		{
		System.out.println(e.getMessage());
		
		e.printStackTrace();
		}
}
}
//Unchecked error message is "java.lang.ArrayIndexOutOfBoundsException: 3" is printed
//printStackTrace prints the value that caused the exception 