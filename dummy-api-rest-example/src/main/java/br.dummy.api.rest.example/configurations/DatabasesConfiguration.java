package br.dummy.api.rest.example.configurations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabasesConfiguration {

    private final String SERVER = "";

    private final String PORT = "";

    private final String DATABASE = "db_dummy_api_rest_example";

    private final String USER = "";

    private final String PASSWORD = "";

    public Connection connection = null;

    public Connection getConnection() {
        try {
            System.out.println("[DEBUG] DatabasesConfiguration.getConnection(): opening connection with database ".concat(DATABASE));
            String url = "jdbc:mysql://".concat(SERVER).concat(":").concat(PORT).concat("/").concat(DATABASE).concat("?useTimezone=true&serverTimezone=UTC");
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection(url, USER,PASSWORD);
            System.out.println("[DEBUG] DatabasesConfiguration.getConnection(): connection opened successfully");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return this.connection;
    }

    public void closeConnection(Connection connection) {
        try {
            System.out.println("[DEBUG] DatabasesConfiguration.closeConnection(): closing connection");
            connection.close();
            System.out.println("[DEBUG] DatabasesConfiguration.closeConnection(): connection closed successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}