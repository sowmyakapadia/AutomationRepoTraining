package Assignment1;

public class Question8 {
//Find the greatest number in a array
	public static void main(String[] args) {
		Integer[] num=new Integer[5];
		num[0]=20;
		num[1]=21;
		num[2]=30;
		num[3]=34;
		num[4]=19;
//initializing max value as array's first value	i.e. [0]	
		int max=num[0];
				
//iterate array using for loop
		for (int i = 0; i < num.length; i++) {
//condition to compare current value of array with max value. 
//If max value is less than current array value then assign array current value as max			
			if (max<num[i]) 
			{
				max=num[i];
			}
		         }
//Continue loop to reassign 'max' with array value that is greater than itself.		
for (int i = 0; i < num.length; i++) {
	System.out.println(num[i]);
	}
System.out.println("The greatest element in the array is "+max);
	}

}
