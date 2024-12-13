import io.restassured.RestAssured;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class UserTest {

    @Test
    public void UserCreate() {
        RestAssured.baseURI = "https://petstore.swagger.io";

        String bodyPayLoad = "{\n" +
                "  \"id\": 2sdgsj3,\n" +
                "  \"username\": \"busezmz\",\n" +
                "  \"firstName\": \"Buse\",\n" +
                "  \"lastName\": \"Azmaz\",\n" +
                "  \"email\": \"busezmz@outlook.com\",\n" +
                "  \"password\": \"Barbie123\",\n" +
                "  \"phone\": \"0544553535305346166279\",\n" +
                "  \"userStatus\": 1\n" +
                "}";

        Map<String, String> headersPayLoad = new HashMap<>();
        headersPayLoad.put("accept", "application/json");
        headersPayLoad.put("Content-Type", "application/json");

        RestAssured
                .given()
                .headers(headersPayLoad)
                .body(bodyPayLoad)
                .when()
                .post("/v2/user")
                .then()
                .statusCode(200);


    }

    @Test
    public void GetUserInfo() {
        UserCreate();
        RestAssured.baseURI = "https://petstore.swagger.io";

        Map<String, String> headersPayLoad = new HashMap<>();
        headersPayLoad.put("accept", "application/json");

        RestAssured
                .given()
                .headers(headersPayLoad)
                .when()
                .get("/v2/user/busezmz")
                .then()
                .statusCode(200);
    }

    @Test
    public void UserUpdate() {
        RestAssured.baseURI = "https://petstore.swagger.io";

        String bodyPayLoad = "{\n" +
                "  \"id\": 27352,\n" +
                "  \"username\": \"Busezm\",\n" +
                "  \"firstName\": \"Buse\",\n" +
                "  \"lastName\": \"Azmaz\",\n" +
                "  \"email\": \"busezmz@outlook.com\",\n" +
                "  \"password\": \"Barbie123\",\n" +
                "  \"phone\": \"05346166279\",\n" +
                "  \"userStatus\": 1\n" +
                "}";

        Map<String, String> headersPayLoad = new HashMap<>();
        headersPayLoad.put("accept", "application/json");
        headersPayLoad.put("Content-Type", "application/json");

        RestAssured
                .given()
                .headers(headersPayLoad)
                .body(bodyPayLoad)
                .when()
                .put("/v2/user/busezmz")
                .then()
                .statusCode(200);
    }

    @Test
    public void UserDelete() {
        UserCreate();
        RestAssured.baseURI = "https://petstore.swagger.io";

        Map<String, String> headersPayLoad = new HashMap<>();
        headersPayLoad.put("accept", "application/json");

        RestAssured
                .given()
                .headers(headersPayLoad)
                .when()
                .delete("/v2/user/busezmz")
                .then()
                .statusCode(200);
    }
}
