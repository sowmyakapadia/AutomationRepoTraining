package Constructor;

public class Car {
//	initialization instance variable
	String model;
	String color;
	String type;
	
//	constructor should be same as class name 
//	this is default constructor
	public Car()
	{
		
	}
//	Constructor overloading where you are creating local variable
//	when instance variable"String=model" is same as local variable we use "this" to identify instance variable 
public Car(String model, String color, String type)
	{
	this.model=model;	
	this.color=color;
	this.type=type;
	}

	public void specification(){
		System.out.println("The "+color+" "+model+" in "+ type);
	}

}
