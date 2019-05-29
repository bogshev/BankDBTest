package main.Actions;

import main.DBManager.AddingUsers.DBAddUser;

public class HeatingUp {

    public static void action(int n) {
        for (int i = 1; i <= 2; i++) {
            DBAddUser.addingUser(randomId(n), 500, "Manager");
            DBAddUser.addingUser(randomId(n), 500, "Employer");
            DBAddUser.addingUser(randomId(n), 500, "Costumer");
//            eList.choosingToAdd(new Costumer(randomId(n)));
//            eList.choosingToAdd(new Employer(randomId(n)));
//            eList.choosingToAdd(new Manager(randomId(n)));

//            StringBuffer stringBuffer = new StringBuffer("I am not GAY");
//            stringBuffer.delete(stringBuffer.indexOf("not"),stringBuffer.indexOf("not")+3);
//            System.out.println(stringBuffer);
        }
    }

    private static String randomId(int n) {
        String id = "0123456789";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int index = (int) (id.length() * Math.random());
            sb.append(id.charAt(index));
        }
        return sb.toString();
    }
}
