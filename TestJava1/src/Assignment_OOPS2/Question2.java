package Assignment_OOPS2;

public class Question2 {

public static void main(String[] args) {
C a = new C();
D b = new D();
a.parentMeth();

//Error msg is displayed as we have not created ChildMeth within Class C and 
//it is a parent class of D so it cannot call the "ChildMeth" defined with class D
a.ChildMeth();

//However as D is child class of C it can call its own method i.e "ChildMeth" and also
//the method created within parent class C i.e. "parentMeth".
b.parentMeth();
b.childMeth();

}
}
class C{
	public void parentMeth(){}
//	public void ChildMeth(){}
}


class D extends C{
	public void childMeth(){}
}
