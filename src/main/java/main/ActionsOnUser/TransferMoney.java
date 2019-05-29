package main.ActionsOnUser;

import main.Actions.Transfer;
import main.users.User;
import main.util.ScanUtil;


import java.sql.SQLException;


public class TransferMoney {
    public static void transfer() throws SQLException {
        User user1 = null;
        User user2 = null;
        ScanUtil scanner = new ScanUtil();

        System.out.println("Acceptable users to transfer:");
        UsersRepository.getUsers();
        String iDS = scanner.scan("\n" + "Enter ID of a sender");
        user1 = GetUser.getUserByID(iDS);
        String iDG = scanner.scan("Enter ID of a gainer");
        user2 = GetUser.getUserByID(iDG);
//        if (user1 == null && user2 == null){
//            System.out.println("wrong credentials");
//            System.exit(3);
//        }

//        Statement statement = ConnectionToDB.connection.createStatement();
//        ResultSet rs1 = statement.executeQuery("GET * WHEN ID = " + iDS);
//
//        ResultSet rs2 = statement.executeQuery("GET * WHEN ID = " + iDG);
//
//        for (User user : info) {
//
//            if (user.getId().equals(iDS)) {
//                user1 = user;
//            } else if (user.getId().equals(iDG)) {
//                user2 = user;
//            }
//        }
//
//        if (user1 == null || user2 == null) {
//            System.out.println("Wrong credentials");
//            System.exit(0);
//        }
        int amount = Integer.parseInt(scanner.scan("Amount to transfer: "));
        Transfer.action(user1, user2, amount);

    }
}
