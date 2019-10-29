package Assignment1;

public class Question15 {

	public static void main(String[] args) {
		int a[][] = new int[10][5];
		for(int i=0;i<10;i++){
			for(int j=0; j<5; j++){
		a[i][j]=i*j;
		}
		}
		System.out.println(a[0][0]);
		System.out.println(a[1][3]);
		System.out.println(a[3][2]);
		System.out.println(a[3][3]);
		System.out.println(a[3][4]);
		System.out.println(a[4][2]);
//The below will show exception "ArrayOutOfBounds"		
//		System.out.println(a[4][5]);
//		System.out.println(a[10][2]);
		}
	}


