package main.users;


public interface User {
    void iD();

    String getId();

    void setId(String id);

    void balance();

    int getBalance();

    void setBalance(int balance);

    void position();

    String getPosition();

    void setPosition(String id);

    void sendMoney(int amount);

    void gainMoney(int amount);
}
