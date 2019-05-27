package main.DBManager.AddingUsers;

import main.DBManager.ConnectionToDB;

import java.sql.SQLException;
import java.sql.Statement;

public class DBAddCostumer {
    public static void addingCostumer(String id, int balance, String position) {
        try (Statement statement = ConnectionToDB.connection.createStatement()) {
            statement.execute("INSERT INTO users(id, balance, position) VALUES('" + id + "', '" + balance + "', " + "'" + position + "')");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
