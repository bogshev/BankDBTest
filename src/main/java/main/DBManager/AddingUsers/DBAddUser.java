package main.DBManager.AddingUsers;

import main.DBManager.ConnectionToDB;

public class DBAddUser {


    public static void addingUser(String id, int balance, String position) {

        ConnectionToDB.connect();

        if (position == "Manager") {
            DBAddManager.addingManager(id, balance, position);
        } else if (position == "Employer") {
            DBAddEmployer.addingEmployer(id, balance, position);
        } else if (position == "Costumer") {
            DBAddCostumer.addingCostumer(id, balance, position);
        }

    }
}

