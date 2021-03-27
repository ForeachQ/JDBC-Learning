package org.example;

import java.sql.*;
import java.util.LinkedList;

public class Main {

    public static final String DBNAME = Constants.DBNAME;
    public static final String USERNAME = Constants.USERNAME;
    public static final String PASSWORD = Constants.PASSWORD;

    public static void main(String[] args) throws SQLException {

        LinkedList<User> users = new LinkedList<>();

        try (Connection connection = DBConnector.getConnection(DBNAME, USERNAME, PASSWORD);
                Statement statement = connection.createStatement()) {

            String query = "select * from users";
            ResultSet result = statement.executeQuery(query);

            while (result.next()) {
                User newUser = new User();
                newUser.setName(result.getString("name"));
                newUser.setEmail(result.getString("email"));
                newUser.setPassword(result.getString("password"));
                users.add(newUser);
            }
        }

        for (User user : users) {
            System.out.println(user);
        }
    }
}
