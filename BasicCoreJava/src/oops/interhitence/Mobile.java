package oops.interhitence;

//Mobile class has class inheritance i.e. it inherits properties of Telephone
// Mobile is child class and Telephone is parent class
//Child class, sub class, or derived class
//The variable on left of extend is always child and to right is parent

public class Mobile extends Telephone {

	// also called methods

	// when parent and child classes have same methods i.e. same function and same arguments
	// its called "method overloading is equlivalent to "static polymorphysim"
	// calling method is present in Telephone
	// gives user to choose the method

	public void texting() {
		System.out.println("Texting from Mobile");
	}
	
	// the above is method overriding as same method as dynamic polumorphism, run tim binding
	// defined in Telephone class. In this when the method is called in User
	// class it will show only
	// 1 function calling()
	// when you want to make enhancement to existing function but want to keep
	// the existing one then overriding is used
	//child class and parent class have same method with same argument is called method overiding

	public void calling() {
		System.out.println("Calling from mobile");
	}

	// the below method overloading as arguments have been changed. We can see 2
	// functions when called in User class i.e. // calling() & calling(str)
	// public void calling(String str) {
	// //String s=str;
	// System.out.println(str); //This will print the value given for str in
	// User class
	// System.out.println("Calling from Mobile");
	// }

}
