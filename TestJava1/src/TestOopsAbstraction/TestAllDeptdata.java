package TestOopsAbstraction;

public class TestAllDeptdata {
public static void main(String[] args) {
	TestAllDeptdata obj=new TestAllDeptdata();
	obj.StaffData("TestDevDept");
	obj.StaffData("TestOpsDept");
	obj.StaffData("TestQualityDept");
	
}
 public void StaffData(String DeptName){
	 TestBUHead data=null;
	  
	 if (DeptName.equals("TestDevDept")) 
	 {data=new TestDevDept();}
	 else if (DeptName.equals("TestOpsDept"))
	 {data=new TestOpsDept();}
	 else if (DeptName.equals("TestQualityDept")) 
	 {data=new TestQualityDept();}
	 
	 data.BellCurve();
	 data.Increment();
	 data.Promotion();
 }
}
