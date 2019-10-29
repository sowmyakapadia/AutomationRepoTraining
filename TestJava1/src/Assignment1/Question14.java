package Assignment1;

public class Question14 {

	public static void main(String[] args) {
		String arr1[] = new String [3];
		String arr2[] = new String [3];

		arr1[0]="A";
		arr1[1]="B";
		arr1[2]="C";

		arr2[0]="1";
		arr2[1]="2";
		arr2[2]="3";
//The array will print output according to the method initialized in main class.
//For instance,if arr1 was initialized before arr2 then the output would have been ABC123.
		
//in this case as arr2 is initialized before arr1 the output will be 123ABC and as both arrays 
//have same method name the output will display values of both arrays.
		printAll(arr2);
		printAll(arr1);
		}
		public static void printAll(String str[]){
		for(int i=0; i < str.length ; i++){
		System.out.println(str[i]);
		}
	}
}
