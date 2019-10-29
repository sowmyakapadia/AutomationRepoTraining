package Assignment1;

public class Question9 {
//Find the least number in the array
	public static void main(String[] args) {
		Integer[] num=new Integer[5];
		num[0]=20;
		num[1]=21;
		num[2]=30;
		num[3]=4;
		num[4]=19;
//initializing max value as array's first value	i.e. [0]	
		int max=num[0];
				
//iterate array using for loop
		for (int i = 0; i < num.length; i++) {
//condition to compare current value of array with max value. 
//If max value is greater than current array value then assign array current value as max			
			if (max>num[i]) 
			{
				max=num[i];
			}
		         }
//Continue loop to reassign 'max' with array value that is less than itself.		
for (int i = 0; i < num.length; i++) {
	System.out.println(num[i]);
	}
System.out.println("The least element in the array is "+max);


	}

}
