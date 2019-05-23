package main.Users;


public interface User {
    void iD();

    String getId();

    void setId(String id);

    void balance();

    void position();

    String getPosition();

    void setPosition(String id);

    void sendMoney(int amount);

    void gainMoney(int amount);
}
