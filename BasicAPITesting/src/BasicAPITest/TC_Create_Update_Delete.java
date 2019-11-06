package BasicAPITest;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC_Create_Update_Delete {
	
	@Test
	public void test() {
		
		SoftAssert asser= new SoftAssert();
		
		//Step 1 Create new Record
		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1/create";
		RequestSpecification request = RestAssured.given();
		JSONObject requestParams = new JSONObject();
		requestParams.put("name", "salman terrekhan");
		requestParams.put("salary", "3244353");
		requestParams.put("age", "2456");
		request.header("Content-Type", "application/json");
		// Add the Json to the body of the request
		request.body(requestParams.toJSONString());
		// Post the request and check the response
		Response response = request.request(Method.POST);
		int statusCode = response.getStatusCode();
		
		//Validation
		asser.assertEquals(statusCode, 201);
		
		
		System.out.println(statusCode);
		System.out.println(response.asString());
		JsonPath jsonPathEvaluator = response.jsonPath();
		String id = jsonPathEvaluator.get("id");

		System.out.println("******************************************");
		//Step 2: Verify new record exist
		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1/employee/"+id;
		request = RestAssured.given();
		request.header("Content-Type", "application/json");
		response = request.request(Method.GET);
		statusCode = response.getStatusCode();
		
		//Validate my response code
		asser.assertEquals(response.statusCode(), 400);
		System.out.println(statusCode);
		System.out.println(response.asString());
		
		System.out.println("******************************************");
		//Step 3: Update the record
		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1/update/"+id;
		request = RestAssured.given();
		requestParams = new JSONObject();
		requestParams.put("name", "salman khan2");
		requestParams.put("salary", "325433");
		requestParams.put("age", "25");
		request.header("Content-Type", "application/json");
		// Add the Json to the body of the request
		request.body(requestParams.toJSONString());
		// Post the request and check the response
		response = request.request(Method.PUT);
		statusCode = response.getStatusCode();
		
		asser.assertEquals(statusCode, 500);
		System.out.println(statusCode);
		System.out.println(response.asString());
		
		System.out.println("******************************************");
		
		//Step 4: Verify 
		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1/employee/"+id;
		request = RestAssured.given();
		request.header("Content-Type", "application/json");
		response = request.request(Method.GET);
		statusCode = response.getStatusCode();
		
		asser.assertEquals(statusCode, 200);
		System.out.println(statusCode);
		System.out.println(response.asString());
		
		System.out.println("******************************************");
		
		//Step 5: Delete the record
		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1/delete/"+id;
		request = RestAssured.given();
		request.header("Content-Type", "application/json");
		response = request.request(Method.DELETE);
		statusCode = response.getStatusCode();
		
		asser.assertEquals(statusCode, 200);
		System.out.println(statusCode);
		System.out.println(response.asString());
		
		System.out.println("******************************************");
		
		//Step 6: Verify 
		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1/employee/"+id;
		request = RestAssured.given();
		request.header("Content-Type", "application/json");
		response = request.request(Method.GET);
		statusCode = response.getStatusCode();
		
		//Validate my response code
		asser.assertEquals(statusCode, 202);
		System.out.println(statusCode);
		System.out.println(response.asString());
		
		asser.assertAll();
	}
}
