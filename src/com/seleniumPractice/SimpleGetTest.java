package com.seleniumPractice;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.json.*;

import javax.xml.ws.RespectBinding;
import java.util.List;
import java.util.Map;

//Example of Get request
//public class SimpleGetTest {

//    @Test
//    public void GetWeatherDetails() {

// Specify the base URL to the RESTful web service
//        RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";


// Get the RequestSpecification of the request that you want to sent
// to the server. The server is specified by the BaseURI that we have
// specified in the above step. We need to use the given method of RestAssured Class to get reference for Request Specification
//        RequestSpecification httpRequest = RestAssured.given();

// Make a request to the server by specifying the method Type and the method URL.
// This will return the Response from the server. Store the response in a variable.
//        Response response = httpRequest.request(Method.GET, "/employees");


// Now let us print the body of the message to see what response
// we have recieved from the server
//        String responseBody = response.getBody().asString();
//        System.out.println("Response Body is =>  " + responseBody);
//

//        int statusCode = response.getStatusCode();
//
//        response.getStatusLine();
//
//        response.header("Content-Type");
//        response.header("Server");
//        response.header("Content-Encoding");
//
//
//        Assert.assertEquals(statusCode,200,"Correct Status code is not returned");


//
//        Headers allHeaders = response.headers();
//
//        // Iterate over all the Headers
//        for(Header header : allHeaders)
//        {
//            System.out.println("Key: " + header.getName() + " Value: " + header.getValue());
//        }
//
//
// Asserting if body contains a specific String
//        Assert.assertEquals(responseBody.toLowerCase().contains("fitzpatrik"),true, "Reponse body does not contains Fitzpatrick");
//
//
//        // Extracting a node from json response

//        JsonPath jsonPathEvaluator=response.jsonPath();
//        String data=jsonPathEvaluator.get("data[0].id");
//        System.out.println(data);
//        Assert.assertEquals(data,"1");
//
//


// Sending a query parameter
//        Response response1 = httpRequest.queryParam("q", "abc")
//                .queryParam("a", "sdsd")
//                .request(Method.GET, "sdsd");
//    }

//}
//
// POST request example
public class SimpleGetTest {

    @Test
    public void GetWeatherDetails() throws JSONException {
        // Specify the base URL to the RESTful web service
//        RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";
//
//
//        // Get the RequestSpecification of the request that you want to sent
//        // to the server. The server is specified by the BaseURI that we have
//        // specified in the above step.
//        RequestSpecification httpRequest = RestAssured.given();
//
//        String payload="{\"name\":\"test\",\"salary\":\"123\",\"age\":\"23\"}";
//
//        // Make a request to the server by specifying the method Type and the method URL.
//        // This will return the Response from the server. Store the response in a variable.
//        Response response = httpRequest
//                .header("Content-Type", "application/json")
//                .body(payload)
//                .post( "/create");
//
//        // Now let us print the body of the message to see what response
//        // we have recieved from the server
//        String responseBody = response.getBody().asString();
//        System.out.println("Response Body is =>  " + responseBody);
//
//        int statusCode=response.getStatusCode();

        String userID = "9b5f49ab-eea9-45f4-9d66-bcf56a531b85";
        String userName = "TOOLSQA-Test";
        String password = "Test@@123";
        String baseUrl = "https://bookstore.toolsqa.com";

        RestAssured.baseURI = baseUrl;
        RequestSpecification request = RestAssured.given();


        //Step - 1
        //Test will start from generating Token for Authorization
        request.header("Content-Type", "application/json");

        Response response = request.body("{ \"userName\":\"" + userName + "\", \"password\":\"" + password + "\"}")
                .post("/Account/v1/GenerateToken");

        Assert.assertEquals(response.getStatusCode(), 200);

        String jsonString = response.asString();
        Assert.assertTrue(jsonString.contains("token"));



        //This token will be used in later requests
        String token = JsonPath.from(jsonString).get("token");
        System.out.println(token);


        //Step - 2
        // Get Books - No Auth is required for this.
        response = request.get("/BookStore/v1/Books");

        Assert.assertEquals(response.getStatusCode(), 200);

        jsonString = response.asString();
        List<Map<String, String>> books = JsonPath.from(jsonString).get("books");
        Assert.assertTrue(books.size() > 0);

        //This bookId will be used in later requests, to add the book with respective isbn
        String bookId = books.get(0).get("isbn");

        System.out.println(bookId);

        //Step - 3
        // Add a book - with Auth
        //The token we had saved in the variable before from response in Step 1,
        //we will be passing in the headers for each of the succeeding request
        request.header("Authorization", "Bearer " + token)
                .header("Content-Type", "application/json");

        response = request.body("{ \"userId\": \"" + userID + "\", " +
                "\"collectionOfIsbns\": [ { \"isbn\": \"" + bookId + "\" } ]}")
                .post("/BookStore/v1/Books");

        Assert.assertEquals(201, response.getStatusCode());


//        //Step - 4
//        // Delete a book - with Auth
//        request.header("Authorization", "Bearer " + token)
//                .header("Content-Type", "application/json");
//
//        response = request.body("{ \"isbn\": \"" + bookId + "\", \"userId\": \"" + userID + "\"}")
//                .delete("/BookStore/v1/Book");
//
//        Assert.assertEquals(204, response.getStatusCode());
//
//        //Step - 5
//        // Get User
//        request.header("Authorization", "Bearer " + token)
//                .header("Content-Type", "application/json");
//
//        response = request.get("/Account/v1/User/" + userID);
//        Assert.assertEquals(200, response.getStatusCode());
//
//        jsonString = response.asString();
//        List<Map<String, String>> booksOfUser = JsonPath.from(jsonString).get("books");
//        Assert.assertEquals(0, booksOfUser.size());
    }


}