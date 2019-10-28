package Assignment1;

public class Question4 {

	public static void main(String[] args) 
	{ 
//using for loop to print sum of first 100 numbers
	int num =100, count =1, sum =0;
//Add AND assignment operator adds the right operand to left and 
//assigns the result to the left. example: C+=A is same as C=C+A
	for(count=1; count <=num; count++)
	sum += count;
	{
	System.out.println("Sum of first 100 numbers is : " +sum);
	}
	
	
//Using while loop
//	while (count<=num) {
//		sum =sum+count; count++;
//		}
//		System.out.println("Sum of first 100 numbers is : " +sum);

	}

}
