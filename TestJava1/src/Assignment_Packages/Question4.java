package Assignment_Packages;

public class Question4 {
	public static void main(String[] args) {
//To create an object of a class the class must be created.
//Here we have not created class by the name SomeClass hence we get 
//error "SomeClass cannot be resolved to a type" and after running the
//program we get "Unresolved Compilation problem"		
		SomeClass obj=null;
		try{
		obj.somemethod();
		System.out.println("success");
		}catch(Exception e){
		System.out.println(e.getMessage());
		e.printStackTrace();
		}
	}

}