package main;

import main.DBManager.AddingUsers.AddUser;
import main.Actions.HeatingUp;
import main.Actions.Transfer;
import main.DBManager.DeletingUsers.DelAll;
import main.DBManager.DeletingUsers.DelUser;
import main.Users.User;

import java.util.HashSet;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 7; //length of user id
        String answer;

        HashSet<User> info = new HashSet<>();
//        AddUser manager = new AddUser();
//        info.add(new Costumer("cos"));
//        info.add(new Employer("emp"));            ////hardcoded users
//        info.add(new Manager("man"));

        HeatingUp toHeat = new HeatingUp(info);
        toHeat.action(n);

        do {
            System.out.println("Write down action: \n1.Add \n2.Delete \n3.Transfer \n4.List");

            int action = scan.nextInt();
            User user1 = null;
            User user2 = null;


            switch (action) {
//ADD
                case 1:
                    System.out.println("Type id");
                    String addId = scan.next();
                    System.out.println("Type job: \n1.Manager\n2.Employer\n3.Costumer");
                    int job = scan.nextInt();

                    if (job == 1) {
//                        info.add(new Manager(addId));
                        AddUser.addingUser(addId, 500, "Manager");
                    } else if (job == 2) {
//                        info.add(new Employer(addId));
                        AddUser.addingUser(addId, 500, "Employer");
                    } else if (job == 3) {
//                        info.add(new Costumer(addId));
                        AddUser.addingUser(addId, 500, "Costumer");
                    }
                    break;

//DELETE

                case 2:

                    System.out.println("Delete only one or all of the users? 1|2");
                    int scanDel = scan.nextInt();
                    if (scanDel == 1) {

                        System.out.println("Type name");
                        String delId = scan.next();
                        DelUser.deletingUser(delId);
                        System.out.println(delId + " deleted");

                    } else if (scanDel == 2) {
                        System.out.println("Are you sure? Y|N");
                        String askAgain = scan.next();
                        if (askAgain.toLowerCase().contains("y")) {
                            DelAll.deletingAnnihilation();
                        } else {
                            System.out.println("I guess you said no...");
                        }
                    }

                    break;
//TRANSFER

                case 3:
                    System.out.println("Acceptable users to transfer:");
                    for (User user : info) System.out.println(user.getId());

                    System.out.println("\n" + "Enter ID of a sender");
                    Scanner scanS = new Scanner(System.in);
                    String iDS = scanS.next();

                    System.out.println("Enter ID of a gainer");
                    Scanner scanG = new Scanner(System.in);
                    String iDG = scanG.next();

                    for (User user : info) {

                        if (user.getId().equals(iDS)) {
                            user1 = user;
                        } else if (user.getId().equals(iDG)) {
                            user2 = user;
                        }
                    }

                    if (user1 == null || user2 == null) {
                        System.out.println("Wrong credentials");
                        System.exit(0);
                    }

                    System.out.println("Amount to transfer: ");
                    Scanner scanAmount = new Scanner(System.in);
                    int amount = scanAmount.nextInt();
                    Transfer.action(user1, user2, amount);
                    break;

//LIST

                case 4:
                    for (User user : info) {
                        user.iD();
                        user.balance();
                    }

                    break;


            }
            System.out.println("Continue? Y/N");
            answer = scan.next();
        } while (answer.toLowerCase().contains("y"));

    }
}
