package main.ActionsOnUser;

import main.DBManager.ConnectionToDB;
import main.users.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class GetUser {
    public static User getUserByID(String id) throws SQLException {
        User user = null;

        try {
            Statement statement = ConnectionToDB.connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM users WHERE ID = '" + id + "'");
            while (rs.next()) {
                //User user = null;
                switch (rs.getString(3)) {
                    case "Manager":
                        user = (new Manager(rs.getString(1), rs.getInt(2)));
                    case "Employer":
                        user = (new Employer(rs.getString(1), rs.getInt(2)));
                    case "Costumer":
                        user = (new Costumer(rs.getString(1), rs.getInt(2)));
                }
//                new Costumer(
//                        rs.getString(1)
//                );

                //users.choosingToAdd(user);
                //System.out.println(user.getPosition()+user.getId());
                System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return user;
    }
}
