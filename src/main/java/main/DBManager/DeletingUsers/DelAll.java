package main.DBManager.DeletingUsers;

import main.DBManager.ConnectionToDB;

import java.sql.SQLException;
import java.sql.Statement;

public class DelAll {
    public static void deletingAnnihilation() {
        ConnectionToDB.connect();
        try (Statement statement = ConnectionToDB.connection.createStatement()) {
            statement.execute("DELETE FROM users");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
