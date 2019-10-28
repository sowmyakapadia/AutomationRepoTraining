package TestOopsEncapsulation;

public class TestEncap1 {
	private String name;
	private int age;
//	to create getters and setters right click>Source>Generate Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
public void TestEN() {
	System.out.println("My name is "+name+" and I'am "+age+" years old");

}
}
