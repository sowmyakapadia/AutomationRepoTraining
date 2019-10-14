package datatypesandvariables;

public class testconditionalstmt1 {
public static void main(String[] args) {
	
	int sal1=15000;
	int sal2=3000;
	int sal3=8000;
	int sal4=1000;
	
	String name1="Mr A";
	String name2="Mr B";
	String name3="Mr C";
	String name4="Mr D";
	
	if (sal1>sal3 && sal1> sal2 && sal1>sal4) {System.out.println(name1+" has the highest salary");} 
	else {System.out.println(name1+" does not have the highest salary");}
	
	if (sal2>sal1 && sal2>sal3 && sal2>sal4) {System.out.println(name2+" has the highest salary");}
	else{System.out.println(name2+" does not have highest salary");}
		
	if (sal3>sal1 && sal3>sal2 && sal3>sal4) {System.out.println(name3+" has the highest salary");}
	else{System.out.println(name3+" does not have highest salary");}
	
	if (sal4>sal1 && sal4>sal2 && sal4>sal3) {System.out.println(name4+" has the highest salary");}
	else {System.out.println(name4+" does not have the highest salart");}
	
	
		}
}	



		
