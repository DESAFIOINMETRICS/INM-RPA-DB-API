package br.dummy.api.rest.example.configurations;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class RestConfiguration {

    private final String  URL = "http://dummy.restapiexample.com/api/v1/";

    private final RequestSpecification specification = RestAssured.given().baseUri(URL);

    public RequestSpecification getSpecification() {
        return specification;
    }
}