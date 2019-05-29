package main.ActionsOnUser;

import main.DBManager.AddingUsers.DBAddUser;
import main.util.ScanUtil;


public class AddUser {

    public static void choosingToAdd() {
        ScanUtil scanner = new ScanUtil();
        String addId = scanner.scan("Type id");
        int position = Integer.parseInt(scanner.scan("Type job: \n1.Manager\n2.Employer\n3.Costumer"));
        int balance = Integer.parseInt(scanner.scan("Enter amount of bank credit"));
        adding(addId, balance, position);
    }

    public static void adding(String addId, int balance, int job) {

        if (job == 1) {
            DBAddUser.addingUser(addId, balance, "Manager");
        } else if (job == 2) {
            DBAddUser.addingUser(addId, balance, "Employer");
        } else if (job == 3) {
            DBAddUser.addingUser(addId, balance, "Costumer");
        }
    }
}
