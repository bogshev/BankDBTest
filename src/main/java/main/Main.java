package main;

import main.ActionsOnUser.AddUser;
import main.Actions.HeatingUp;
import main.ActionsOnUser.Delete;
import main.ActionsOnUser.UsersRepository;
import main.ActionsOnUser.TransferMoney;

import main.DBManager.ConnectionToDB;
import main.util.ScanUtil;

import java.sql.SQLException;


public class Main {


    public static void main(String[] args) throws SQLException {
        ScanUtil scanner = new ScanUtil();
        int n = 7; //length of user id
        HeatingUp.action(n);
        ConnectionToDB.connect();
        do {
            String question1 = "Write down action: \n1.Add User \n2.Delete \n3.Transfer  \n4.Show all users";
            int action = Integer.parseInt(scanner.scan(question1));
            switch (action) {
                case 1:
                    AddUser.choosingToAdd();
                    break;
                case 2:
                    Delete.delete();
                    break;
                case 3:
                    TransferMoney.transfer();
                    break;
                case 4:
                    UsersRepository.getUsers();
                    break;
            }
        } while (scanner.confirm(""));
    }
}
