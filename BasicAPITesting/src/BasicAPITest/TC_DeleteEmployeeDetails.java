package BasicAPITest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC_DeleteEmployeeDetails {
	@Test
	public void Test1()
	{
		//Step 2: Verify new record exist
//		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1/employee/"+id;
//Delete +id and insert the id to be searched within "" to show you the employee details
		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1/delete/71721";
			RequestSpecification request = RestAssured.given();
			request.header("Content-Type", "application/json");
//			import restassured.response option
			Response response = request.request(Method.DELETE);
			int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		System.out.println(response.asString());
	}


}
