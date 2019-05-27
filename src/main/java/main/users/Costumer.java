package main.users;

public class Costumer extends BaseUser {


    public Costumer(String id) {
        super(id);
        position();
        setBalance(0);
    }

    public Costumer(String id, int balance) {
        super(id);
        position();
        setBalance(balance);
    }

    public void iD() {
        System.out.println(getId() + " Costumer");
    }

    @Override
    public void position() {
        setPosition(getClass().getSimpleName());
    }
}
