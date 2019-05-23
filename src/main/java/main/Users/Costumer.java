package main.Users;

public class Costumer extends BaseUser {


    public Costumer(String id) {
        super(id);
        position();
    }

    public void iD() {
        System.out.println(getId() + " Costumer");
    }

    @Override
    public void position() {
        setPosition(getClass().getSimpleName());
    }
}
