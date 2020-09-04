package br.dummy.api.rest.example.rest;

import br.dummy.api.rest.example.configurations.RestConfiguration;
import io.restassured.response.Response;

public class EmployeesRest {

    public Response get() {
        System.out.println("[DEBUG] EmployeesRest.get(): doing request");
        Response response = new RestConfiguration().getSpecification().get("employees");
        String statusCode = String.valueOf(response.getStatusCode());
        System.out.println("[DEBUG] EmployeesRest.get(): statuscode ".concat(statusCode));
        System.out.println("[DEBUG] EmployeesRest.get(): body - ".concat(response.getBody().asString()));
        return response;
    }
}