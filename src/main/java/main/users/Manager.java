package main.users;

public class Manager extends BaseUser {


    public Manager(String id) {
        super(id);
        position();
        setBalance(0);
    }

    public Manager(String id, int balance) {
        super(id);
        position();
        setBalance(balance);
    }

    public void iD() {
        System.out.println(getId() + " Manager");
    }

    @Override
    public void position() {
        setPosition(getClass().getSimpleName());
    }

}
