package Assignment1;

public class Question14 {

	public static void main(String[] args) {
		int i=2;
		while (makeDecision(i)) {
		i=i*i;
		System.out.println(i);
		}

	}

	private static boolean makeDecision(int i) {
		if(i%3!=0);{
		return true;
		}else{
		return false;}
	}
}}

