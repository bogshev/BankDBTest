package main.DBManager.AddingUsers;

import main.DBManager.ConnectionToDB;

import java.sql.SQLException;
import java.sql.Statement;

public class DBAddManager {
    public static void addingManager(String id, int balance, String position) {
        try (Statement statement = ConnectionToDB.connection.createStatement()) {
            statement.execute("INSERT INTO users(id, balance, position) VALUES('" + id + "', '" + balance + "', " + "'" + position + "')");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

