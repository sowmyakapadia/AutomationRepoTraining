package oops.interhitence;

public class User {
public static void main(String[] args) {
	
	//object      =  reference
		SmartPhone phone=new SmartPhone();
	
	//multilevel inheritance
	//User is calling the class Smartphone and all its properties
	//
	phone.internet();
	phone.calling();
	phone.texting();
//	String str="Testing overloading of method calling";//this is the value that will be passed to str initialised in Mobile Class
//	phone.calling(str);
	
	Telephone phone2=new Telephone();
	phone2.calling();
	
	//Phone 2 is reference of Telephone (parent class) and object of child class (Mobile)
	//only parent class functions are called i.e. only calling function within Telephone class
	//Parent Object = Child class reference
	phone2=new Mobile();
	
	//When parent class reference is given to child class object then always child class function is called
	//Dynamic polymorphism or run time binding or method overriding
	phone2.calling();
	
}
}
