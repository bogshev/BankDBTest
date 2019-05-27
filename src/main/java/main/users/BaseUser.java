package main.users;

public class BaseUser implements User {
    private String id = "";
    private String position = "";
    private int balance;

    public BaseUser(String id) {
        setId(id);
    }

    ////////////////

    public void iD() {
        System.out.println(id);
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    ////////////////

    public void position() {
        System.out.println(position);
    }

    @Override
    public String getPosition() {
        return position;
    }

    @Override
    public void setPosition(String position) {
        this.position = position;
    }

    ////////////////

    public void balance(){
        System.out.println(balance);
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    ////////////////

    public void sendMoney(int amount) {
        balance = balance - amount;
    }

    public void gainMoney(int amount) {
        balance = balance + amount;
    }

}
