package main.Users;

public class Employer extends BaseUser {


    public Employer(String id) {
        super(id);
        position();
    }

    public void iD() {
        System.out.println(getId() + " Employer");
    }

    @Override
    public void position() {
        setPosition(getClass().getSimpleName());
    }
}
