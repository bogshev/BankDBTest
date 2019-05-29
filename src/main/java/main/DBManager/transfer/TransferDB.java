package main.DBManager.transfer;

import main.DBManager.ConnectionToDB;

import java.sql.SQLException;
import java.sql.Statement;

public class TransferDB {

    public static void action(String id, int balance) {
        try (Statement statement = ConnectionToDB.connection.createStatement()) {
            statement.execute("UPDATE users SET balance = '" + balance + "' WHERE id = '" + id + "'");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
