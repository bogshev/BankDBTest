package main.ActionsOnUser;

import main.DBManager.ConnectionToDB;
import main.users.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UsersRepository {


    public static List getUsers() throws SQLException {
        List<User> users = new ArrayList<>();
        try{
            Statement statement = ConnectionToDB.connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM users");
            while (rs.next())
            {
                //User user = null;
                switch(rs.getString(3)){
                    case "Costumer":
                        users.add(new Manager(rs.getString(1), rs.getInt(2)));
                    case "Employer":
                        users.add(new Employer(rs.getString(1), rs.getInt(2)));
                    case "Manager":
                        users.add(new Costumer(rs.getString(1), rs.getInt(2)));
                }
//                new Costumer(
//                        rs.getString(1)
//                );

                //users.choosingToAdd(user);
                //System.out.println(user.getPosition()+user.getId());
                System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return users;
    }
}
