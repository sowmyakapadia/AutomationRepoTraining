package BasicAPITest;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC_CreateRecord {
	
	@Test
	public void Test1()
	{
//		End point address
		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1/create";
		
//		This is equal to body and header in postman
		RequestSpecification request = RestAssured.given();
		JSONObject requestParams = new JSONObject();
		requestParams.put("name", "Skapadia");
		requestParams.put("salary", "99999");
		requestParams.put("age", "39");
		request.header("Content-Type", "application/json");
		// Add the Json to the body of the request
		request.body(requestParams.toJSONString());
		
		// Post the request and check the response = Send on Postman
		Response response = request.request(Method.POST);
		
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		System.out.println(response.asString());
		
		JsonPath jsonPathEvaluator = response.jsonPath();
		String id = jsonPathEvaluator.get("id");
		
		System.out.println(id);
		
		
		
	}

}
