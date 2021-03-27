package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

class DBConnectorTest {

    @Test
    @DisplayName("Connection test")
    void getConnection() {
        try{
            DBConnector.getConnection(
                    Constants.DBNAME, Constants.USERNAME, Constants.PASSWORD);
        } catch(SQLException e){
            fail("Connection to DB failed");
        }
    }
}