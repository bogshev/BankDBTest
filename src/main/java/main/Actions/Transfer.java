package main.Actions;

import main.DBManager.transfer.TransferDB;
import main.users.*;

public class Transfer {
    public static void action(User iDS, User iDG, int amount) {
        if (iDS instanceof Manager) {
            int tax = 5;
            iDS.sendMoney(amount + (amount / 100 * tax));
        } else if (iDS instanceof Employer) {
            int tax = 10;
            iDS.sendMoney(amount + (amount / 100 * tax));
        } else if (iDS instanceof Costumer) {
            int tax = 15;
            iDS.sendMoney(amount + (amount / 100 * tax));
        }
        iDG.gainMoney(amount);
        TransferDB.action((iDS.getId()), iDS.getBalance());
        TransferDB.action((iDG.getId()), iDG.getBalance());

    }
}