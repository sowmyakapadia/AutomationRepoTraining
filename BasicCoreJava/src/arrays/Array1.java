package arrays;

public class Array1 {

	public static void main(String[] args)
	{
		String[] str=new String[13];
		
		str[0]="Pramila";
		str[1]="srihti";
		str[2]="Aniket";
		str[3]="Ganesh";
		str[4]="Jaywant";
		str[5]="Nikhil";
		str[6]="Aesha";
		str[7]="Sowmya";
		str[8]="Pratik";
		str[9]="Seema";
		str[10]="jyoti";
		str[11]="prajot";
		str[12]="ashutosh";
		
		//Printing one specific data
		
		System.out.println(str[4]);
		
		//printing an array of data using for loop
		//std.length will help you run arrays without having to initialize a number. One you have defined the length of array it will run till it reached the last no i.e."new string=13"
		
		for(int i=0; i<str.length; i++)
		{
			System.out.println(str[i]);
		}
		
		/*System.out.println(str.length);*/
		
		//Same result as we get for the syntax where we initialize i=0;i<13;i++
		//This is called as "Enhanced for loop" where we cannot set any limit as compared to previous for loop initialised using i
		
		/*for(String s:str)
		{
			System.out.println(s);
		}*/
		// TODO Auto-generated method stub

	}

}
