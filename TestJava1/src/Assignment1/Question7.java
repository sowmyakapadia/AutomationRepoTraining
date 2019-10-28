package Assignment1;

public class Question7 {
//Print alternate elements of String array 
	public static void main(String[] args) {
		String[] str=new String [9];
		str[0]="Name1";
		str[1]="Name2";
		str[2]="Name3";
		str[3]="Name4";
		str[4]="Name5";
		str[5]="Name6";
		str[6]="Name7";
		str[7]="Name8";
		str[8]="Name9";		
		
for (int i = 0; i < str.length; i+=2) {
	
	System.out.println(str[i]);
	
}

	}

}
