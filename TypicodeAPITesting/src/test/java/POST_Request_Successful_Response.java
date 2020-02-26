import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class POST_Request_Successful_Response {
	
	@Test
	void SuccessfulResponse() {
		
		RestAssured.baseURI="https://jsonplaceholder.typicode.com/users";
		RequestSpecification httprequest=RestAssured.given();
		
		//Request payload
		JSONObject requestParams=new JSONObject();
		requestParams.put("name", "Ervin Howell");
		requestParams.put("username","Ervin Antonette");
		requestParams.put("email", "Shanna@melissa.tv");
		
		httprequest.header("Content-Type", "application/json");
		
		httprequest.body(requestParams.toJSONString());
		
		Response response=httprequest.request(Method.POST, "/2");
		String responseBody=response.getBody().asString();
		System.out.println("Body is:" + responseBody);
		
		int statusCode=response.getStatusCode();
		System.out.println("Status code is:" + statusCode);
		Assert.assertEquals(statusCode, 404);
	}	
}
