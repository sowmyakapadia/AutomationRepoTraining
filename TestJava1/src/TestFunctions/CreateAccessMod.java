package TestFunctions;

public class CreateAccessMod 
{
public static void main(String[] args) {
	CreateAccessMod obj=new CreateAccessMod();
	
	obj.pvtfunction();
	obj.pubfunction();
	obj.protectfunction();
	obj.noaccessfunction();
		
}
	private void pvtfunction() {
		System.out.println("Private function called");
	}		
	public void pubfunction() {
		System.out.println("Public function called");
	}
	protected void protectfunction() {
		System.out.println("Protected function called");
	} 
	void noaccessfunction(){
		System.out.println("No Access Modifier Called");
	}
	
	}
