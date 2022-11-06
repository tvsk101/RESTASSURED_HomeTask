package example;

import io.restassured.http.ContentType;
import model.UserRequestModel;
import model.NewUserRequestModelWithTimeAndId;

import static io.restassured.RestAssured.given;

public class ApiUser {

    public NewUserRequestModelWithTimeAndId createUser(UserRequestModel model) {
        return given()
                .baseUri("https://reqres.in/")
                .contentType(ContentType.JSON)
                .body(model)
                .post("api/users")
                .then()
                .statusCode(201)
                .log().all()
                .extract().response().as(NewUserRequestModelWithTimeAndId.class);
    }

}
