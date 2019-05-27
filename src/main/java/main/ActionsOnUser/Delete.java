package main.ActionsOnUser;

import main.DBManager.DeletingUsers.DelAll;
import main.DBManager.DeletingUsers.DelUser;
import main.util.ScanUtil;

public class Delete {
    public static void delete() {
        ScanUtil scanner = new ScanUtil();

        int scanDel = Integer.parseInt(scanner.scan("Delete only one or all of the users? 1|2"));
        if (scanDel == 1) {

            String delId = scanner.scan("Type name");
            DelUser.deletingUser(delId);
            System.out.println(delId + " deleted");

        } else if (scanDel == 2) {
            String askAgain = scanner.scan("Are you sure? Y|N");
            if (askAgain.toLowerCase().contains("y")) {
                DelAll.deletingAnnihilation();
            } else {
                System.out.println("I guess you said no...");
            }
        }

    }
}
