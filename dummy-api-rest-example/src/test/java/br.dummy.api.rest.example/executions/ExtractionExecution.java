package br.dummy.api.rest.example.executions;

import br.dummy.api.rest.example.entities.EmployeesEntity;
import br.dummy.api.rest.example.rest.EmployeesRest;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import io.restassured.response.Response;

import java.lang.reflect.Type;
import java.util.List;

public class ExtractionExecution {

    public static void main(String[] args) {
        Response response = new EmployeesRest().get();
        List<EmployeesEntity> employeesList = extractEmployees(response);
        saveList(employeesList);
    }

    public static List<EmployeesEntity> extractEmployees(Response response) {
        System.out.println("[DEBUG] ExtractionExecution.extractEmployees(): extraction information");
        String stringJson = response.getBody().asString();
        JsonObject jsonObject = new JsonParser().parse(stringJson).getAsJsonObject();
        JsonArray jsonArray = (JsonArray) jsonObject.get("data");
        Gson gson = new Gson();
        Type listType = new TypeToken<List<EmployeesEntity>>(){}.getType();
        List<EmployeesEntity> employeesList = gson.fromJson(jsonArray, listType);
        System.out.println("[DEBUG] ExtractionExecution.extractEmployees(): list size ".concat(String.valueOf(employeesList.size())));
        return employeesList;
    }

    public static void saveList(List<EmployeesEntity> employeesList) {
        for (EmployeesEntity employee: employeesList) {
            employee.insert();
        }
    }

}
