package main.DBManager.DeletingUsers;

import main.DBManager.ConnectionToDB;

import java.sql.SQLException;
import java.sql.Statement;

public class DelUser {
    public static void deletingUser(String id) {

        try (Statement statement = ConnectionToDB.connection.createStatement()) {
            statement.execute("delete from users where id = " + id);

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
