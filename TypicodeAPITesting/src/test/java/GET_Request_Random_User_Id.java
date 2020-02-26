import java.util.List;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.*;

public class GET_Request_Random_User_Id {
	
	@Test
	void getUserId() {
		
		RestAssured.baseURI="https://jsonplaceholder.typicode.com/users";
		RequestSpecification httprequest=RestAssured.given();
		Response response=httprequest.request(Method.GET, "/2");
		String responseBody=response.getBody().asString();
		System.out.println("Body is:" + responseBody);
		String email=response.path("email");
		System.out.println("Email is:" + email);
			
	}
	
	@Test
	void getUserPostsAndVerifyPostIDs() {
		
		RestAssured.baseURI="https://jsonplaceholder.typicode.com/users";
		RequestSpecification httprequest=RestAssured.given();
		Response response=httprequest.request(Method.GET, "/1/posts");
		List<String> postId = response.path("id");
		int postIds = (postId).size();
		assertThat(postIds, greaterThan(0));
		assertThat(postIds, lessThan(100));
		}
}