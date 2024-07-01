package net.javaguides.springboot_backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionTest {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/ems?useSSL=false";
        String username = "root";
        String password = "Mysql123";

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            if(connection != null) {
                System.out.println("Connected to database");
            } else {
                System.out.println("failed");
            }
        }
    }
}
