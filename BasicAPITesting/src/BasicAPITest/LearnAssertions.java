package BasicAPITest;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LearnAssertions {
	
	int a=10;
	int b=20;
	int c=30;
		
@Test
	public void Test1(){
	
//Hard Assertion
	System.out.println("Step 1");
	Assert.assertEquals(11, a);
	
	System.out.println("Step 2");
	Assert.assertEquals(20, b);
	
	System.out.println("Step 3");
	Assert.assertEquals(31, c);
}
@Test
public void Test2(){
	SoftAssert asr =new SoftAssert();
	
	System.out.println("Step 1");
	asr.assertEquals(11, a);

	System.out.println("Step 2");
	asr.assertEquals(20, b);
	
	System.out.println("Step 3");
	asr.assertEquals(30, c);
	
	 asr.assertAll();
}
}
