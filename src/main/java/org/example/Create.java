package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class Create {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;

        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:src/main/resources/database/Attendance.db");

            statement = connection.createStatement();

            String sql_grade = "INSERT INTO Grade (className) VALUES (?)";
            statement.executeUpdate(sql_grade);

            String sql1 = "INSERT INTO User (username, password) VALUES (?, ?)";
            statement.executeUpdate(sql1);

            String sql2 = "INSERT INTO Attendance (classId, userId, status) VALUES (?,?,?)";
            statement.executeUpdate(sql2);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
