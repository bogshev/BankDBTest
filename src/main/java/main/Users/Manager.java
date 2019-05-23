package main.Users;

public class Manager extends BaseUser {


    public Manager(String id) {
        super(id);
        position();
    }

    public void iD() {
        System.out.println(getId() + " Manager");
    }

    @Override
    public void position() {
        setPosition(getClass().getSimpleName());
    }
}
