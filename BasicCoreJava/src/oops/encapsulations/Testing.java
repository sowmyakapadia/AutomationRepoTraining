package oops.encapsulations;

public class Testing {

	//creating global variable
	
	private int age; 
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
//		applying condition to prevent invalid data when run in Testing 2 
		if (age>0)
//		This helps initialise insatnce variable
		this.age = age;
	}
//creating methods
	public void test(){
		System.out.println("Your age is "+age);
	}
}
