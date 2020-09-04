package br.dummy.api.rest.example.entities;

import br.dummy.api.rest.example.configurations.DatabasesConfiguration;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeesEntity {


    public EmployeesEntity(int id, String name, Long employee_salary, int employee_age, String profile_image) {
        this.id = id;
        this.employee_name = name;
        this.employee_salary = employee_salary;
        this.employee_age = employee_age;
        this.profile_image = (profile_image != null) ? profile_image : "";
    }

    private int id;

    private String employee_name;

    private Long employee_salary;

    private int employee_age;

    private String profile_image;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Long getEmployee_salary() {
        return employee_salary / 100;
    }

    public void setEmployee_salary(Long employee_salary) {
        this.employee_salary = employee_salary;
    }

    public int getEmployee_age() {
        return employee_age;
    }

    public void setEmployee_age(int employee_age) {
        this.employee_age = employee_age;
    }

    public String getProfile_image() {
        return profile_image;
    }

    public void setProfile_image(String profile_image) {
        this.profile_image = profile_image;
    }

    public void insert() {
        try {
            System.out.println("[DEBUG] EmployeesEntity.insert(): inserting employee");
            DatabasesConfiguration database = new DatabasesConfiguration();
            Connection connection = new DatabasesConfiguration().getConnection();
            String command = "INSERT INTO tb_employees values (?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(command);
            statement.setInt(1, this.id);
            statement.setString(2, this.employee_name);
            statement.setLong(3, this.employee_salary);
            statement.setInt(4, this.employee_age);
            statement.setString(5, this.profile_image);
            statement.execute();
            database.closeConnection(connection);
            System.out.println("[DEBUG] EmployeesEntity.insert(): employee inserted successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}