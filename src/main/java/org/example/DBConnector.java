package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector{
    public static Connection getConnection(String dbname, String username, String password) throws SQLException{
        String url = "jdbc:mysql://localhost:3306/" + dbname;
        Connection cursor = DriverManager.getConnection(url, username, password);

        return cursor;
    }
}
