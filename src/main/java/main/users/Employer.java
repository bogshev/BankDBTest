package main.users;

public class Employer extends BaseUser {


    public Employer(String id) {
        super(id);
        position();
        setBalance(0);
    }

    public Employer(String id, int balance) {
        super(id);
        position();
        setBalance(balance);
    }

    public void iD() {
        System.out.println(getId() + " Employer");
    }

    @Override
    public void position() {
        setPosition(getClass().getSimpleName());
    }

}
