package main.Actions;

import main.DBManager.AddingUsers.AddUser;
import main.Users.User;

import java.util.HashSet;

public class HeatingUp {
    private HashSet<User> eList;
    public HeatingUp(HashSet<User> list){
        eList = list;
    }

    public void action(int n){
        for(int i = 1; i<=2; i++){
            AddUser.addingUser(randomId(n), 500, "Manager");
            AddUser.addingUser(randomId(n), 500, "Employer");
            AddUser.addingUser(randomId(n), 500, "Costumer");
//            eList.add(new Costumer(randomId(n)));
//            eList.add(new Employer(randomId(n)));
//            eList.add(new Manager(randomId(n)));

//            StringBuffer stringBuffer = new StringBuffer("I am not GAY");
//            stringBuffer.delete(stringBuffer.indexOf("not"),stringBuffer.indexOf("not")+3);
//            System.out.println(stringBuffer);
        }
    }
    private String randomId(int n){
        String id = "0123456789";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i<n;i++){
            int index = (int) (id.length()*Math.random());
            sb.append(id.charAt(index));
        }
         return sb.toString();
    }
}
