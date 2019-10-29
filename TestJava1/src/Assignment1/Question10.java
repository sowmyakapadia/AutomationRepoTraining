package Assignment1;

public class Question10 {
//Write a program which prints which each number from array and the times it has been repeated in array
	public static void main(String[] args) {
		int[] arr = new int[]{1,2,3,4,5,6,3,78,3};
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[j]);
				}
			}
		}
		

}

}


