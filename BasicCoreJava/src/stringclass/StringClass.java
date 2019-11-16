package stringclass;

public class StringClass {

	public static void main(String[] args) {
		String name="Nov 15, 2019";
		String name1="Nov 16, 2019";
		String name2=" nov 15, 2019";
//Length function will give the lenght of the string
		System.out.println(name.length());

//CharAt. will show the character at the index specified
		System.out.println(name.charAt(3));
		
//SubString
		System.out.println(name.substring(8));
		System.out.println(name.substring(0, 3));
		
//Split
		String[] arr=name.split(" ");
		for(String ar:arr)
		{
			System.out.println(ar);
		}
		
//Equals will consider space. So same content with space will return false
		System.out.println(name.equals(name1));
		
//EqualsIgnoreCase- ignores case sensitive
		System.out.println(name.equals(name2));
		
//TRim= removes white spaces at the begining and end of a string
		System.out.println(name2);
		System.out.println(name2.trim());
		
//Replace the comma with no space for name String
		System.out.println(name.replace(",", ""));
		
//Checks for a particular char in string
		System.out.println(name.contains("15"));
		
//toUpperCase
		System.out.println(name.toUpperCase());
		
//toLowerCase
		System.out.println(name1.toLowerCase());
		
		
	}

}
