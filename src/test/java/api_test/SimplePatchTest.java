package api_test;

import com.github.javafaker.Faker;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SimplePatchTest extends BaseAPIClass {
    @Test
    public void updateNewUser() {
        RestAssured.baseURI = "https://reqres.in/api/users";

        RequestSpecification httpRequest = RestAssured.given();

        Faker faker = new Faker();
        String job = faker.job().title();
        LOGGER.debug("Job is: " + job);

        JSONObject reqBody = new JSONObject();
        reqBody.put("job", job);

        httpRequest.header("Content-Type", "application/json");
        httpRequest.body(reqBody.toJSONString());

        String id = "2";
        Response response = httpRequest.request(Method.PATCH, id);
        LOGGER.debug(response.getBody().asString());

        Assert.assertEquals(response.getStatusCode(), 200);

        JsonPath jsonPath = response.jsonPath();
        String actualJob= jsonPath.getString("job");

        Assert.assertEquals(actualJob, job);
    }
}
