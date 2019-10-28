package BasicTestNGAnnotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

	public class VideoStatus {
		@BeforeClass
		public void beforeClass(){
			System.out.println("Precondition for Video Status");
			System.out.println();
		}
		
		@AfterClass
		public void afterClass(){
			System.out.println("Postcondition for Video Status");
		}
//		the annotations @BeforeMthod has to be imported by hovering mouse over"@BeforeMethod" and "@AfterMethod"
		@BeforeMethod
		
		public void preConditionForTestcase(){
			System.out.println("Keypad should be enabled");
//			This syso will give space when showing 
			System.out.println();
		}
		
		@AfterMethod
		public void postConditionForTestcase(){
			System.out.println("Keypad should be disabled");
		}
		
//		This annotation "@Test" will give option first to add Test NS library and then import Test NG option
	//the logic of calling functions is written in annotations i.e. the functions are executed without main function
		@Test
	public void test1(){
		System.out.println("Video Status Test Case 1");
	}
		@Test
		public void test2(){
			System.out.println("Video Status Test Case 2");
		}
		@Test
		public void test3(){
			System.out.println("Video Status Test Case 3");
		}
	}
