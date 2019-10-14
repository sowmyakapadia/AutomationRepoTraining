package Constructor;

public class User {
	public static void main(String[] args) {
//		Creating object of car class
		Car car1=new Car();
//		initialising varaibles
		car1.color="Red";
		car1.model="Sedan";
		car1.type="Automatic";
//		calling method specification from car class
		car1.specification();

		Car car2=new Car();
		
		car2.color="Blue";
		car2.model="SUV";
		car2.type="Manual";
		car2.specification();

		Car car3=new Car();
		
		car3.color="Black";
		car3.model="Hachback";
		car3.type="Hybrid";
		car3.specification();
		
//		Here we can see two option for car after new one construction and other default
		
		Car car4= new Car("Sedan","Pink","Manual");
		car4.specification();
//	Car car5= new Car(model, color, type)
	
	}

}
