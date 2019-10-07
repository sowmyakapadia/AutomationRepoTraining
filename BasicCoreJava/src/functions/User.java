package functions;

//calling variables from different class
public class User {

	public static void main(String[] args) 
	{

Car car1=new Car();
car1.brand="Maruti";
car1.Wheel=4;
car1.color="Red";
car1.model="Suv";
car1.powerSteering();
car1.lookandfeel();
 

Car car2=new Car();
//car2.brand="Mahindra";
//car2.Wheel=4;
car2.color="Blue";
car2.model="Sports";
car2.powerSteering();
car2.lookandfeel();


	}

}
