package main.DBManager.AddingUsers;

import main.DBManager.ConnectionToDB;

public class AddUser {


    public static void addingUser(String id, int balance, String position) {

        ConnectionToDB.connect();

        if (position == "Manager") {
            AddManager.addingManager(id, balance, position);
        } else if (position == "Employer") {
            AddEmployer.addingEmployer(id, balance, position);
        } else if (position == "Costumer") {
            AddCostumer.addingCostumer(id, balance, position);
        }

    }
}

