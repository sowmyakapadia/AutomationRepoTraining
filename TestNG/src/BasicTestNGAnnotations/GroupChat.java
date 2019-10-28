package BasicTestNGAnnotations;

import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GroupChat {
	
	@BeforeTest
	public void beforeChatModule(){
		System.out.println("Contacts should be loaded - Before Test");
		System.out.println();
	}
	
	@AfterTest
	public void afterChatModule(){
		System.out.println("After Chat Module - After Test");
		System.out.println("**************");
	}
		
	@BeforeClass
	public void beforeClass(){
		System.out.println("Precondition for Create group - Before Class");
		System.out.println();
	}
	
	@AfterClass
	public void afterClass(){
		System.out.println("Post Condition for Delete group - After Class");
	}
//	the annotations @BeforeMthod has to be imported by hovering mouse over"@BeforeMethod" and "@AfterMethod"
	@BeforeMethod
	public void preConditionForTestcase(){
		System.out.println("Keypad should be enabled - Before Method");
//		This syso will give space when showing 
		System.out.println();
	}
	
	@AfterMethod
	public void postConditionForTestcase(){
		System.out.println("Keypad should be disabled - After Method");
		
	}
	
//	This annotation "@Test" will give option first to add TestNG library and then import Test NG option
//@Test annotations must be written before every test case i.e. public void test1,test2,test3
//the logic of calling functions is written in annotations i.e. the functions are executed without main function
	@Test
public void test1(){
//	System.out.println("Group Chat Test Case 1");
//	The "throw new SkipException" will skip this test case. When you run the "testng.xml" file you will see an x before the test case
		throw new SkipException("Group Chat Test Case 1 exception");
}
	@Test
	public void test2(){
		System.out.println("Group Chat Test Case 2");
		System.out.println(10/0);
	}
	@Test
	public void test3(){
		System.out.println("Group Chat Test Case 3");
	}
}
