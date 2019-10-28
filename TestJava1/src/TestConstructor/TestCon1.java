package TestConstructor;

public class TestCon1 {
	String name;
	String education;
	int age;
	
	public TestCon1 (String name, String education, int age){
		this.name=name;
		this.education=education;
		this.age=age;
		}
public TestCon1() {
		
	}
public void message(){
	System.out.println("My name is "+name);
	System.out.println("My Edu Qualification is "+education);
	System.out.println("I am "+age+" years old");
}
		
}
